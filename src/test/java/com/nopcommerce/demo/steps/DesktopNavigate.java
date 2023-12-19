package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class DesktopNavigate {
    @And("I click on Desktop Tab")
    public void iClickOnDesktopTab() {
        new ComputerPage().clickOnDesktopLink();
    }

    @Then("I should navigate to Desktop page successfully")
    public void iShouldNavigateToDesktopPageSuccessfully() {
        String expectedText = "Desktops";
        String actualText = new DesktopsPage().getDesktopText();
        Assert.assertEquals(actualText,expectedText);
    }
}
