package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class LoginErrorMessage {
    @And("I click on Login Button")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("I should see the error message")
    public void iShouldSeeTheErrorMessage() {
        String expectedText = "Login was unsuccessful. Please correct the errors and try again.\n"
                               + "No customer account found";
        String actualText = new LoginPage().getErrorMessage();
        Assert.assertEquals(actualText,expectedText);
    }
}
