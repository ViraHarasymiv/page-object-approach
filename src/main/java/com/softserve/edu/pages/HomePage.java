package com.softserve.edu.pages;

import com.softserve.edu.utils.ConfigReader;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    private final String HOME_PAGE_URL_TEXT = "common/home";
    private final String HOME_PAGE = ConfigReader.get().getHomePageUrl();

    public HomePage(WebDriver driver) {
        super(driver);
    }

    /**
     * Go to the OpenCart site
     */
    public HomePage openHomePage() {
        driver.get(HOME_PAGE);
        return this;
    }

    /**
     * Get Home Page url
     */
    public String getHomePageUrl(){
        return getCurrentUrl(HOME_PAGE_URL_TEXT);
    }
}
