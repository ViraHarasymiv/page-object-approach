package com.softserve.edu.tests;

import com.softserve.edu.runners.TestRunnerFirst;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmptyCartTest extends TestRunnerFirst {
    private final String EXPECTED_LABEL_CONTENT = "Your shopping cart is empty!";
    private final String EXPECTED_URL_TEXT = "common/home";

    @Test
    public void checkEmptyCartLabel(){
        //Steps
        String actualLabelContent = loadApplication()
                .clickOnShoppingCartMenu()
                .getEmptyCartLabelContent();
        //Check
        Assert.assertTrue(actualLabelContent.contains(EXPECTED_LABEL_CONTENT));

    }

    @Test
    public void checkContinueButton(){
        //Steps
        String actualUrl = loadApplication()
                .clickOnShoppingCartMenu()
                .clickOnContinueButton()
                .getCurrentUrl();
        //Check
        Assert.assertTrue(actualUrl.contains(EXPECTED_URL_TEXT),
                "The url must contain " + EXPECTED_URL_TEXT + ", but it contains " + actualUrl);
    }
}
