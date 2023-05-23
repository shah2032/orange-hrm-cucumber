package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserPage extends Utility {
    private static final Logger log = LogManager.getLogger(AddUserPage.class.getName());

    public AddUserPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h6[text()='Add User']")
    WebElement getTextAddUserName;
    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[2]/div/div[2]/div/div/div[2]/i")
    WebElement selectUserRole;
    @CacheLookup
    @FindBy(xpath = "//*[@class='oxd-select-wrapper']//*[contains(text(),'Admin')]")
    WebElement selectAdminInUserRole;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement enterEmployeeName;
    @CacheLookup
    @FindBy(xpath = "//*[@class='oxd-autocomplete-wrapper']//*[contains(text(),'Jaya  Raja')]")
    WebElement getEnterEmployeeName;
    @CacheLookup
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    WebElement enterUserNameField;
    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-form-row']/div/div[4]/div/div[2]/div/div")
    WebElement selectStatus;
    @CacheLookup
    @FindBy(xpath = "//*[@class='oxd-select-wrapper']//*[contains(text(),'Disabled')]")
    WebElement selectDisable;
    @CacheLookup
    @FindBy(xpath = "//*[@class='oxd-select-wrapper']//*[contains(text(),'Disabled')]")
    WebElement disable;
    @CacheLookup
    @FindBy(xpath = "(//input[@type='password'])[1]")
    WebElement enterPassword;
    @CacheLookup
    @FindBy(xpath = "(//input[@type='password'])[2]")
    WebElement enterConfirmPassword;
    @CacheLookup
    @FindBy(xpath = "//button[text()=' Save ']")
    WebElement saveButton;
    @CacheLookup
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
    WebElement searchButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']")
    WebElement getTextNoRecord;
    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-form-row']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")
    WebElement selectAdminDrop2;
    @CacheLookup
    @FindBy(xpath = "//*[@class='oxd-select-wrapper']//*[contains(text(),'Admin')]")
    WebElement selectAdmin2;
    @CacheLookup
    @FindBy(xpath = "//body/div/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[@class='oxd-grid-2 orangehrm-full-width-grid']/div[3]/div[1]/div[2]/div[1]/div[1]")
    WebElement selectStatus2;
    @CacheLookup
    @FindBy(xpath = "//*[@class='oxd-select-wrapper']//*[contains(text(),'Disabled')]")
    WebElement selectDisable2;

    @CacheLookup
    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']")
    WebElement getTextUserSaved;

    public String verifyTextAddUserName() {
        return getTextFromElement(getTextAddUserName);
    }

    public void selectAdminForUserRole() {
        log.info("Select User Role" + selectUserRole.toString());
        log.info("Select Admin user Role" + selectAdminInUserRole.toString());
        clickOnElement(selectUserRole);
        clickOnElement(selectAdminInUserRole);
    }

    public void enterEmployeeName() throws InterruptedException {
        log.info("Enter employee name" + enterEmployeeName.toString());
        sendTextToElement(enterEmployeeName, "Jaya");
        Thread.sleep(2000);
        clickOnElement(getEnterEmployeeName);
    }

    public void enterUserName() {
        log.info("Enter user name" + enterUserNameField.toString());
        sendTextToElement(enterUserNameField, "Yuvraji");
    }

    public void selectStatusDisable() {
        log.info("Select status" + selectStatus.toString());
        clickOnElement(selectStatus);
        clickOnElement(selectDisable);
    }

    public void selectStatusEnable() {
        log.info("Select status" + selectStatus.toString());
        clickOnElement(selectStatus);
        clickOnElement(disable);
    }

    public void enterPassword() {
        log.info("Enter Password" + enterPassword.toString());
        sendTextToElement(enterPassword, "Qwe@12345");
    }

    public void enterConfirmPassword() {
        log.info("Enter confirm password" + enterConfirmPassword.toString());
        sendTextToElement(enterConfirmPassword, "Qwe@12345");
    }


    public void clickOnSave() {
        log.info("Click on save button" + saveButton.toString());
        clickOnElement(saveButton);
    }

    public String verifyUserSaved() {
        log.info("Verify User Saved" + getTextUserSaved.toString());
        return getTextFromElement(getTextUserSaved);
    }

    public void clickSearchButton() {
        log.info("Click on search button" + searchButton.toString());
        clickOnElement(searchButton);
    }

    public String verifyNotRecord() {
        log.info("Verify Text Not Record" + getTextNoRecord.toString());
        return getTextFromElement(getTextNoRecord);
    }

    public void selectAdminRole() throws InterruptedException {
        log.info("Click on Admin Role" + selectAdminDrop2.toString());
        log.info("Click on Admin Role" + selectAdmin2.toString());
        Thread.sleep(1000);
        clickOnElement(selectAdminDrop2);
        Thread.sleep(1000);
        clickOnElement(selectAdmin2);
    }

    public void selectDisableOption() throws InterruptedException {
        log.info("Select Status" + selectStatus2.toString());
        log.info("Select Disable Status" + selectDisable2.toString());
        Thread.sleep(2000);
        clickOnElement(selectStatus2);
        Thread.sleep(2000);
        clickOnElement(selectDisable2);

    }
}


