package dshkliar.webdriver_tasks;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ResultImageTab {
    private final WebDriver driver;
    private final By LOGO_HOME = By.xpath("//div[@id='logocont']//a");

    public ResultImageTab(final WebDriver driver) {
        this.driver = driver;
    }

    protected boolean getListsOfImages(final int numberOfImages) {
        int count = 0;
        for (int i = 1; i <= numberOfImages; i++) {
            if (driver.findElement(By.xpath("//div[@id='rg_s']/div[" + i + "]/a/img")).isDisplayed()) {
                count++;
            }
        }
        return count == numberOfImages;
    }

    protected void getScreenShot(final String location) throws IOException {
        File screenShotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenShotFile, new File(location));
    }

    protected HomePage goIntoHomePage() {
        driver.findElement(LOGO_HOME).click();
        return new HomePage(driver);
    }
}
