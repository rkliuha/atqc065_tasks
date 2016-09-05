package dshkliar.webdriver_tasks;

import org.apache.bcel.generic.RETURN;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class ResultPage {
    private final WebDriver driver;
    private final By FIRST_LINK = By.xpath("//div[@class='srg']/descendant::a[1]");
    private final By IMAGE_TAB = By.xpath("//div[@class='hdtb-mitem hdtb-imb'][1]/a");

    public ResultPage(final WebDriver driver) {
        this.driver = driver;
    }

    protected String getFirstLink() {
        return driver.findElement(FIRST_LINK).getText();
    }

    protected ResultImageTab goToImageTab() {
        driver.findElement(IMAGE_TAB).click();
        return new ResultImageTab(driver);
    }

    protected void changeFirstLinkColor(final String color) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.color='" + color + "'",
                driver.findElement(FIRST_LINK));
    }

    protected boolean verifyFirstLinkColor(final String color) {
        return driver.findElement(FIRST_LINK)
                .getAttribute("style").contains(color);
    }
}
