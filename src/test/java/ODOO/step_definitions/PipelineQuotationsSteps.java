package ODOO.step_definitions;

import ODOO.pages.LoginPage;
import ODOO.pages.PipelineQuotationsPage;
import ODOO.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.nio.channels.Pipe;

public class PipelineQuotationsSteps {

    @When("user click on CRM module")
    public void user_click_on_CRM_module() {
        BrowserUtils.waitFor(3);
        PipelineQuotationsPage pipelineQuotationsPage=new PipelineQuotationsPage();
        pipelineQuotationsPage.CRM.click();
    }

    @And("user user click on Quotations under Pipeline")
    public void user_user_click_on_Quotations_under_Pipeline() {
        BrowserUtils.waitFor(3);
        PipelineQuotationsPage pipelineQuotationsPage=new PipelineQuotationsPage();
        pipelineQuotationsPage.Quotations.click();
    }

    @Then("user should be able to see all the information about Customer")
    public void user_should_be_able_to_see_all_the_information_about_Customer() {
        BrowserUtils.waitFor(3);
        PipelineQuotationsPage pipelineQuotationsPage=new PipelineQuotationsPage();
        System.out.println(pipelineQuotationsPage.TableInfo.getText());
        Assert.assertTrue(pipelineQuotationsPage.TableInfo.isDisplayed());
    }


}
