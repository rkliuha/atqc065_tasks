package rkliuha.webdriver_tasks;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import rkliuha.webdriver_tasks.pageobjects.HomePage;
import rkliuha.webdriver_tasks.pageobjects.PicturesResultPage;
import rkliuha.webdriver_tasks.pageobjects.SearchResultPage;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class GoogleSearchTesting {

    public static final String HOME_URL = "https://www.google.com.ua";
    public static final String PATH_TO_CHROME_DRIVER = "/chromedriver.exe";
    public static final int TIMEOUT = 5;
    private WebDriver driver;

    @BeforeTest
    public final void setUp() {
        System.setProperty("webdriver.chrome.driver", PATH_TO_CHROME_DRIVER);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
        driver.get(HOME_URL);
    }

    @Test
    public final void testActivities() {
        final HomePage homePage = new HomePage(driver);
        homePage.doSearch("funny picture");

        final SearchResultPage searchResultPage = new SearchResultPage(driver);
        Assert.assertTrue(searchResultPage
                .getTextFromLink(SearchResultPage.PATH_TO_FIRST_LINK)
                .toLowerCase()
                .contains("funny picture"));

        final PicturesResultPage picturesResultPage = searchResultPage
                .goPicturesResult();
        final List<WebElement> pictures = picturesResultPage
                .getListOfPictures();

        pictures
                .stream()
                .limit(5)
                .forEach(webElement ->
                        Assert.assertTrue(webElement.isDisplayed()));

        picturesResultPage
                .takeScreenshot();

        picturesResultPage
                .backToHomePage();

        Assert.assertTrue(homePage
                .getElement(HomePage.PATH_TO_GOOGLE_LOGO)
                .isDisplayed());

        homePage.hideElement(HomePage.PATH_TO_GOOGLE_LOGO);

        Assert.assertFalse(homePage
                .getElement(HomePage.PATH_TO_GOOGLE_LOGO)
                .isDisplayed());

        homePage
                .doSearch("funny kitten picture");

        Assert.assertTrue(searchResultPage
                .getTextFromLink(SearchResultPage.PATH_TO_FIRST_LINK)
                .toLowerCase()
                .contains("funny kitten picture"));

        searchResultPage.changeLinkColor("blue",
                SearchResultPage.PATH_TO_FIRST_LINK);

        Assert.assertTrue(searchResultPage
                .getElement(SearchResultPage.PATH_TO_FIRST_LINK)
                .getAttribute("style")
                .contains("blue"));
    }

    @AfterTest
    public final void tearDown() {
        driver.close();
    }

}
