package com.softserve.edu.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseObject {
    private static final long TIME_TO_WAIT = 60;
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BaseObject(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(TIME_TO_WAIT));
    }

    /**
     * Wait for url contains text
     */
    protected void waitForUrlContainsText(String text) {
        wait.until(ExpectedConditions.urlContains(text));
    }

    /**
     * Wait for given number of seconds for element becomes visible
     * on the page
     */
    protected void waitForVisibilityOfElement(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    /** Find element using given locator */
    protected WebElement find(By locator) {
        return driver.findElement(locator);
    }

    /**
     * Get URL of current page from browser
     */
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    /**
     * Get element's text
     */
    public String getText(By locator) {
        waitForVisibilityOfElement(locator);
        return find(locator).getText();
    }
}
