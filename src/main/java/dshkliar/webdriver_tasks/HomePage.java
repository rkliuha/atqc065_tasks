package dshkliar.webdriver_tasks;

import org.openqa.selenium.*;

public class HomePage {
    private final WebDriver driver;
    private static final By SEARCH_FIELD = By.xpath("//input[@id='lst-ib']");
    private static final By BUTTON_SEARCH = By.xpath("//button[@name='btnG' and @class='lsb']");
    private static final By LOGO = By.xpath("//div[@id='hplogo']");

    public HomePage(final WebDriver driver) {
        this.driver = driver;
    }

    protected ResultPage doSearch(final String text) {
        driver.findElement(SEARCH_FIELD).sendKeys(text);
        driver.findElement(BUTTON_SEARCH).sendKeys(Keys.RETURN);
        return new ResultPage(driver);
    }

    protected WebElement getLogo() {
        return driver.findElement(LOGO);
    }

    protected void hideLogo(final String value) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.visibility='" + value + "'",
                driver.findElement(LOGO));
    }
}
