package kmarko.webdriver_tasks;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class WebdriverPractice {

    final WebDriver driver = new FirefoxDriver();

    @BeforeTest
    final public void driverSetUp() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    final public void testWebdriverPractice() throws InterruptedException, IOException {

//      task_9_a
        driver.navigate().to("https://www.google.com");

//      task_9_b
        driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("funny picture");

//      task_9_c
        final String foundText = driver.findElement(By.xpath("//a[text()='Crazy Funny Pictures']")).getText();
        Assert.assertTrue(foundText.toLowerCase().contains("funny picture"));

//      task_9_d
        driver.findElement(By.xpath("//div[@class='hdtb-mitem hdtb-imb'][1]/a")).sendKeys(Keys.RETURN);

//      task_9_e
        for (int i = 1; i <= 5; i++) {
            Assert.assertTrue(driver.findElement(By.xpath("//div[@id='rg_s']/div[" + i + "]/a/img")).isDisplayed());
        }
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("screen.png"));

//      task_9_f
        driver.navigate().back();
        driver.navigate().back();

//      task_9_g
        final WebElement googleLogoElement = driver.findElement(By.xpath("//div[@id='hplogo']"));
        Assert.assertTrue(googleLogoElement.isDisplayed());

//      task_9_h
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.visibility='hidden'", googleLogoElement);

//      task_9_i
        Assert.assertFalse(googleLogoElement.isDisplayed());

//      task_9_j, task_9_k
        driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("funny kitten picture");
        String newFoundText = driver
                .findElement(By.xpath("//a[text()='The 50 Best Funny Kitten Pictures of All Time | The Wondrous']"))
                .getText();
        Assert.assertTrue(newFoundText.toLowerCase().contains("funny kitten picture"));

//      task_9_l
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.color='red'",
                driver.findElement(
                        By.xpath("//a[text()='The 50 Best Funny Kitten Pictures of All Time | The Wondrous']")));
//      task_9_m
        Assert.assertTrue(driver
                .findElement(By.xpath("//a[text()='The 50 Best Funny Kitten Pictures of All Time | The Wondrous']"))
                .getAttribute("style").contains("red"));
    }
}
