package dshkliar;

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

public class WebdriverPractice {
    WebDriver driver;

    @BeforeTest
    public void preConditions() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//      Task 9.a:
        driver.get("https://www.google.com.ua");
    }

    @Test
    public void webDriverTest() throws IOException {
//      Task 9.b:
        driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("funny picture");

        driver.findElement(By.xpath("//button[@name='btnG' and @class='lsb']")).sendKeys(Keys.RETURN);
//      Task 9.c:
        final String findFirstText = driver.findElement(By.xpath("//a[contains(text(),'funny picture')]")).getText();

        Assert.assertTrue(findFirstText.toLowerCase().contains("funny picture"));
//      Task 9.d:
        driver.findElement(By.xpath("//div[@class='hdtb-mitem hdtb-imb'][1]/a")).click();
//      Task 9.e:
        for (int i = 1; i <= 5; i++) {
            Assert.assertTrue(driver.findElement(By.xpath("//div[@id='rg_s']/div[" + i + "]/a/img")).isDisplayed());
        }

        File screenShotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenShotFile, new File("c:\\SoftServe\\Projects\\Task9_screenshot.png"));
//      Task 9.f:
        driver.findElement(By.xpath("//div[@id='logocont']//a")).click();
//      Task 9.g:
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='hplogo']")).isDisplayed());
//      Task 9.h:
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.visibility='hidden'",
                driver.findElement(By.xpath("//div[@id='hplogo']")));
//      Task 9.i:
        Assert.assertFalse(driver.findElement(By.xpath("//div[@id='hplogo']")).isDisplayed());
//      Task 9.j:
        driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("funny kitten picture");

        driver.findElement(By.xpath("//button[@name='btnG' and @class='lsb']")).sendKeys(Keys.RETURN);
//      Task 9.k:
        final String findSecondText = driver.findElement(By.xpath("//div[@id='rso']/descendant::a[1]")).getText();

        Assert.assertTrue(findSecondText.toLowerCase().contains("funny kitten picture"));
//      Task 9.l:
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.color='red'",
                driver.findElement(By.xpath("//div[@id='rso']/descendant::a[1]")));
//      Task 9.m:
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='rso']/descendant::a[1]"))
                .getAttribute("style").contains("red"));
    }

    @AfterTest
    public void postConditions() {
        driver.close();
    }
}
