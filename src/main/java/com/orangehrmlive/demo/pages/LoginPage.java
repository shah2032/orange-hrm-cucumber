package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(name = "username")
    WebElement userName;
    @CacheLookup
    @FindBy(name = "password")
    WebElement password;
    @CacheLookup
    @FindBy(tagName = "button")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//h5[text()='Login']")
    WebElement getTextLogin;
    @CacheLookup
    @FindBy(xpath = "//div[@class='orangehrm-login-logo']//img[@alt='orangehrm-logo']")
    WebElement logoOfOrangeHRM;

    public void loginToApplication() {
        log.info("Login to Application" + loginButton.toString());
        sendTextToElement(userName, "Admin");
        sendTextToElement(password, "admin123");
        clickOnElement(loginButton);
    }

    public void enterUserName() {
        log.info("Enter User name" + userName.toString());
        sendTextToElement(userName, "Admin");
    }

    public void enterPassword() {
        log.info("Enter Password" + password.toString());
        sendTextToElement(password, "admin123");
    }

    public void clickOnLogin() {
        log.info("Click on login button" + loginButton.toString());
        clickOnElement(loginButton);
    }

    public String verifyTextLogin() {
        log.info("Verify Text Login" + getTextLogin.toString());
        return getTextFromElement(getTextLogin);
    }

    public String verifyLogoOfOrangeHRM() {
        log.info("Verify Logo Of Orange HRM" + logoOfOrangeHRM.toString());
        return getTextFromElement(logoOfOrangeHRM);
    }

}
