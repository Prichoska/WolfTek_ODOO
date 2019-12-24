package ODOO.pages;


import ODOO.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    @FindBy(xpath = "//span[contains(text(),'CRM')][@class='oe_menu_text']")
    public WebElement CRMmodule;

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }
}
