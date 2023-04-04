package com.softserve.edu.pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends TopPart{

    public HomePage(WebDriver driver) {
        super(driver);
    }
    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }
}
