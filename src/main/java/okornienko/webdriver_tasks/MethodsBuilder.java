package okornienko.webdriver_tasks;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;

class MethodsBuilder {
    private FirefoxDriver driver = new FirefoxDriver();

    MethodsBuilder goToUrl(final String url) {
        driver.get(url);
        return this;
    }

    MethodsBuilder enterTextByXPath(final String firePath, final String text) {
        driver.findElement(new By.ByXPath(firePath)).sendKeys(text);
        return this;
    }

    MethodsBuilder clickUsingXPath(final String firePath) {
        driver.findElement(new By.ByXPath(firePath)).click();
        return this;
    }

    MethodsBuilder pause() throws InterruptedException {
        Thread.sleep(1500);
        return this;
    }


    boolean checkIfContainsTextUsingXPath(final String firePath, final String text) {
        return driver.findElement(new By.ByXPath(firePath)).getText().contains(text);
    }

    boolean checkIfDisplayed(final String firePath) {
        return driver.findElement(new By.ByXPath(firePath)).isDisplayed();
    }

    boolean checkAllDisplayed(final String firePath, final int number) {
        boolean checkAll = true;
        String element;
        for (int i = 1; i <= number; i++) {
            element = firePath + i + "]";
            boolean checkElement = checkIfDisplayed(element);
            if (checkElement == false){
               checkAll = false;
                break;
            }
        }
        return checkAll;
    }

    MethodsBuilder makeScreenshot(final String file) throws IOException {
        final File sourceFile = driver.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(sourceFile, new File(file));
        return this;
    }

    MethodsBuilder hideElement(final String firePath) {
        driver.executeScript("arguments[0].style.visibility='hidden'", driver.findElementByXPath(firePath));
        return this;
    }

    MethodsBuilder changeColor(final String firePath, final String color) {
        driver.executeScript("arguments[0].style.color='" + color + "'", driver.findElementByXPath(firePath));
        return this;
    }

    boolean checkLinkColor(final String firePath) {
        return driver.findElementByXPath(firePath).getAttribute("style").contains("blue");
    }

    void end() {
        driver.close();
        driver.quit();
    }

}
