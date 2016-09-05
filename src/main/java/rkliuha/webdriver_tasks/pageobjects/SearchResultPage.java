package rkliuha.webdriver_tasks.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultPage extends PageObject {

    public static final By PATH_TO_FIRST_LINK =
            By.xpath("//div[@class='srg']/div[1]/div/h3/a");
    public static final By PATH_TO_PICTURES_BUTTON =
            By.xpath("//div[@id='hdtb-msb']/descendant::a[1]");

    public SearchResultPage(final WebDriver driver) {
        super(driver);
    }

    public final PicturesResultPage goPicturesResult() {
        driver
                .findElement(PATH_TO_PICTURES_BUTTON)
                .click();
        return new PicturesResultPage(driver);
    }

}
