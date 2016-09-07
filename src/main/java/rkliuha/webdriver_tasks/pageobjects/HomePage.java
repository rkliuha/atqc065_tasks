package rkliuha.webdriver_tasks.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageObject {

    public static final By PATH_TO_SEARCH_FIELD = By.id("lst-ib");
    public static final By PATH_TO_SEARCH_BUTTON = By.id("sblsbb");
    public static final By PATH_TO_GOOGLE_LOGO = By.id("hplogo");

    public HomePage(final WebDriver driver) {
        super(driver);
    }

    public final SearchResultPage doSearch(final String textForSearch) {
        driver
                .findElement(PATH_TO_SEARCH_FIELD)
                .sendKeys(textForSearch);
        driver
                .findElement(PATH_TO_SEARCH_BUTTON)
                .click();
        return new SearchResultPage(driver);
    }

}
