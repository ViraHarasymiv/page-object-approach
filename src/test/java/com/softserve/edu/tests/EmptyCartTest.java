package com.softserve.edu.tests;

import com.softserve.edu.pages.HomePage;
import com.softserve.edu.runners.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmptyCartTest extends BaseTest {
    private final String EXPECTED_LABEL_CONTENT = "Your shopping cart is empty!";
    private final String EXPECTED_URL = "https://demo.opencart.com/index.php?route=common/home&language=en-gb";

    @Test
    public void checkEmptyCartLabel(){
        String actualLabelContent = new HomePage(driver)
                .getOpenCart()
                .clickOnShoppingCartMenu()
                .getLabelContent();
        Assert.assertTrue(actualLabelContent.contains(EXPECTED_LABEL_CONTENT),
                "The label must contain text " + EXPECTED_LABEL_CONTENT +
                ", but it contains " + actualLabelContent);
    }

    @Test
    public void checkContinueButton(){
        String actualUrl = new HomePage(driver)
                .getOpenCart()
                .clickOnShoppingCartMenu()
                .clickOnContinueButton()
                .getCurrentUrl();
        Assert.assertTrue(actualUrl.equals(EXPECTED_URL),
                "The url must be " + EXPECTED_URL + ", but it is " + actualUrl);
    }
}
