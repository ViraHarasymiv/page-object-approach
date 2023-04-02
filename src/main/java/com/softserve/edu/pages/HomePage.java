package com.softserve.edu.pages;

import com.softserve.edu.utils.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends TopPart{
    private final String HOME_PAGE = ConfigReader.get().getHomePageUrl();
    private By shoppingCartMenu = By.xpath("//a[@title='Shopping Cart']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    /**
     * Go to the OpenCart site
     */
    public HomePage getOpenCart() {
        driver.get(HOME_PAGE);
        return this;
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
