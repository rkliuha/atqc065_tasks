package ksichenko.oop_task.WebDriverPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class WebDriverPractice {

    private final WebDriver driver = new FirefoxDriver();

    @BeforeTest
    public void openSearchPage() {

        driver.
                manage().
                timeouts().
                implicitlyWait(30, TimeUnit.SECONDS);

        driver
                .get("https://www.google.com");
    }

    @AfterTest
    public void closeSearchPage() {
        driver
                .close();
    }

    @Test
    public void googlePageTest0() {

        driver
                .findElement(By.xpath(".//input [@id=\"lst-ib\"]"))
                .sendKeys("funny pictures");
        driver
                .findElement(By.xpath(".//button [@ name=\"btnG\"]"))
                .click();

        final WebElement element =
                driver
                        .findElement(By.xpath("(.//div[@class=\"srg\"]//a)[1]"));

        Assert.assertTrue(
                element
                        .getText()
                        .toLowerCase()
                        .contains("funny pictures"));
    }

    @Test(dependsOnMethods = "googlePageTest0")
    public void googlePageTest1() {

        driver
                .findElement(By.xpath(".//input[@id=\"lst-ib\"]"))
                .sendKeys("funny pictures");

        driver
                .findElement(By.xpath("(.//div[@id='imagebox_bigimages']//a)[1]"))
                .click();

        for (int i = 1; i <= 5; i++) {

            Assert.assertTrue(
                    driver
                            .findElement(By.xpath(".//div[@id='rg_s']/div[" + i + "]/a/img"))
                            .isDisplayed());
        }
    }

    @Test(dependsOnMethods = "googlePageTest1")
    public void googlePageTest2() {

        driver
                .get("https://www.google.com");

        final WebElement element =
                driver
                        .findElement(By.id("hplogo"));

        Assert.assertTrue(
                element
                        .isDisplayed());

        ((JavascriptExecutor) driver).executeScript("arguments[0].style.visibility='hidden'",
                element);

        Assert.assertFalse(element.isDisplayed());

    }

    @Test(dependsOnMethods = "googlePageTest2")
    public void googlePageTest3() {

        driver
                .findElement(By.xpath(".//input [@id=\"lst-ib\"]"))
                .sendKeys("funny kitten picture");
        driver
                .findElement(By.xpath(".//button [@ name=\"btnG\"]"))
                .click();

        final WebElement element =
                driver
                        .findElement(By.xpath("(.//h3[@class=\"r\"]//a)[1]"));

        Assert.assertTrue(
                element
                        .getText()
                        .toLowerCase()
                        .contains("funny kitten picture"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].style.color='black'", element);

        Assert.assertTrue(
                element
                        .getAttribute("style").contains("black"));
    }


}

