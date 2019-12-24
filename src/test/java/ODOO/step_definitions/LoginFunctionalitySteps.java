package ODOO.step_definitions;


import ODOO.pages.LoginPage;
import ODOO.utilities.BrowserUtils;
import ODOO.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginFunctionalitySteps {

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

}