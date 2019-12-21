package ODOO.step_definitions;

import ODOO.pages.ConfigurationSalesChannels;
import ODOO.utilities.BrowserUtils;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class ConfigurationSalesChannelsSteps {

    @Then("user clicks on the {string}")
    public void user_clicks_on_the(String button) {
        BrowserUtils.waitFor(3);
        ConfigurationSalesChannels csc = new ConfigurationSalesChannels();
        csc.clickLink(button);
    }

    @Given("validate that search box is displayed")
    public void validate_that_search_box_is_displayed() {
        BrowserUtils.waitFor(3);
        ConfigurationSalesChannels csc = new ConfigurationSalesChannels();
        Assert.assertTrue(csc.searchBox.isDisplayed());
    }

    @When("user enters Sales team name as {string}")
    public void user_enters_Sales_team_name_as(String text) {
        BrowserUtils.waitFor(3);
        ConfigurationSalesChannels csc = new ConfigurationSalesChannels();
        csc.salesTeamName.sendKeys(text);
    }

    @When("verify that Sales Channels name is not {string}")
    public void verify_that_Sales_Channels_name_is_not(String name) {
        BrowserUtils.waitFor(3);
        ConfigurationSalesChannels csc = new ConfigurationSalesChannels();
        Assert.assertFalse(csc.salesTeamName.getText().equalsIgnoreCase(name));
    }
}
