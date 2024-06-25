package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MyAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(MyAccountPage.class.getName());

    public String register = "Register";
    public String login = "Login";
    public String logout = "Logout";

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Register Account']")
    public WebElement registerAccountText;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Returning Customer']")
    public WebElement returningCustomerText;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Register Account']")
    WebElement registerAccountHeading;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Returning Customer']")
    WebElement loginAccountHeading;

    @CacheLookup
    @FindBy(id = "input-firstname")
    public WebElement firstName;

    @CacheLookup
    @FindBy(id = "input-lastname")
    public WebElement lastName;

    @CacheLookup
    @FindBy(id = "input-email")
    public WebElement email;

    @CacheLookup
    @FindBy(id = "input-telephone")
    public WebElement mobile;

    @CacheLookup
    @FindBy(id = "input-password")
    public WebElement password;

    @CacheLookup
    @FindBy(id = "input-confirm")
    public WebElement confirmPassword;

    @CacheLookup
    @FindBy(xpath = "//input[@name='agree']")
    public WebElement termsAndAgree;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
    public WebElement registrationConfirmMsg;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Account Logout']")
    WebElement logoutConfirmMsg;

    @CacheLookup
    @FindBy(xpath = "//input[@value='Continue']")
    WebElement continueAfterRegistrationButton;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='My Account']")
    WebElement ClickOnMyAccountLink;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='My Account']")
    WebElement reuseClickOnMyAccountLink;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']/li")
    List<WebElement> selectMultipleElementFromDropdown;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']/li/a[text()='Logout']")
    WebElement selectElementFromDropdown;

    @CacheLookup
    @FindBy(name = "newsletter")
    WebElement yesRadioButton;

    @CacheLookup
    @FindBy(xpath = "//input[@value='Continue']")
    WebElement clickContinue;

    @CacheLookup
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    WebElement clickingOnContinue;


    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Account Logout')]")
    WebElement accountLogOutText;

    @CacheLookup
    @FindBy(xpath = "//input[@value='Login']")
    WebElement clickOnLoginButton;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='My Account']")
    WebElement myAccountText;

    @CacheLookup
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    WebElement finalContinue;

    public void clickOnFinalContinue() {
        clickOnElement(finalContinue);
    }

    public void selectYesRadioButton() {
        clickOnElement(yesRadioButton);
    }

    public void clickContinue() {
        clickOnElement(clickContinue);
    }

    public void clickingContinue() {
        clickOnElement(clickingOnContinue);
    }

    public String getLoginHeading() {
       log.info("Get " + loginAccountHeading.toString());
        return getTextFromElement(loginAccountHeading);
    }

    public String getRegisterAccountHeading() {
        log.info("Get " + registerAccountHeading.toString());
        return getTextFromElement(registerAccountHeading);
    }

    public String getRegistrationConfirmText() {
        log.info("Get " + registrationConfirmMsg.toString());
        return getTextFromElement(registrationConfirmMsg);
    }

    public void clickOnContinueAfterRegisterButton(){
        clickOnElement(continueAfterRegistrationButton);
        log.info("Get " + continueAfterRegistrationButton.toString());
    }

    public String getLogoutConfirmMessage() {
        log.info("Get " + logoutConfirmMsg.toString());
        return getTextFromElement(logoutConfirmMsg);
    }

    public void clickOnMyAccountLink() {
        clickOnElement(ClickOnMyAccountLink);
    }

    public void clickOnMyAccountLinkReuse() {
        clickOnElement(reuseClickOnMyAccountLink);
    }

    public String accountLogoutText() {
        return getTextFromElement(accountLogOutText);
    }

    public void selectMyAccountOptions(String option) {
        //This method should click on the options whatever name is passed as parameter. //list with two options(do multi select)
        List<WebElement> registerList = getListOfElements(selectMultipleElementFromDropdown); //list with two options(do multi select)
        for (WebElement option1 : registerList) {
            if (option1.getText().equals(option)) {
                option1.click();
                break;
            }
        }
    }

    public void selectMyAccountOptionsAfterLogin() {
        clickOnElement(selectElementFromDropdown);
    }

    public void clickOnLogin() {
        clickOnElement(clickOnLoginButton);
    }

    public String myAccountText() {
        return getTextFromElement(myAccountText);
    }

}

