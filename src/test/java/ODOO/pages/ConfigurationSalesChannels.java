package ODOO.pages;

import ODOO.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConfigurationSalesChannels extends BasePage {

    @FindBy(xpath = "//a[@data-menu='267']/span[contains(text(),'Sales Channels')]")
    public WebElement CSC_btn;

    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement searchBox;

    @FindBy(xpath = "//button[contains(text(),'Create')]")
    public WebElement create_btn;

    @FindBy(xpath = "(//button[contains(text(),'Save')])[1]")
    public WebElement save_btn;

    @FindBy(name = "name")
    public WebElement salesTeamName;

    @FindBy(xpath = "//div//button[contains(text(),'Action')]")
    public WebElement action_btn;

    @FindBy(xpath = "//a[contains(text(),'Delete')]")
    public WebElement delete_btn;

    @FindBy(xpath = "//span[contains(text(),'Ok')]")
    public WebElement ok_btn;


    public void clickLink(String button){
        switch (button){
            case "CRM module":
                CRMmodule.click();
                break;
            case"Sales Channels":
                CSC_btn.click();
                break;
            case"Create":
                create_btn.click();
                break;
            case"Save":
                save_btn.click();
                break;
            case"Action":
                action_btn.click();
                break;
            case"Delete":
                delete_btn.click();
                break;
            case"Ok":
                ok_btn.click();
                break;

            default:
                System.out.println("Invalid button name");
        }
    }
}
