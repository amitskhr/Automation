package dotcoza;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import java.awt.*;


public class PersonalLoan {

    WebDriver driver;
    Actions builder;
    Action mouseOver;
    JavascriptExecutor executor;
    Robot robotObj;
    ReusableProperties objReusableProperties;



    public PersonalLoan(WebDriver driver){
        this.driver=driver;
        objReusableProperties = new ReusableProperties(driver);

    }

    public void personalPage() {
        driver.get("https://stg-personal.nedbank.co.za/blog/do-not-overcapitalise-home-building-or-renovations.html");
        builder=new Actions(driver);
        mouseOver = builder.moveToElement(objReusableProperties.persoLon).build();
        mouseOver.perform();
    }
    public void clickFixedTerm(){
        executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();",objReusableProperties.fixed);
    }
    public void accept(){
        objReusableProperties.Accept.click();
    }
    public void scrollBar(){
        executor.executeScript("arguments[0].scrollIntoView(true)",objReusableProperties.repaymentCalc);
        objReusableProperties.repaymentCalc.getLocation();
    }
    public void getTxtBxValue(){
        String str= objReusableProperties.txtBx.getAttribute("Value");
        System.out.println("Value is  "+str);
    }
    public void getPayBackTwoYear(){
        String  total1= objReusableProperties.totalPayback1.getText();
        System.out.println("user will payback total amount for 2 years = "+total1);
    }
    public void moveSlider(){
        builder= new Actions(driver);
        builder.moveToElement(objReusableProperties.rangeSlider).moveByOffset(20,0).click().perform();

    }
    public void getPayBackThreeYear(){
        String pB = objReusableProperties.payBack.getText();
        System.out.println("Actual Value is "+pB);
        String expectedValue="R164.13";
        System.out.println("Expected Value is "+expectedValue);
        Assert.assertEquals(pB,expectedValue);
    }
    public void getTotalValueForthreeYear(){
        String  total2= objReusableProperties.totalPayback2.getText();
        System.out.println("user will payback total amount for 3 years = "+total2);

    }
    public void verifyInterest(){
        String inRate = objReusableProperties.interestRate.getText();
        String actRate=inRate;
        System.out.println("interest rate is "+inRate);
        String expRate="18%";
        Assert.assertEquals(actRate,expRate);
        System.out.println("Actual and expected rates are matched");
    }
    public void radioBtnCheck(){

        boolean selectState =objReusableProperties.radBtn1.isSelected();

        if(selectState == true){
            objReusableProperties.radBtn2.click();
        }else {
            objReusableProperties.radBtn1.click();

        }

    }

}


