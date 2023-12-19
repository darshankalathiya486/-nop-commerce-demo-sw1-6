package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class RegisterNavigate {

    @Then("I am in Register page")
    public void iAmInRegisterPage() {
        String expectedText1 = "Register";
        String actualText1 = new RegisterPage().getRegisterText();
        Assert.assertEquals(actualText1,expectedText1);
    }
}
