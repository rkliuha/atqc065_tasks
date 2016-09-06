package kmarko.webdriver_tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestsGoogleSearch {

    private WebDriver driver;

    @BeforeTest
    final public void SetUp() {
        driver = new FirefoxDriver();
        driver.navigate().to("https://google.com");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @AfterTest
    final public void tearDown() {
        driver.close();
    }

    @Test
    final public void testGoogleSearch() throws IOException {
        final GoogleHomePage homePage = new GoogleHomePage(driver);
        final GoogleSearchResultPage funnyPictureSearchResultPage =
                homePage.inputInSearchField("funny picture");
        Assert.assertTrue(funnyPictureSearchResultPage
                .getFirstLinkText().toLowerCase().contains("funny picture"));

        final GoogleImageSearchResultPage imageTab =
                funnyPictureSearchResultPage.goToImageResultPage();
        final List<WebElement> images = imageTab.getImageElementsList();
        images.stream().limit(5)
                .forEach(WebElement -> Assert.assertTrue(WebElement.isDisplayed()));
        imageTab.takeScreenshot();

        imageTab.goToGoogleMainPage();
        Assert.assertTrue(homePage.IsGoogleLogo());
        homePage.hideGoogleLogo();
        Assert.assertFalse(homePage.IsGoogleLogo());

        final GoogleSearchResultPage funnyKittenSearchResultPage = homePage
                .inputInSearchField("funny kitten picture");
        Assert.assertTrue(funnyKittenSearchResultPage.getFirstLinkText()
                .toLowerCase().contains("funny kitten picture"));
        funnyKittenSearchResultPage.changeLinkColor("red");
        Assert.assertTrue(funnyKittenSearchResultPage
                .getLinkColorAttribute().contains("red"));
    }
}
