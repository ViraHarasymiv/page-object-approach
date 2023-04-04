package com.softserve.edu.pages;

import com.softserve.edu.utils.ConfigReader;
import org.openqa.selenium.WebDriver;

public class HomePage extends BaseObject{
    private final String HOME_PAGE_URL_TEXT = "common/home";
    private final String HOME_PAGE = ConfigReader.get().getHomePageUrl();
    //components
    private TopPart topPart;

    public HomePage(WebDriver driver) {
        super(driver);
        topPart = new TopPart(driver);
    }

    public TopPart getTopPart() {
        return topPart;
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
