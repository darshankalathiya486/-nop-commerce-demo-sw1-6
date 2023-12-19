package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class LogOutSuccessFully {
    @And("I click on Log Out Link")
    public void iClickOnLogOutLink() {
        new LoginPage().clickOnLogOutButton();
    }

    @Then("I should Verify the Log In Link")
    public void iShouldVerifyTheLogInLink() {
        String expectedText = "Log in";
        String actualText = new LoginPage().getLogINText();
        Assert.assertEquals(actualText,expectedText);
    }
}
