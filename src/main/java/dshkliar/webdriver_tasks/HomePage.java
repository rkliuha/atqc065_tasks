package dshkliar.webdriver_tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private final WebDriver driver;
    private final By SEARCH_FIELD = By.xpath("//input[@id='lst-ib']");
    private final By BUTTON_SEARCH = By.xpath("//button[@name='btnG' and @class='lsb']");
    private final By LOGO = By.xpath("//div[@id='hplogo']");

    public HomePage(final WebDriver driver) {
        this.driver = driver;
    }

    protected ResultPage search(final String text) {
        driver.findElement(SEARCH_FIELD).sendKeys(text);
        driver.findElement(BUTTON_SEARCH).sendKeys(Keys.RETURN);
        return new ResultPage(driver);
    }

    protected boolean verifyLogo() {
        return driver.findElement(LOGO).isDisplayed();
    }

    protected void visibilityOfLogo(final String value) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.visibility='" + value + "'",
                driver.findElement(LOGO));
    }
}
