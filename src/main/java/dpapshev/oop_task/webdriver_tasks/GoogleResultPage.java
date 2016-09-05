package dpapshev.oop_task.webdriver_tasks;


import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class GoogleResultPage {
    private final WebDriver driver;
    static final String BUTTON_IMAGES = "//body//div[@id ='imagebox_bigimages']/div[@class='_Icb _kk _wI']/a";
    static final String FIRST_LINK_XPATH = "html/body//div[@class='g'][1]//h3/a";
    static final String NORMAL_LINK_TEXT_COLOR = "rgba(26, 13, 171, 1)";
    static final String FIRST_IMAGE_AFTER_IMAGE_SEARCH_BY_XPATH = "html/body//div[1]/a/img";


    public GoogleResultPage(final WebDriver driver) {
        this.driver = driver;
    }

    public String getFirstLinkText() {
        return driver
                .findElement(By.xpath(FIRST_LINK_XPATH))
                .getText();
    }

    public int getImagesQuantity() {
      final List<WebElement> imagesQuantity = driver.findElements(By.xpath("html/body//div[@id ='rg_s']//img"));
        return imagesQuantity.size();
    }

    public GoogleResultPage clickOnTheButton(final String nameOfTheButton) {
        driver
                .findElement(By.xpath(nameOfTheButton))
                .click();
        return this;
    }

    public GoogleResultPage doTheScreenshot() throws IOException {
      final File screenshotFile = ((TakesScreenshot) driver).
                getScreenshotAs(OutputType.FILE);
        return this;
    }

    public GoogleResultPage changeLinkColor(final String color) {
      final JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.color='" + color + "'",
                        driver.findElement(By.xpath(FIRST_LINK_XPATH)));
        return this;
    }

    public String realLincColor() {
        return driver
                .findElement(By.xpath(FIRST_LINK_XPATH)).getCssValue("color");
    }

    public String getNormalColor() {
        return NORMAL_LINK_TEXT_COLOR;
    }
}
