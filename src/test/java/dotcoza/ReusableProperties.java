package dotcoza;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReusableProperties {

    WebDriver driver;

    @FindBy(xpath = "//a[@data-val='Personal loans']")
    WebElement persoLon;
    @FindBy(xpath = "//a[text()= 'Fixed term loan']")
    WebElement fixed;
    @FindBy(xpath = "//button[contains (text(), 'Accept')]")
    WebElement Accept;
    @FindBy(xpath = "//li[contains( text(), 'Repayments calculator')]")
    WebElement repaymentCalc;
    @FindBy(xpath = "//input[@id='loanamount']")
    WebElement txtBx;
    @FindBy(xpath = "//p[@id='totalRepaymentcal']")
    WebElement totalPayback1;
    @FindBy(xpath = "//input[@id='myRange'][1]")
    WebElement rangeSlider;
    @FindBy(xpath = "//p[contains(text(), 164.13)][1]")
    WebElement payBack;
    @FindBy(xpath = "//p[@id='totalRepaymentcal']")
    WebElement totalPayback2;
    @FindBy(xpath = "//div[@id='repay_interest-value']")
    WebElement interestRate;
    @FindBy(xpath = "//label[@for='personal-insurance-yes']")
    WebElement radBtn1;
    @FindBy(xpath = "//label[@for='personal-insurance-no']")
    WebElement radBtn2;



    public  ReusableProperties(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }




}
