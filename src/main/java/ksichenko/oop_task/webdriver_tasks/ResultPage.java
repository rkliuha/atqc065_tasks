package ksichenko.oop_task.webdriver_tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ResultPage {

    public static final By FUNNY_PICTURES_SEARCH_FIRST_LINK = By.xpath("(.//div[@class=\"srg\"]//a)[1]");
    public static final By FUNNY_KITTEN_PICTURE_PAGE_FIRST_LINK = By.xpath("(.//h3[@class=\"r\"]//a)[1]");

    private final WebDriver driver;

    public ResultPage(final WebDriver driver) {
        this.driver = driver;
    }

    public String getFunnyPictures() {

        return driver
                .findElement(FUNNY_PICTURES_SEARCH_FIRST_LINK).getText();
    }

    public WebElement getFirstFiveFunnyPictures() {

        final List<WebElement> elementsList = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            final WebElement element = driver
                    .findElement(By.xpath(".//div[@id='rg_s']/div[" + i + "]/a/img"));
            elementsList.add(element);
        }

        for (WebElement webElement : elementsList) {
            return webElement;
        }

        return getFirstFiveFunnyPictures();

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

    public String getFunnyKittenPicturesPage() {

        return driver
                .findElement(FUNNY_KITTEN_PICTURE_PAGE_FIRST_LINK).getText();
    }

    public WebElement getChangedFunnyKittenPicturesLink() {

        WebElement element =
                driver
                        .findElement(FUNNY_KITTEN_PICTURE_PAGE_FIRST_LINK);

        ((JavascriptExecutor) driver).executeScript("arguments[0].style.color='black'", element);

        return element;
    }
}

