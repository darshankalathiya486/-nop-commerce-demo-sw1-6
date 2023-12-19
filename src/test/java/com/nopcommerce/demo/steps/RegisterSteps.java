package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterSteps {

    @When("I click on register link")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @And("I enter First Name {string}")
    public void iEnterFirstName(String firstname) {
        new RegisterPage().enterFirstName(firstname);
    }

    @And("I enter Last Name {string}")
    public void iEnterLastName(String lastname) {
        new RegisterPage().enterLastName(lastname);
    }

    @And("I Select Day in Date Of Month Field")
    public void iSelectDayInDateOfMonthField() {
        new RegisterPage().selectDateByValue("23");
    }

    @And("I Select Month in Date Of Month Field")
    public void iSelectMonthInDateOfMonthField() {
        new RegisterPage().selectMonthByValue("8");
    }

    @And("I Select Year in Date Of Month Field")
    public void iSelectYearInDateOfMonthField() {
        new RegisterPage().selectYearByValue("2022");
    }

    @And("I enter Email {string}")
    public void iEnterEmail(String email) {
        new RegisterPage().enterEmail(email);
    }

    @And("I enter Password {string}")
    public void iEnterPassword(String password) {
        new RegisterPage().enterPassword(password);
    }

    @And("I enter Confirm Password {string}")
    public void iEnterConfirmPassword(String confirmPassword) {
        new RegisterPage().enterConfirmPassword(confirmPassword);
    }

    @And("I click on Register Button")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("registration successful")
    public void registrationSuccessful() {
        String expectedText = "Your registration completed";
        String actualText = new RegisterPage().getRegisterCompleteText();
        Assert.assertEquals(actualText,expectedText);
    }


}

