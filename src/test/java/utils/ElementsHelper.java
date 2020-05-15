package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementsHelper {
    public WebElement waitForElement(String selector, WebDriver driver, WebDriverWait wait) {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.cssSelector("[class^=\"view-splash\"]")
                )
        );
        return driver.findElement(By.cssSelector("[class^=\"view-splash\"]"));
    }

    public WebElement waitForElement(String selector, WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.cssSelector("[class^=\"view-splash\"]")
                )
        );
        return driver.findElement(By.cssSelector("[class^=\"view-splash\"]"));
    }

    public WebElement waitForElement(String selector, WebDriver driver, int waitSeconds) {
        WebDriverWait wait = new WebDriverWait(driver,waitSeconds);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.cssSelector("[class^=\"view-splash\"]")
                )
        );
        return driver.findElement(By.cssSelector("[class^=\"view-splash\"]"));
    }

}
