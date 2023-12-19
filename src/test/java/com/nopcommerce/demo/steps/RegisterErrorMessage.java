package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class RegisterErrorMessage {
    @Then("I should see the First name is required error message")
    public void iShouldSeeTheFirstNameIsRequiredErrorMessage() {
        String expectText2 = "First name is required.";
        String actualText2 = new RegisterPage().getFirstNameError();
        Assert.assertEquals(actualText2,expectText2);
    }

    @And("I should see the Last name is required error message")
    public void iShouldSeeTheLastNameIsRequiredErrorMessage() {
        String expectText3 = "Last name is required.";
        String actualText3 = new RegisterPage().getLastNameError();
        Assert.assertEquals(actualText3,expectText3);
    }

    @And("I should see the Email is required error message")
    public void iShouldSeeTheEmailIsRequiredErrorMessage() {
        String expectText4 = "Email is required.";
        String actualText4 = new RegisterPage().getEmailError();
        Assert.assertEquals(actualText4,expectText4);
    }

    @And("I should see the Password is required error message")
    public void iShouldSeeThePasswordIsRequiredErrorMessage() {
        String expectText5 = "Password is required.";
        String actualText5 = new RegisterPage().getPasswordError();
        Assert.assertEquals(actualText5,expectText5);
    }

    @And("I should see the Confirm Password is required error message")
    public void iShouldSeeTheConfirmPasswordIsRequiredErrorMessage() {
        String expectText6 = "Password is required.";
        String actualText6 = new RegisterPage().getConfirmPasswordError();
        Assert.assertEquals(actualText6,expectText6);

    }
}
