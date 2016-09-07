package dshkliar.webdriver_tasks;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestGoogleSearch {
    private WebDriver driver;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.google.com.ua");
    }

    @Test
    public void funnyPictureSearch() {
        final HomePage home = new HomePage(driver);
        final ResultPage result = home.doSearch("funny picture");
        Assert.assertTrue(result.getFirstLink().toLowerCase().contains("funny picture"));
        result.goToImageTab();
    }

    @Test(dependsOnMethods = {"funnyPictureSearch"})
    public void getImages() throws IOException {
        final ResultImageTab resultImage = new ResultImageTab(driver);
        final List<WebElement> images = resultImage.getListOfImages();
        images.stream()
                .limit(5)
                .forEach(webElement ->
                        Assert.assertTrue(webElement.isDisplayed()));
        resultImage.takeScreenShot("c:\\SoftServe\\Projects\\Task_10_screenshot.png");
        resultImage.goIntoHomePage();
    }

    @Test(dependsOnMethods = {"getImages"})
    public void verifyDisplayedLogo() {
        final HomePage home = new HomePage(driver);
        Assert.assertTrue(home.getLogo().isDisplayed());
        home.hideLogo("hidden");
    }

    @Test(dependsOnMethods = {"verifyDisplayedLogo"})
    public void verifyNotDisplayedLogo() {
        final HomePage home = new HomePage(driver);
        Assert.assertFalse(home.getLogo().isDisplayed());
    }

    @Test(dependsOnMethods = {"verifyNotDisplayedLogo"})
    public void funnyKitten() {
        final HomePage home = new HomePage(driver);
        final ResultPage result = home.doSearch("funny kitten picture");
        Assert.assertTrue(result.getFirstLink().toLowerCase().contains("funny kitten picture"));
        result.changeFirstLinkColor("white");
    }

    @Test(dependsOnMethods = {"funnyKitten"})
    public void verifyColor() {
        final ResultPage result = new ResultPage(driver);
        Assert.assertTrue(result.getFirstLinkColor().contains("blue"));
    }

    @AfterMethod
    public void takeScreenShotOnFailure(final ITestResult testResult) throws IOException {
        if (testResult.getStatus() == ITestResult.FAILURE) {
            final Date currentDate = new Date();
            final Format formatter = new SimpleDateFormat("dd.MM.yyyy_HH-mm");
            final File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("screenshots//" + "Screenshot - " +
                    formatter.format(currentDate) + ".png"));
        }
    }

    @AfterTest
    public void postCondition() {
        driver.close();
    }

}
