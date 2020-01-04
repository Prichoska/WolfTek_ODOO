package ODOO.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReportingSalesChannelsPage extends BasePage{

    @FindBy(xpath = "//a[@data-menu='269']/span[contains(text(),'Sales Channels')]")
    public WebElement ClickReportingSalesChannels;

    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement nameInput;


    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement SearchResult;

    @FindBy(xpath = "//span[contains(text(),'Alex')]")
    public WebElement Alex;






    public void clicklink (String button){
        switch (button){
            case "CRM module":
                CRMmodule.click();
                break;
            case"Sales Channels":
                ClickReportingSalesChannels.click();
                break;

            default:
                System.out.println("Invalid button name");
        }
    }

    public void name(String name){
        nameInput.sendKeys(name, Keys.ENTER);

    }
}
