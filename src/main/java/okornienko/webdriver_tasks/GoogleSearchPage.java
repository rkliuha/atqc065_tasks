package okornienko.webdriver_tasks;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;
import java.util.List;

class GoogleSearchPage {
    private FirefoxDriver driver;
    private final String firstLink = "//h3 [@class='r'][1]/a[1]";
    private final String picturesButton = "//div[@class='_Icb _kk _wI']/a";
    private final String pictures = "//div[@id='rg_s']/div";
    private final String file = "e:\\screenshot.png";

    GoogleSearchPage(FirefoxDriver driver) {
        this.driver = driver;
    }

    boolean checkIfContainsText(final String text) {
        return driver.findElement(By.xpath(firstLink)).getText().contains(text);
    }

    GoogleSearchPage pause() throws InterruptedException {
        Thread.sleep(1500);
        return this;
    }

    GoogleSearchPage clickPicturesButton() {
        driver.findElement(By.xpath(picturesButton)).click();
        return this;
    }

    int getPicturesSize() {
        List<WebElement> picturesList = driver.findElements(By.xpath(pictures));
        return picturesList.size();
    }

    GoogleSearchPage makeScreenshot() throws IOException {
        final File sourceFile = driver.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(sourceFile, new File(file));
        return this;
    }

    GoogleSearchPage changeColor(final String color) {
        driver.executeScript("arguments[0].style.color='" + color + "'", driver.findElementByXPath(firstLink));
        return this;
    }

    boolean checkIfContainsFirstLink() {
        return driver.findElement(By.xpath(firstLink)).getText().contains(firstLink);
    }
}
