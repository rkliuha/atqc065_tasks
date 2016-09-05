package kmarko.webdriver_tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class GoogleHomePage {

    final private WebDriver driver;

    private static final By SEARCH_FIELD = By.xpath("//input[@id='lst-ib']");
    private static final By GOOGLE_LOGO = By.xpath("//div[@id='hplogo']");

    public GoogleHomePage(final WebDriver driver) {
        this.driver = driver;
    }

    final public GoogleSearchResultPage inputInSearchField(final String string) {
        driver.findElement(SEARCH_FIELD).sendKeys(string);
        return new GoogleSearchResultPage(driver);
    }

    final public boolean findGoogleLogo() {
        return driver.findElement(GOOGLE_LOGO).isDisplayed();
    }

    final public GoogleHomePage hideGoogleLogo() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.visibility='hidden'",
                driver.findElement(GOOGLE_LOGO));
        return this;
    }
}
