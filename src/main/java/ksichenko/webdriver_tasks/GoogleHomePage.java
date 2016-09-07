package ksichenko.webdriver_tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleHomePage {

    public static final By GOOGLE_SEARCH_ARIE = By.xpath(".//input [@id=\"lst-ib\"]");
    public static final By GOOGLE_SEARCH_BUTTON = By.xpath(".//input [@id=\"lst-ib\"]");
    public static final By FUNNY_PICTURES_IMAGES_LINK = By.xpath("(.//div[@id='imagebox_bigimages']//a)[1]");
    public static final String GOOGLE_HOME_PAGE = "https://www.google.com.ua";


    private final WebDriver driver;

    public GoogleHomePage(final WebDriver driver) {
        this.driver = driver;
    }

    public ResultPage searchFor(final String searchValue) {

        driver
                .findElement(GOOGLE_SEARCH_ARIE)
                .sendKeys(searchValue);

        return new ResultPage(driver);
    }

    public ResultPage goToGooglePage() {

        driver
                .get(GOOGLE_HOME_PAGE);

        return new ResultPage(driver);
    }

    public ResultPage click(final By path) {

        driver
                .findElement(path)
                .click();

        return new ResultPage(driver);
    }


}


