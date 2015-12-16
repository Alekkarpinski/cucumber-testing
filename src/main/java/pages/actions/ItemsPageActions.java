package pages.actions;

import org.openqa.selenium.support.PageFactory;
import pages.locators.AddItemPageLocators;
import pages.locators.ItemsPageLocators;
import utils.SeleniumDriver;

/**
 * Created by student03 on 16.12.15.
 */
public class ItemsPageActions {
    ItemsPageLocators locators;

    public ItemsPageActions()
    {
        locators = new ItemsPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), locators);
    }
    public String getLastItem()
    {
        return locators.lastItem.getText();
    }
}
