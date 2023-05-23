package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//span[text()='Admin']")
    WebElement admin;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='PIM']")
    WebElement pim;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add']")
    WebElement add;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement firstName;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement lastName;
    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
    WebElement employeeId;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Save']")
    WebElement save;

    public void clickOnAdmin() {
        clickOnElement(pim);
        clickOnElement(add);
        sendTextToElement(firstName, "Jaya");
        sendTextToElement(lastName, "Raja");
        sendTextToElement(employeeId, "5670");
        clickOnElement(save);
        log.info("Click on Admin" + admin.toString());
        clickOnElement(admin);
    }

    public void clickOptionAdmin() {
        clickOnElement(admin);
    }
}


