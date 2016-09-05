package ksichenko.oop_task.webdriver_tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertTrue;

public class GooglePageTest {

    private WebDriver driver;

    @BeforeTest
    public void setUp() {

        driver = new FirefoxDriver();

        driver.
                manage().
                timeouts().
                implicitlyWait(30, TimeUnit.SECONDS);

        driver
                .get("https://www.google.com");
    }

    @AfterTest
    public void ternDown() {

        driver.close();
    }

    @Test
    public void googlePageTest() {

        final GoogleHomePage homePage = new GoogleHomePage(driver);

        final ResultPage resultPage = homePage
                .searchPageFunnyPictures("funny pictures");

        Assert.assertTrue(resultPage
                .getFunnyPictures()
                .toLowerCase()
                .contains("funny pictures"));
    }

    @Test(dependsOnMethods = "googlePageTest")
    public void googlePageTest1() {

        final GoogleHomePage homePage = new GoogleHomePage(driver);

        final ResultPage resultPage = homePage
                .searchFirstFivePageFunnyPictures("funny pictures");

        Assert.assertTrue(resultPage
                .getFirstFiveFunnyPictures()
                .isDisplayed());
    }

    @Test(dependsOnMethods = "googlePageTest1")
    public void googlePageTest2() {

        final GoogleHomePage homePage = new GoogleHomePage(driver);

        final ResultPage resultPage = homePage
                .searchGoogleLogo();

        Assert.assertTrue(resultPage
                .getGoogleLogo()
                .isDisplayed());

        final ResultPage resultPage1 = homePage
                .searchGoogleLogo();

        Assert.assertFalse(resultPage1
                .getHidedGoogleLogo()
                .isDisplayed());
    }

    @Test(dependsOnMethods = "googlePageTest2")
    public void googlePageTest3() {

        final GoogleHomePage homePage = new GoogleHomePage(driver);

        final ResultPage resultPage = homePage
                .searchFunnyKittenPicturesPage("funny kitten picture");

        Assert.assertTrue(resultPage
                .getFunnyKittenPicturesPage()
                .toLowerCase()
                .contains("funny kitten picture"));

        final ResultPage resultPage1 = homePage
                .searchFunnyKittenPicturesPage("funny kitten picture");

        Assert.assertTrue(resultPage1
                .getChangedFunnyKittenPicturesLink()
                .getAttribute("style")
                .contains("black"));
    }

}

