package kmarko.webdriver_tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
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
                .getFirstLink().toLowerCase().contains("funny picture"));

        final GoogleImageSearchResultPage imageTab =
                funnyPictureSearchResultPage.getImageResultTab();
        Assert.assertTrue(imageTab.searchImageElements(5));
        imageTab.takeScreenshot();

        imageTab.openGoogleMainPage();
        Assert.assertTrue(homePage.findGoogleLogo());
        homePage.hideGoogleLogo();
        Assert.assertFalse(homePage.findGoogleLogo());

        final GoogleSearchResultPage funnyKittenSearchResultPage = homePage
                .inputInSearchField("funny kitten picture");
        Assert.assertTrue(funnyKittenSearchResultPage.getFirstLink()
                .toLowerCase().contains("funny kitten picture"));
        funnyKittenSearchResultPage.changeLinkColor("red");
        Assert.assertTrue(funnyKittenSearchResultPage.verifyLinkColor("red"));
    }
}
