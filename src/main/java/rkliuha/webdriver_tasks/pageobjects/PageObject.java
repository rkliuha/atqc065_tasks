package rkliuha.webdriver_tasks.pageobjects;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public abstract class PageObject {

    protected final WebDriver driver;

    public PageObject(final WebDriver driver) {
        this.driver = driver;
    }

    public final WebElement getElement(final By linkToElement) {
        return driver
                .findElement(linkToElement);
    }

    public final PageObject takeScreenshot() {
        try {
            FileUtils.copyFile(((TakesScreenshot) driver)
                            .getScreenshotAs(OutputType.FILE),
                    new File(PicturesResultPage.PATH_FOR_STORING_SCREENSHOT));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return this;
    }

    public final PageObject changeLinkColor(final String color,
                                            final By linkForChange) {
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].style.color='" + color + "'",
                        driver.findElement(linkForChange));
        return this;
    }

    public final PageObject hideElement(final By linkToElement) {
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].style.visibility='hidden'",
                        driver.findElement(linkToElement));
        return this;
    }

    public final String getTextFromLink(final By pathToElement) {
        return driver
                .findElement(pathToElement)
                .getText();
    }
}
