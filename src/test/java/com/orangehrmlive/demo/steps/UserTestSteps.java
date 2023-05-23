package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.pages.AddUserPage;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.pages.ViewSystemUsersPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class UserTestSteps {
    @Given("^I am on Homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I Login to Application$")
    public void iLoginToApplication() {
        new LoginPage().loginToApplication();
    }

    @And("^I click on Admin Tab$")
    public void iClickOnAdminTab() {
        new HomePage().clickOptionAdmin();
    }

    @Then("^I Should Verify System Users Text$")
    public void iShouldVerifySystemUsersText() {
        Assert.assertEquals(new ViewSystemUsersPage().verifyTextSystemUser(), "System Users");
    }

    @And("^click On Add button$")
    public void clickOnAddButton() {
        new ViewSystemUsersPage().clickOnAddButton();
    }

    @Then("^I Should Verify Add User Text$")
    public void iShouldVerifyAddUserText() {
        Assert.assertEquals(new AddUserPage().verifyTextAddUserName(), "Add User");
    }

    @And("^I click on that Admin Tab$")
    public void iClickOnThatAdminTab() throws InterruptedException {
        new HomePage().clickOnAdmin();
    }
    @And("^I Select User Role Admin$")
    public void iSelectUserRoleAdmin() throws InterruptedException {
        new AddUserPage().selectAdminRole();
    }

    @And("^I enter Employee Name Ananya Dash$")
    public void iEnterEmployeeNameAnanyaDash() throws InterruptedException {
        new AddUserPage().enterEmployeeName();
    }

    @And("^I enter Username$")
    public void iEnterUsername() {
        new AddUserPage().enterUserName();
    }

    @And("^I Select status Disable$")
    public void iSelectStatusDisable() throws InterruptedException {
        new AddUserPage().selectDisableOption();
    }

    @And("^I enter password$")
    public void iEnterPassword() {
        new AddUserPage().enterPassword();
    }

    @And("^I enter Confirm Password$")
    public void iEnterConfirmPassword() {
        new AddUserPage().enterConfirmPassword();
    }

    @And("^I click On Save Button$")
    public void iClickOnSaveButton() {
        new AddUserPage().clickOnSave();
    }

    @Then("^I Should verify message Successfully Saved$")
    public void iShouldVerifyMessageSuccessfullySaved() {
        Assert.assertEquals(new AddUserPage().verifyUserSaved(), "Successfully Saved", "Not Displayed");
    }

    @And("^I Select User Role$")
    public void iSelectUserRole() {
        new AddUserPage().selectAdminForUserRole();
    }

    @And("^I Select the Status Enable$")
    public void iSelectTheStatusEnable() {
        new AddUserPage().selectStatusEnable();
    }

    @And("^I Click on Search Button$")
    public void iClickOnSearchButton() {
        new AddUserPage().clickSearchButton();
    }

    @Then("^I Should Verify the User should be in Result list$")
    public void iShouldVerifyTheUserShouldBeInResultList() {
        Assert.assertEquals(new ViewSystemUsersPage().verifyUserShouldBeInRecordList(), "Yuvraji");
    }

    @And("^I Select Status Enable$")
    public void iSelectStatusEnable() {
        new AddUserPage().selectStatusEnable();
    }

    @And("^I Click on Check box$")
    public void iClickOnCheckBox() {
        new AddUserPage().clickSearchButton();
    }

    @Then("^I Should Verify that User should be in Result list$")
    public void iShouldVerifyThatUserShouldBeInResultList() {
        Assert.assertEquals(new ViewSystemUsersPage().verifyUserShouldBeInRecordList(), "Yuvraji");
    }

    @And("^I Click on Delete Button$")
    public void iClickOnDeleteButton() {
        new ViewSystemUsersPage().clickOnDelete();
    }

    @And("^I Click on Ok Button on Popup$")
    public void iClickOnOkButtonOnPopup() {
        new ViewSystemUsersPage().acceptPopUpDisplay();
    }

    @Then("^I should verify message Successfully Deleted$")
    public void iShouldVerifyMessageSuccessfullyDeleted() {
        Assert.assertEquals(new ViewSystemUsersPage().verifyUserDeleted(),"Successfully Deleted");
    }

    @And("^I Select a Status Disable$")
    public void iSelectaStatusDisable() {
        new AddUserPage().selectStatusDisable();
    }

    @Then("^I verify message No Records Found$")
    public void iVerifyMessageNoRecordsFound() {
        Assert.assertEquals(new AddUserPage().verifyNotRecord(),"No Records Found");
    }


}

