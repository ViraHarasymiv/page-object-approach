package com.softserve.edu.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class TopPart {
    protected WebDriver driver;
    //WebElements
     private WebElement shoppingCart;

    public TopPart(WebDriver driver) {
        this.driver = driver;
        initElements();
    }

    private void initElements() {
        shoppingCart = driver.findElement(By.cssSelector("a[title='Shopping Cart']"));
    }

    // shoppingCart
    public WebElement getShoppingCart() {
        return shoppingCart;
    }

    public void clickShoppingCart() {
        getShoppingCart().click();
    }
    // Functional
    /**
     * Click on the Shopping Cart menu
     */
    public ShoppingCartEmptyPage clickOnShoppingCartMenu(){
        clickShoppingCart();
        return new ShoppingCartEmptyPage(driver);
    }
}
