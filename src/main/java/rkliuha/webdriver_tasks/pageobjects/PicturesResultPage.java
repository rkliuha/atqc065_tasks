package rkliuha.webdriver_tasks.pageobjects;

import org.openqa.selenium.*;

import java.util.List;

public class PicturesResultPage extends PageObject {

    public static final By PATH_TO_HOME_LOGO =
            By.id("logocont");
    public static final By PATH_TO_PICTURES_ELEMENT =
            By.xpath("//div[@id='rg_s']//img");
    public static final String PATH_FOR_STORING_SCREENSHOT =
            ".//src/main/resources/testScreenshot.png";

    public PicturesResultPage(final WebDriver driver) {
        super(driver);
    }

    public final List<WebElement> getListOfPictures() {
        return driver
                .findElements(PATH_TO_PICTURES_ELEMENT);
    }

    public final void backToHomePage() {
        driver
                .findElement(PATH_TO_HOME_LOGO)
                .click();
    }
}
