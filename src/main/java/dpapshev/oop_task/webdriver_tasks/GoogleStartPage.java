package dpapshev.oop_task.webdriver_tasks;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class GoogleStartPage {
    static final String SEARCHING_FIELD_BY_CLASS = "gsfi";
    static final String GOOGLE_LOGO_BY_ID = "hplogo";
    private final WebDriver driver;

    public GoogleStartPage(final WebDriver driver) {
        this.driver = driver;
    }

    public GoogleResultPage googleSearch(final String textForSearch) {
        driver
                .findElement(By.className(SEARCHING_FIELD_BY_CLASS)).sendKeys(textForSearch);
        return new GoogleResultPage(driver);
    }

    public WebElement getGoogleLogo() {

        return driver.findElement(By.id(GOOGLE_LOGO_BY_ID));
    }

    public GoogleStartPage hideGoogleLogo() {
       final JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.visibility='hidden'", driver.findElement(By.id(GOOGLE_LOGO_BY_ID)));
        return this;
    }
}
