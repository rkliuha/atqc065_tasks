package kmarko.webdriver_tasks;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class GoogleImageSearchResultPage {

    private final WebDriver driver;

    private static final By GO_HOME_BUTTON = By.xpath("//div[@id='logocont']//a");

    public GoogleImageSearchResultPage(final WebDriver driver) {
        this.driver = driver;
    }

    final public boolean searchImageElements(final int numberOfElements) {
        int count = 0;
        for (int i = 1; i <= numberOfElements; i++) {
            if (driver.findElement(By.xpath("//div[@id='rg_s']/div["
                    + i + "]/a/img")).isDisplayed()) {
                count++;
            }
        }
        return count == numberOfElements;
    }

    final public void takeScreenshot() throws IOException {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("screen.png"));
    }

    final public GoogleImageSearchResultPage openGoogleMainPage() {
        driver.findElement(GO_HOME_BUTTON).click();
        return this;
    }
}
