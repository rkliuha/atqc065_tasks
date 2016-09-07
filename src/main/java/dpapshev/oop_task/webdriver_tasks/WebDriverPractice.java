package dpapshev.oop_task.webdriver_tasks;


        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.firefox.FirefoxDriver;
        import org.testng.Assert;

        import org.testng.annotations.AfterTest;
        import org.testng.annotations.BeforeTest;
        import org.testng.annotations.Test;

        import java.io.IOException;
        import java.util.concurrent.TimeUnit;

public class WebDriverPractice {
    private WebDriver driver;
    String whatDoIWantToSearch;

    @BeforeTest
    public void beforTest() {
        driver = new FirefoxDriver();
        GoogleStartPage startPage = new GoogleStartPage(driver);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("http://google.com.ua/");
    }

    @AfterTest
    public void closeTests() {
        driver.close();
    }

    //Search for a search term: «funny picture»
    //Verify that first link has «funny picture» text in it
    @Test(priority = 0)
    public void testSearchingByText() throws InterruptedException {
        GoogleStartPage startPage = new GoogleStartPage(driver);
        GoogleResultPage resultPage = startPage
                .googleSearch("funny picture");
        Assert
                .assertTrue(resultPage
                        .getFirstLinkText()
                        .contains("Funny Picture"));
    }

    //Search for a search term: «funny picture»
    //Verify that first link has «funny picture» text in it
    @Test(priority = 1)
    public void testVerifyQuantityOfImages() throws IOException, InterruptedException {
        GoogleStartPage startPage = new GoogleStartPage(driver);
        GoogleResultPage resultPage = startPage
                .googleSearch("funny picture")
                .clickOnTheButton(GoogleResultPage.BUTTON_IMAGES)
                .doTheScreenshot();
        Assert
                .assertTrue(resultPage
                        .getIfQuantityOfImagesAtLeastTrue(5));
    }

    //Return to Google homepage
    //Verify that Google logo is displayed
    @Test(priority = 2)
    public void testGoogleLogoIsDisplayed() {
        driver.get("http://google.com.ua/");
        GoogleStartPage startPage = new GoogleStartPage(driver);
        Assert.
                assertNotNull(startPage.
                        getGoogleLogo());
    }

    //Hide the Google logo
    //Verify that Google logo is not displayed
    @Test(priority = 3)
    public void testGoogleLogoIsHidden() {
        GoogleStartPage startPage = new GoogleStartPage(driver);
        startPage
                .hideGoogleLogo();
        Assert
                .assertFalse(startPage
                        .getGoogleLogo()
                        .isDisplayed());
    }

    //Do a search on «funny kitten picture»
    //Verify that first link has «funny kitten picture» text in it
    @Test(priority = 4)
    public void testSearchingByText1() {
        GoogleStartPage startPage = new GoogleStartPage(driver);
        GoogleResultPage resultPage = startPage
                .googleSearch("funny kitten picture");
        Assert.
                assertTrue(resultPage
                        .getFirstLinkText()
                        .contains("Funny Kitten Picture"));
    }


    //Change first search result link's color to any random color
    //Verify the color is changed.
    @Test(priority = 5)
    public void testIsLinkColorChanged() {
        GoogleStartPage startPage = new GoogleStartPage(driver);
        GoogleResultPage resultPage = startPage
                .googleSearch("funny kitten picture")
                .changeLinkColor("black");
        Assert.assertNotSame(resultPage.realLincColor(), resultPage.getNormalColor());
    }
}
