package okornienko.webdriver_tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

class GoogleHomePage {

    private FirefoxDriver driver;
    private final String google = "https://www.google.com.ua";
    private final String searchField = "//input[@id='lst-ib']";
    private final String searchButton = "//button[@class='lsb']";
    private final String logoGoogle = "//div[@id='hplogo']";

    GoogleHomePage(FirefoxDriver driver) {
        this.driver = driver;
    }

    GoogleHomePage openHomePage() {
        driver.get(google);
        return this;
    }

    GoogleHomePage enterText(final String text) {
        driver.findElement(By.xpath(searchField)).sendKeys(text);
        return this;
    }

    GoogleHomePage clickSearchButton() {
        driver.findElement(By.xpath(searchButton)).click();
        return this;
    }

    GoogleHomePage pause() throws InterruptedException {
        Thread.sleep(1500);
        return this;
    }

    boolean checkIfDisplayedLogo() {
        return driver.findElement(new By.ByXPath(logoGoogle)).isDisplayed();
    }

    GoogleHomePage hideElementLogo() {
        driver.executeScript("arguments[0].style.visibility='hidden'", driver.findElementByXPath(logoGoogle));
        return this;
    }

}
