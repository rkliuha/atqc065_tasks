package okornienko.webdriver_tasks;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class WebdriverPractice {
    private final FirefoxDriver firefox = new FirefoxDriver();
    private final GoogleHomePage googleHomePage = new GoogleHomePage(firefox);
    private final GoogleSearchPage googleSearchPage = new GoogleSearchPage(firefox);

    @BeforeTest
    final public void driverSetUp() {
        firefox.manage().window().maximize();
        firefox.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void startTest() throws InterruptedException, IOException {
        googleHomePage
                .openHomePage()
                .pause()
                .enterText("funny picture")
                .clickSearchButton()
                .pause();
        assertTrue(
                googleSearchPage
                        .checkIfContainsText("funny picture")
        );
        googleSearchPage
                .clickPicturesButton()
                .pause();
        assertTrue(googleSearchPage.getPicturesSize() >= 5);
        googleSearchPage
                .makeScreenshot();
        googleHomePage
                .openHomePage()
                .pause();
        assertTrue(googleHomePage.checkIfDisplayedLogo());
        googleHomePage
                .hideElementLogo()
                .pause();
        assertFalse(googleHomePage.checkIfDisplayedLogo());
        googleHomePage
                .enterText("funny kitten picture")
                .pause()
                .clickSearchButton()
                .pause();
        assertTrue(googleSearchPage.checkIfContainsText("Funny Kitten Picture"));
        googleSearchPage
                .changeColor("black")
                .pause();
        assertFalse(googleSearchPage.checkIfContainsFirstLink());
    }

    @AfterTest
    private void quit() {
        firefox.quit();
    }

}


