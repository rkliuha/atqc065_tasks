package okornienko.webdriver_tasks;

import org.testng.annotations.*;

import java.io.IOException;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class WebdriverPractice {

    private final String google = "https://www.google.com.ua";
    private final String searchField = "//input[@id='lst-ib']";
    private final String searchButton = "//button[@class='lsb']";
    private final String firstLink = "//h3 [@class='r'][1]/a[1]";
    private final String picturesButton = "//div[@class='_Icb _kk _wI']/a";
    private final String picture = "//div[@class = 'rg_di rg_bx rg_el ivg-i'][";
    private final String logoGoogle = "//div[@id='hplogo']";
    private final String blackColor = "black";
    private final String file = "e:\\screenshot.png";
    private final MethodsBuilder run = new MethodsBuilder();

    @Test
    public void startTest() throws InterruptedException, IOException {

        assertTrue(run
                .pause()
                .goToUrl(google)
                .pause()
                .enterTextByXPath(searchField, "funny picture")
                .pause()
                .clickUsingXPath(searchButton)
                .pause()
                .checkIfContainsTextUsingXPath(firstLink, "funny picture"));

        assertTrue(run
                .clickUsingXPath(picturesButton)
                .pause()
                .checkAllDisplayed(picture, 5) // check if 5 pictures are displayed
        );
        assertTrue(run
                .makeScreenshot(file)
                .goToUrl(google)
                .pause()
                .checkIfDisplayed(logoGoogle)
        );
        assertFalse(run
                .hideElement(logoGoogle)
                .pause()
                .checkIfDisplayed(logoGoogle)
        );
        assertTrue(run
                .enterTextByXPath(searchField, "funny kitten picture")
                .pause()
                .clickUsingXPath(searchButton)
                .pause()
                .checkIfContainsTextUsingXPath(firstLink, "Funny Kitten Picture")
        );
        assertFalse(run
                .changeColor(firstLink, blackColor)
                .pause()
                .checkLinkColor(firstLink)
        );
    }

    @AfterTest
    private void quit() {
        run.end();
    }

}


