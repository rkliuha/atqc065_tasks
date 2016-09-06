package ksichenko.webdriver_tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ResultPage {

    public static final By FUNNY_PICTURES_SEARCH_FIRST_LINK = By.xpath("(.//div[@class=\"srg\"]//a)[1]");
    public static final By FUNNY_KITTEN_PICTURE_PAGE_FIRST_LINK = By.xpath("(.//h3[@class=\"r\"]//a)[1]");
    public static final By ALL_FANNY_PICTURES = By.xpath(".//div[@id='rg_s']//img");

    private final WebDriver driver;

    public ResultPage(final WebDriver driver) {
        this.driver = driver;
    }

    public String getFunnyPicturesText() {

        return driver
                .findElement(FUNNY_PICTURES_SEARCH_FIRST_LINK).getText();
    }

    public List<WebElement> getAllFunnyPictures() {

        return driver
                .findElements(ALL_FANNY_PICTURES);
    }

    public WebElement getGoogleLogo() {

        return driver
                .findElement(By.id("hplogo"));
    }

    public WebElement getHidedGoogleLogo() {

        final WebElement element =
                driver
                        .findElement(By.id("hplogo"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].style.visibility='hidden'",
                element);

        return element;
    }

    public String getFunnyKittenPicturesPageText() {

        return driver
                .findElement(FUNNY_KITTEN_PICTURE_PAGE_FIRST_LINK).getText();
    }

    public WebElement getChangedFunnyKittenPicturesLink() {

        final WebElement element =
                driver
                        .findElement(FUNNY_KITTEN_PICTURE_PAGE_FIRST_LINK);

        ((JavascriptExecutor) driver).executeScript("arguments[0].style.color='black'", element);

        return element;
    }

}

