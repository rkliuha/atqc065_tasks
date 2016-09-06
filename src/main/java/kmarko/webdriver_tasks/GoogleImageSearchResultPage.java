package kmarko.webdriver_tasks;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class GoogleImageSearchResultPage {

    private final WebDriver driver;

    private static final By GO_HOME_BUTTON = By.xpath("//div[@id='logocont']//a");
    private static final By IMAGE_LINK = By.xpath("//div[@id='rg_s']/div/a/img");

    public GoogleImageSearchResultPage(final WebDriver driver) {
        this.driver = driver;
    }

    final public List<WebElement> getImageElementsList() {
        return driver.findElements(IMAGE_LINK);
    }

    final public void takeScreenshot() throws IOException {
        final File screenshot = ((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("screen.png"));
    }

    final public GoogleImageSearchResultPage goToGoogleMainPage() {
        driver.findElement(GO_HOME_BUTTON).click();
        return this;
    }
}
