package okornienko;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import java.io.File;
import java.io.IOException;
import static org.testng.AssertJUnit.assertTrue;

public class WebdriverPractice {

    private final FirefoxDriver driverFirefox = new FirefoxDriver();
    private int time = 1500;
    private int bigTime = 3000;


    @Test
    public void startTest() throws InterruptedException, IOException {
        goToUrl("https://www.google.com.ua");
        enterTextUsingXPath("//input[@id='lst-ib']", "funny picture");
        clickUsingXPath("//button[@class='lsb']");
        pause(time);
        assertTrue(checkIfContainsTextUsingXPath("//h3 [@class='r'][1]/a[1]",
                "funny picture"));
        pause(time);
        clickUsingXPath("//div[@class='_Icb _kk _wI']/a");
        pause(time);
        for (int i = 1; i<=5; i++){
            assertTrue(createWebElementUsingXPath("//div[@class = " +
                    "'rg_di rg_bx rg_el ivg-i'][" + i+"]").isDisplayed());
        }
        final File sourceFile = driverFirefox.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(sourceFile, new File("e:\\screenshot.png"));
        pause(time);
        goToUrl("https://www.google.com.ua");
        pause(time);
        final WebElement logo = createWebElementUsingXPath("//div[@id='hplogo']");
        assertTrue(logo.isDisplayed());
        driverFirefox.executeScript("arguments[0].style.visibility='hidden'", logo);
        pause(time);
        assertTrue(!logo.isDisplayed());
        enterTextUsingXPath("//input[@id='lst-ib']", "funny kitten picture");
        pause(time);
        clickUsingXPath("//button[@class='lsb']");
        pause(bigTime);
        assertTrue(checkIfContainsTextUsingXPath("//h3 [@class='r'][1]/a[1]",
                "Funny Kitten Picture"));
        final WebElement link = createWebElementUsingXPath("//h3 [@class='r'][1]/a[1]");
        driverFirefox.executeScript("arguments[0].style.color='black'", link);
        final String linkColor = link.getCssValue("color");
        System.out.println(linkColor);
        assertTrue(!linkColor.equals("rgba(26, 13, 171, 1)"));
        pause(time);
        end();
    }

    private void goToUrl(final String url) {
        driverFirefox.get(url);
    }

    private WebElement createWebElementUsingXPath(final String firePath) {
        return driverFirefox.findElement(new By.ByXPath(firePath));
    }

    private void enterTextUsingXPath(final String firePath, final String text) {
        driverFirefox.findElement(new By.ByXPath(firePath)).sendKeys(text);
    }

    private void clickUsingXPath(final String firePath) {
        driverFirefox.findElement(new By.ByXPath(firePath)).click();
    }

    private boolean checkIfContainsTextUsingXPath(final String firePath, final String text) {
        return driverFirefox.findElement(new By.ByXPath(firePath)).getText().contains(text);
    }

    private void pause(final int time) throws InterruptedException {
        Thread.sleep(time);
    }

    private void end() {
        driverFirefox.close();
        driverFirefox.quit();
    }
}


