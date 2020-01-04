package ODOO.step_definitions;

import ODOO.pages.ReportingSalesChannelsPage;
import ODOO.pages.LoginPage;
import ODOO.utilities.BrowserUtils;
import ODOO.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ReportingSalesChannels_Steps {


    @Given("user is on login page for ERP brite")
    public void user_is_on_login_page_for_ERP_brite() {
        Driver.get().get("http://34.220.250.213/");
    }

    @When("user login with username {string} and  password {string}")
    public void user_login_with_username_and_password(String username, String password) {
        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);
    }

    @Then("verify page title is {string}")
    public void verify_page_title_is(String title) {
        BrowserUtils.waitFor(3);
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals(actualTitle,title);
    }





    @Then("user clicks on the {string}")
    public void user_clicks_on_the(String button) {
        BrowserUtils.waitFor(3);
        ReportingSalesChannelsPage rscp = new ReportingSalesChannelsPage();
        rscp.clicklink(button);
    }


    @Then("user enters {string} name")
    public void user_enters(String string) {
        ReportingSalesChannelsPage rscp = new ReportingSalesChannelsPage();
        BrowserUtils.waitFor(3);
        System.out.println("Type "+ string);
        BrowserUtils.waitFor(3);

    }

    @When("user clicks {string}")
    public void user_clicks(String button) {
        BrowserUtils.waitFor(2);
        ReportingSalesChannelsPage rscp = new ReportingSalesChannelsPage();
        rscp.clicklink(button);

    }

    @Then("verify title is {string}")
    public void verify_title_is(String name) {
        ReportingSalesChannelsPage rscp = new ReportingSalesChannelsPage();
        rscp.name(name);
        BrowserUtils.waitFor(2);

        Assert.assertTrue(rscp.Alex.getText().equalsIgnoreCase(name));
    }







}
