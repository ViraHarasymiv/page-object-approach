package com.softserve.edu.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCartEmptyPage extends TopPart {
    private WebElement emptyCartLabel;
    private WebElement continueButton;

    public ShoppingCartEmptyPage(WebDriver driver) {
        super(driver);
        initElements();
    }
    private void initElements(){
        emptyCartLabel = driver.findElement(By.xpath("//h1//following::p[1]"));
        continueButton = driver.findElement(By.xpath("//a[contains(text(), 'Continue')]"));
    }

    public WebElement getEmptyCartLabel() {
        return emptyCartLabel;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }

    public void clickContinueButton(){
        getContinueButton().click();
    }

    public String getEmptyCartLabelContent(){
        return getEmptyCartLabel().getText();
    }
    //Business Logic
    public HomePage clickOnContinueButton(){
        clickContinueButton();
        return new HomePage(driver);
    }
}
