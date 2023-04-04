package com.softserve.edu.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class TopPart extends BaseObject{
    private By shoppingCartMenu = By.xpath("//a[@title='Shopping Cart']");

    public TopPart(WebDriver driver) {
        super(driver);
    }

    /**
     * Open ShoppingCartEmptyPage by clicking on the Shopping Cart menu
     */
    public ShoppingCartEmptyPage clickOnShoppingCartMenu(){
        waitForVisibilityOfElement(shoppingCartMenu);
        find(shoppingCartMenu).click();
        return new ShoppingCartEmptyPage(driver);
    }
}
