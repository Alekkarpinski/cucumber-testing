package pages.actions;

import org.openqa.selenium.support.PageFactory;
import pages.locators.AddItemPageLocators;

import utils.SeleniumDriver;
import utils.SeleniumHelper;

/**
 * Created by student03 on 16.12.15.
 */
public class AddItemPageActions {

    private AddItemPageLocators locators;

    public AddItemPageActions() {
        locators = new AddItemPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), locators);
    }

    public void putData(String type, String ammount) {
        locators.itemTypeField.sendKeys(type);
        locators.itemAmountField.clear();
        locators.itemAmountField.sendKeys(ammount);
    }

    public void submitData() {
        locators.submitButton.click();
    }
}







