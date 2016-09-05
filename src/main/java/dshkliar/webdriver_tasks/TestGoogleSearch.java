package dshkliar.webdriver_tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestGoogleSearch {
    private WebDriver driver;

    @BeforeTest
    public void preConditions() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.google.com.ua");
    }

    @Test
    public void funnyPictureSearch() {
        final HomePage home = new HomePage(driver);
        final ResultPage result = home.search("funny picture");
        Assert.assertTrue(result.getFirstLink().toLowerCase().contains("funny picture"));
    }

    @Test(dependsOnMethods = {"funnyPictureSearch"})
    public void testImageTab() {
        final ResultPage result = new ResultPage(driver);
        final ResultImageTab resultImage = result.goToImageTab();
    }

    @Test(dependsOnMethods = {"testImageTab"})
    public void listsOfImages() {
        final ResultImageTab resultImage = new ResultImageTab(driver);
        Assert.assertTrue(resultImage.getListsOfImages(5));
    }

    @Test(dependsOnMethods = {"listsOfImages"})
    public void getScreenShot() throws IOException {
        final ResultImageTab resultImageTab = new ResultImageTab(driver);
        resultImageTab.getScreenShot("c:\\SoftServe\\Projects\\Task_10_screenshot.png");
    }

    @Test(dependsOnMethods = {"getScreenShot"})
    public void goIntoHomePage() {
        final ResultImageTab resultImageTab = new ResultImageTab(driver);
        final HomePage home = resultImageTab.goIntoHomePage();
    }

    @Test(dependsOnMethods = {"goIntoHomePage"})
    public void verifyDisplayedLogo() {
        final HomePage home = new HomePage(driver);
        Assert.assertTrue(home.verifyLogo());
    }

    @Test(dependsOnMethods = {"verifyDisplayedLogo"})
    public void hideLogo() {
        final HomePage home = new HomePage(driver);
        home.visibilityOfLogo("hidden");
    }

    @Test(dependsOnMethods = {"hideLogo"})
    public void verifyNotDisplayedLogo() {
        final HomePage home = new HomePage(driver);
        Assert.assertFalse(home.verifyLogo());
    }

    @Test(dependsOnMethods = {"verifyNotDisplayedLogo"})
    public void funnyKitten() {
        final HomePage home = new HomePage(driver);
        final ResultPage result = home.search("funny kitten picture");
        Assert.assertTrue(result.getFirstLink().toLowerCase().contains("funny kitten picture"));
    }

    @Test(dependsOnMethods = {"funnyKitten"})
    public void changeColor() {
        final ResultPage result = new ResultPage(driver);
        result.changeFirstLinkColor("white");
    }

    @Test(dependsOnMethods = {"changeColor"})
    public void verifyColor() {
        final ResultPage result = new ResultPage(driver);
        Assert.assertTrue(result.verifyFirstLinkColor("white"));
    }

    @AfterTest
    public void postCondition() {
        driver.close();
    }

}
