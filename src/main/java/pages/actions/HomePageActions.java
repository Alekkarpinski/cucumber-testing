package pages.actions;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import pages.locators.HomePageLocators;
import utils.SeleniumDriver;
import utils.SeleniumHelper;


public class HomePageActions {

    private HomePageLocators locators;

    public HomePageActions() {
        locators = new HomePageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), locators);
    }

    public void openHomePage() {
        SeleniumDriver.openPage("localhost:8282");
    }

    public void goToLoginPage() {
        locators.loginLink.click();
    }

    public boolean isLogoutButton() {
        return SeleniumHelper.isElementPresent(locators.logoutButton);
    }

    public void logoutFromSystem() {
        locators.logoutButton.click();
    }

    public boolean isLoginButton() {
        return SeleniumHelper.isElementPresent(locators.loginLink);
    }

    public void goToAddItemPage() {
        locators.addItemLink.click();
    }

    public void goToItemsPage(){
        locators.itemsLink.click();
    }
}
