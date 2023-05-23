package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends Utility {
    private static final Logger log = LogManager.getLogger(DashboardPage.class.getName());

    public DashboardPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h6[text()='Dashboard']")
    WebElement getTextDashBoard;
    @CacheLookup
    @FindBy(xpath = "(//img[@alt='profile picture'])[1]")
    WebElement userProfilePhoto;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Logout')]")
    WebElement logOut;

    public String verifyTextDashBoard() {
        log.info("Verify text Dashboard" + getTextDashBoard.toString());
        return getTextFromElement(getTextDashBoard);
    }

    public void clickOnUserProfilePhoto() {
        log.info("Click on user profile photo" + userProfilePhoto.toString());
        clickOnElement(userProfilePhoto);
    }

    public void mouseHoverAndClickOnLogOut() {
        log.info("Mouse hover and click on log out" + logOut.toString());
        mouseHoverToElementAndClick(logOut);
    }
}
