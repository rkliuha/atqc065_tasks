package kmarko.webdriver_tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchResultPage {

    private final WebDriver driver;
    private static final By FIRST_LINK = By.xpath("//div[@class='srg']/descendant::a[1]");
    private static final By IMAGE_RESULT_PAGE = By.xpath("//div[@class='hdtb-mitem hdtb-imb'][1]/a");

    public GoogleSearchResultPage(final WebDriver driver) {
        this.driver = driver;
    }

    final public String getFirstLinkText() {
        return driver.findElement(FIRST_LINK).getText();
    }

    final public GoogleImageSearchResultPage goToImageResultPage() {
        driver.findElement(IMAGE_RESULT_PAGE).sendKeys(Keys.RETURN);
        return new GoogleImageSearchResultPage(driver);
    }

    final public GoogleSearchResultPage changeLinkColor(final String colorValue) {
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].style.color='" + colorValue + "'",
                        driver.findElement(FIRST_LINK));
        return this;
    }

    final public String getLinkColorAttribute() {
        return driver.findElement(FIRST_LINK).getAttribute("style");
    }
}
