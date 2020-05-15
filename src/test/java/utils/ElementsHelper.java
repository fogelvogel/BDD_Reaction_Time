package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class ElementsHelper {
    public static WebElement waitForElement(String selector, WebDriver driver, WebDriverWait wait) {
        By by = By.cssSelector(selector);
        ExpectedCondition condition = ExpectedConditions.visibilityOfElementLocated(by);

        wait.until(condition);
        return driver.findElement(by);
    }

    public static WebElement waitForElement(String selector, WebDriver driver) {
        return waitForElement(selector, driver, 30);
    }

    public static WebElement waitForElement(String selector, WebDriver driver, int waitSeconds) {
        WebDriverWait wait = new WebDriverWait(driver,waitSeconds);

        return waitForElement(selector, driver, wait);
    }
}
