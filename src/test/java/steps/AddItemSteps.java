package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.actions.AddItemPageActions;
import pages.actions.HomePageActions;
import pages.actions.ItemsPageActions;
import pages.actions.LoginPageActions;


public class AddItemSteps {

    private HomePageActions homePageActions;
    private AddItemPageActions addItemPageActions;
    private ItemsPageActions itemsPageActions;


    public AddItemSteps() {
        this.addItemPageActions = new AddItemPageActions();
        this.homePageActions = new HomePageActions();
        this.itemsPageActions = new ItemsPageActions();

    }

    @Given("^I go to AddItemPage$")
    public void I_go_to_AddItemPage() throws Throwable {
        homePageActions.goToAddItemPage();

    }

    @Given("^I enter correct item data$")
    public void I_enter_correct_item_data() throws Throwable {
        addItemPageActions.putData("Pifko", "1");
        addItemPageActions.submitData();

    }

    @Given("^The item should be added$")
    public void The_item_should_be_added() throws Throwable {
        Assert.assertEquals(itemsPageActions.getLastItem(), "Pifko");

    }

}