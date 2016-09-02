package rkliuha;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class WebDriverPractice {

    public WebDriver driver;

    @BeforeTest
    public final void setUp() {
        System.setProperty("webdriver.chrome.driver", "/GitRepositories/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.google.com.ua");
    }

    @Test
    public final void testActivities() throws IOException {
        driver.findElement(By.id("lst-ib"))
                .sendKeys("funny picture");

        driver.findElement(By.id("sblsbb"))
                .click();

        final String testTextOne =
                driver.findElement(By.xpath("//div[@id='imagebox_bigimages']/following::a[1]"))
                        .getText();

        Assert.assertTrue(testTextOne.toLowerCase().contains("funny picture"));

        driver.findElement(By.xpath("//div[@id='hdtb-msb']/descendant::a[1]")).click();

        for (int i = 1; i <= 5; i++) {
            Assert.assertTrue(driver.findElement(By.xpath("//div[@id='rg_s']/div[" + i + "]/a/img"))
                    .isDisplayed());
        }

        FileUtils.copyFile(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE),
                new File(".//src/main/resources/TestScreenShot.png"));

        driver.findElement(By.id("logocont")).click();

        Assert.assertTrue(driver.findElement(By.id("hplogo"))
                .isDisplayed());

        ((JavascriptExecutor) driver).executeScript("arguments[0].style.visibility='hidden'",
                driver.findElement(By.id("hplogo")));

        Assert.assertFalse(driver.findElement(By.id("hplogo")).isDisplayed());

        driver.findElement(By.id("lst-ib"))
                .sendKeys("funny kitten picture");

        final String testTextTwo = driver.findElement(By.xpath("//div[@id='rso']/descendant::a[1]"))
                .getText();

        Assert.assertTrue(testTextTwo.toLowerCase().contains("funny kitten picture"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].style.color='blue'",
                driver.findElement(By.xpath("//div[@id='rso']/descendant::a[1]")));

        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='rso']/descendant::a[1]"))
                .getAttribute("style").contains("blue"));
    }

    @AfterTest
    public final void closureActivities() {
        driver.close();
    }

}
