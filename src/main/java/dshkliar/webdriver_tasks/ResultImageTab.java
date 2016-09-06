package dshkliar.webdriver_tasks;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ResultImageTab {
    private final WebDriver driver;
    private static final By LOGO_HOME = By.xpath("//div[@id='logocont']//a");
    private static final By IMAGE_ELEMENTS = By.xpath("//div[@id='rg_s']//img");

    public ResultImageTab(final WebDriver driver) {
        this.driver = driver;
    }

    protected final List<WebElement> getListOfImages() {
        return driver.findElements(IMAGE_ELEMENTS);
    }

    protected void takeScreenShot(final String location) throws IOException {
        final File screenShotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenShotFile, new File(location));
    }

    protected HomePage goIntoHomePage() {
        driver.findElement(LOGO_HOME).click();
        return new HomePage(driver);
    }
}
