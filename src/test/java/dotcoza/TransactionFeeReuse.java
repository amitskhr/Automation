package dotcoza;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.util.List;

public class TransactionFeeReuse {

    WebDriver driver;

    @FindBy(xpath = "//button[contains(text(),'Accept')]")
    WebElement Accept;
    @FindBy(xpath = "//*[@id=\"coral-id-1\"]/div/coral-accordion-item-label")
    WebElement SignIn;

    @FindBy(xpath = "(//input[@is='coral-textfield'])[1]")
    WebElement Username;
    @FindBy(xpath = "(//input[@is='coral-textfield'])[2]")
    WebElement Pwd;

    @FindBy(xpath = "//*[@id=\"submit-button\"]/coral-button-label")
    WebElement clickSignIn;
    @FindBy(xpath = "//li[contains(text(),'Wealth Trader')]")
    WebElement scrollToWealth;
    @FindBy(xpath = "(//table[@class='table nbd-tft-table'])[1]")
    WebElement feeTable;
    @FindBy(xpath = "(//table[@class='table nbd-tft-table'])[1]")
    List<WebElement> abc;



    public TransactionFeeReuse(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }
}
