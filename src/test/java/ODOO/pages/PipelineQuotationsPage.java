package ODOO.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PipelineQuotationsPage extends BasePage {

@FindBy(xpath="(//span[@class='oe_menu_text'])[5]")
    public WebElement CRM;

@FindBy(xpath="(//span[contains(text(),'Quotations')])[1]")
public WebElement Quotations;

@FindBy(xpath="//table/tbody")
    public WebElement TableInfo;

@FindBy(xpath="//button[@accesskey='c']")
    public WebElement Create;

@FindBy(xpath="//div[@class='btn-group btn-group-sm o_cp_switch_buttons']/button")
    public WebElement accesKey;

@FindBy(xpath="//input[@class='o_searchview_input']")
    public WebElement Search;

@FindBy(xpath="//button[contains(text(),'Import')]")
    public WebElement Import;

@FindBy(xpath="//button[contains(text(),'Discard')]")
    public WebElement Discard;

@FindBy(xpath="//button[contains(text(),'Save')]")
    public WebElement Save;

@FindBy(xpath="//button[@aria-label='Previous']")
    public WebElement Previous;

@FindBy(xpath="//button[@aria-label='Next']")
    public WebElement Next;




}
