package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ComputerNavigate {
    @When("I click on Computers Tab")
    public void iClickOnComputersTab() {
        new HomePage().clickOnComputerTab();
    }

    @Then("I should navigate to Computers page successfully")
    public void iShouldNavigateToComputersPageSuccessfully() {
        String expectedText = "Computers";
        String actualText = new ComputerPage().getComputerText();
        Assert.assertEquals(actualText,expectedText);
    }
}
