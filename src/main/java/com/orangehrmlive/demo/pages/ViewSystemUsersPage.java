package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewSystemUsersPage extends Utility {
    private static final Logger log = LogManager.getLogger(ViewSystemUsersPage.class.getName());

    public ViewSystemUsersPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h5[text()='System Users']")
    WebElement getTextSystemUser;
    @CacheLookup
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    WebElement addButton;
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Yuvraji')]")
    WebElement userNameInRecord;
    @CacheLookup
    @FindBy(xpath = "(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[2]")
    WebElement checkBox;
    @CacheLookup
    @FindBy(xpath = "//i[@class='oxd-icon bi-trash']")
    WebElement deleteSign;
    @CacheLookup
    @FindBy(xpath = "//i[@class='oxd-icon bi-trash oxd-button-icon']")
    WebElement clickOnDelete1;

    @CacheLookup
    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']")
    WebElement getTextDeleted;

    public String verifyTextSystemUser() {
        log.info("Verify text System User" + getTextSystemUser.toString());
        return getTextFromElement(getTextSystemUser);
    }

    public void clickOnAddButton() {
        log.info("Click on add button" + addButton.toString());
        clickOnElement(addButton);
    }

    public String verifyUserShouldBeInRecordList() {
        log.info("Verify text user should be in Record List" + userNameInRecord.toString());
        return getTextFromElement(userNameInRecord);
    }

    public void clickOnCheckBox() {
        log.info("Click on check box" + checkBox.toString());
        clickOnElement(checkBox);
    }

    public void clickOnDelete() {
        log.info("Click on Delete" + deleteSign.toString());
        clickOnElement(deleteSign);
    }

    public void acceptPopUpDisplay() {
        log.info("Accept Pop Up" + clickOnDelete1.toString());
        clickOnElement(clickOnDelete1);
    }
    public String verifyUserDeleted(){
        return getTextFromElement(getTextDeleted);
    }
}

