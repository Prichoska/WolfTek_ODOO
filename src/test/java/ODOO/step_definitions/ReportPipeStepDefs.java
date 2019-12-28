package ODOO.step_definitions;

import ODOO.pages.ReportPipePage;
import ODOO.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ReportPipeStepDefs {
    //where your step definitions go. copy and paste
    @When("user clicks on Pipeline option")
    public void user_clicks_on_Pipeline_option() {
        BrowserUtils.waitFor(3);
        ReportPipePage reportPipePage=new ReportPipePage();
        reportPipePage.pipeline.click();
    }
    @Then("make sure Opportunity tag available")
    public void make_sure_Opportunity_tag_available() {
        BrowserUtils.waitFor(3);
        ReportPipePage reportPipePage=new ReportPipePage();
        Assert.assertTrue(reportPipePage.opportunitytag.isDisplayed());
    }
    @When("user clicks on Pipeline option2")
    public void user_clicks_on_Pipeline_option2() {
        BrowserUtils.waitFor(5);
        ReportPipePage reportPipePage =new ReportPipePage();
        reportPipePage.pipeline.click();
    }
    @Then("verify that it should diplay text")
    public void verify_that_it_should_diplay_text() {
        // Write code here that turns the phrase above into concrete actions
        BrowserUtils.waitFor(3);
        ReportPipePage reportPipePage =new ReportPipePage();
        Assert.assertTrue(reportPipePage.Currenttag.isDisplayed());
    }



}
