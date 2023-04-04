package com.softserve.edu.tests;

import com.softserve.edu.pages.HomePage;
import com.softserve.edu.runners.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmptyCartTest extends BaseTest {
    private final String EXPECTED_LABEL_CONTENT = "Your shopping cart is empty!";
    private final String EXPECTED_URL_TEXT = "common/home";

    @Test
    public void checkEmptyCartLabel(){
        String actualLabelContent = new HomePage(driver)
                .openHomePage()
                .getTopPart()
                .clickOnShoppingCartMenu()
                .getLabelContent();
        Assert.assertTrue(actualLabelContent.contains(EXPECTED_LABEL_CONTENT),
                "The label must contain text " + EXPECTED_LABEL_CONTENT +
                ", but it contains " + actualLabelContent);
    }

    @Test
    public void checkContinueButton(){
        String actualUrl = new HomePage(driver)
                .openHomePage()
                .getTopPart()
                .clickOnShoppingCartMenu()
                .clickOnContinueButton()
                .getHomePageUrl();
        Assert.assertTrue(actualUrl.contains(EXPECTED_URL_TEXT),
                "The url must contain " + EXPECTED_URL_TEXT + ", but it is " + actualUrl);
    }
}
