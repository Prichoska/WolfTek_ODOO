package ODOO.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReportPipePage extends BasePage {


        //put your locators in this page

        //example below from Alex's


        // @FindBy(xpath = "//a[@data-menu='267']/span[contains(text(),'Sales Channels')]")
        //    public WebElement CSC_btn;

        @FindBy(xpath = "(//span[contains(text(),'Pipeline')])[2]")
        public WebElement pipeline;

        @FindBy(xpath = "//span[contains(text(),'Opportunity')]")
        public WebElement opportunitytag;

        @FindBy(xpath = "//span[contains(text(),'Current')]")
        public WebElement Currenttag;

    }


