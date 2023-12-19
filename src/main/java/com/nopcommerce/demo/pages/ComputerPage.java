package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends Utility {

    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());

    /******************************** All Elements' Path on Computer Page ***********************************************/
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(), 'Computers')][1]")
    WebElement computersTab;


    @CacheLookup
    @FindBy(xpath = "//li[@class='active last']//a[normalize-space()='Desktops']")
    WebElement desktopsTab;

    /******************************** All Elements' Action Methods on Computer Page *************************************/

    public void clickOnComputerTab(){
        clickOnElement(computersTab);
    }

    public String getComputerText(){
      return getTextFromElement(computersTab);
    }

    public void clickOnDesktopLink(){
        clickOnElement(desktopsTab);
    }


}
