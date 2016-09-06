package ksichenko.webdriver_tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static ksichenko.webdriver_tasks.GoogleHomePage.FUNNY_PICTURES_IMAGES_LINK;
import static ksichenko.webdriver_tasks.GoogleHomePage.GOOGLE_HOME_PAGE;
import static ksichenko.webdriver_tasks.GoogleHomePage.GOOGLE_SEARCH_BUTTON;


public class GooglePageTest {

    public static final int TIMEOUT = 5;

    private WebDriver driver;

    @BeforeTest
    public void setUp() {

        driver = new FirefoxDriver();

        driver.
                manage().
                timeouts().
                implicitlyWait(TIMEOUT, TimeUnit.SECONDS);

        driver
                .get(GOOGLE_HOME_PAGE);
    }

    @AfterTest
    public void ternDown() {

        driver.close();
    }

    @Test
    public void googlePageTest() {

        final GoogleHomePage homePage = new GoogleHomePage(driver);

        final ResultPage resultPage = homePage
                .searchFor("funny pictures");

        homePage
                .click(GOOGLE_SEARCH_BUTTON);

        Assert.assertTrue(resultPage
                .getFunnyPicturesText()
                .toLowerCase()
                .contains("funny pictures"));
    }

    @Test
    public void googlePageTest1() {

        final GoogleHomePage homePage = new GoogleHomePage(driver);

        final ResultPage resultPage = homePage
                .searchFor("funny pictures");
        homePage
                .click(FUNNY_PICTURES_IMAGES_LINK);

        final List<WebElement> elementsList = resultPage.getAllFunnyPictures();

        elementsList
                .stream()
                .limit(5)
                .forEach(webElement -> Assert.assertTrue(webElement.isDisplayed()));
    }

    @Test
    public void googlePageTest2() {

        final GoogleHomePage homePage = new GoogleHomePage(driver);

        final ResultPage resultPage = homePage
                .goToGooglePage();

        Assert.assertTrue(resultPage
                .getGoogleLogo()
                .isDisplayed());

        homePage
                .goToGooglePage();

        Assert.assertFalse(resultPage
                .getHidedGoogleLogo()
                .isDisplayed());
    }

    @Test
    public void googlePageTest3() {

        final GoogleHomePage homePage = new GoogleHomePage(driver);

        final ResultPage resultPage = homePage
                .searchFor("funny kitten picture");

        homePage
                .click(GOOGLE_SEARCH_BUTTON);

        Assert.assertTrue(resultPage
                .getFunnyKittenPicturesPageText()
                .toLowerCase()
                .contains("funny kitten picture"));

        homePage
                .searchFor("funny kitten picture");

        homePage
                .click(GOOGLE_SEARCH_BUTTON);

        Assert.assertTrue(resultPage
                .getChangedFunnyKittenPicturesLink()
                .getAttribute("style")
                .contains("black"));
    }

}

