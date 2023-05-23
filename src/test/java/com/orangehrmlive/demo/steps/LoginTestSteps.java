package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class LoginTestSteps {
    @Given("^I Enter username$")
    public void iEnterUsername() {
        new LoginPage().enterUserName();
    }

    @When("^I Enter password$")
    public void iEnterPassword() {
        new LoginPage().enterPassword();
    }

    @And("^I Click on Login Button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLogin();
    }

    @Then("^I Should Verify \"([^\"]*)\" Message$")
    public void iShouldVerifyMessage(String arg0) {
        Assert.assertEquals(new DashboardPage().verifyTextDashBoard(), "Dashboard");
    }

    @Then("^I Should Verify Logo is Displayed$")
    public void iShouldVerifyLogoIsDisplayed() {
        Assert.assertEquals(new LoginPage().verifyLogoOfOrangeHRM(), "");
    }

    @Given("^I Login To The application$")
    public void iLoginToTheApplication() {
        new LoginPage().loginToApplication();
    }

    @When("^I Click on User Profile logo$")
    public void iClickOnUserProfileLogo() throws InterruptedException {
        Thread.sleep(2000);
        new DashboardPage().clickOnUserProfilePhoto();
    }

    @And("^I Mouse hover on Logout and click$")
    public void iMouseHoverOnLogoutAndClick() throws InterruptedException {
        Thread.sleep(2000);
        new DashboardPage().mouseHoverAndClickOnLogOut();
    }

    @Then("^I Should Verify the text Login Panel is displayed$")
    public void iShouldVerifyTheTextLoginPanelIsDisplayed() {
        Assert.assertEquals(new LoginPage().verifyTextLogin(), "Login");
    }
}
