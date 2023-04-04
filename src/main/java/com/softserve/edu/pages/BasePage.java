package com.softserve.edu.pages;

import org.openqa.selenium.WebDriver;

public class BasePage extends BaseObject {
    private TopPart topPart;

    public BasePage(WebDriver driver) {
        super(driver);
        topPart = new TopPart(driver);
    }

    public TopPart getTopPart() {
        return topPart;
    }
}
