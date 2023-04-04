package com.softserve.edu.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartEmptyPage extends BasePage {
    private String urlText = "route=checkout";
    By emptyCartLabel = By.xpath("//h1//following::p[1]");
    By continueButton = By.xpath("//a[contains(text(), 'Continue')]");

    public ShoppingCartEmptyPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Get the content of the label
     */
    public String getLabelContent() {
        waitForUrlContainsText(urlText);
        return getText(emptyCartLabel);
    }

    public HomePage clickOnContinueButton(){
        click(continueButton);
        return new HomePage(driver);
    }
}
