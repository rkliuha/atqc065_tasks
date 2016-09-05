package ksichenko.oop_task.webdriver_tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.w3c.dom.ranges.DocumentRange;

import java.util.concurrent.TimeUnit;

public class GoogleHomePage {

    public static final By GOOGLE_SEARCH_ARIE = By.xpath(".//input [@id=\"lst-ib\"]");
    public static final By GOOGLE_SEARCH_BUTTON = By.xpath(".//input [@id=\"lst-ib\"]");
    public static final By FUNNY_PICTURES_IMAGES_LINK = By.xpath("(.//div[@id='imagebox_bigimages']//a)[1]");

    private final WebDriver driver;

    public GoogleHomePage(final WebDriver driver) {
        this.driver = driver;
    }

    public ResultPage searchPageFunnyPictures(final String searchValue) {

        driver
                .findElement(GOOGLE_SEARCH_ARIE)
                .sendKeys(searchValue);
        driver
                .findElement(GOOGLE_SEARCH_BUTTON)
                .click();

        return new ResultPage(driver);
    }

    public ResultPage searchFirstFivePageFunnyPictures(final String searchValue) {

        driver
                .findElement(GOOGLE_SEARCH_ARIE)
                .sendKeys(searchValue);

        driver
                .findElement(FUNNY_PICTURES_IMAGES_LINK)
                .click();

        return new ResultPage(driver);
    }

    public ResultPage searchGoogleLogo() {

        driver
                .get("https://www.google.com");

        return new ResultPage(driver);
    }

    public ResultPage searchFunnyKittenPicturesPage(final String searchValue) {

        driver
                .findElement(GOOGLE_SEARCH_ARIE)
                .sendKeys(searchValue);
        driver
                .findElement(GOOGLE_SEARCH_BUTTON)
                .click();

        return new ResultPage(driver);
    }

}


