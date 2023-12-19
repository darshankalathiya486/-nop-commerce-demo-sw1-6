package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class LoginSuccessFully {
    @Then("I should Verify the Log Out Link")
    public void iShouldVerifyTheLogOutLink() {
        String expectedText = "Log out";
        String actualText = new LoginPage().getLogOutText();
        Assert.assertEquals(actualText,expectedText);
    }
}
