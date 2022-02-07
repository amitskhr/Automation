package dotcoza;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;

import java.awt.*;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class TransactionFeeMethods {
    WebDriver driver;
    Actions builder;
    Action mouseOver;
    JavascriptExecutor executor;
    Robot robotObj;
    TransactionFeeReuse objTransactionFeeReuse;

    public TransactionFeeMethods (WebDriver driver){
        this.driver=driver;
        objTransactionFeeReuse = new TransactionFeeReuse(driver);

    }
    public void trFee(){
        driver.get("https://author-nedbankstage.adobecqms.net/content/nedbank/za/en/dev-test/side_nav/left-nav.html?wcmmode=disabled");
    }
    public void aemLogin(){
        objTransactionFeeReuse.SignIn.click();
        objTransactionFeeReuse.Username.sendKeys("sidhant");
        objTransactionFeeReuse.Pwd.sendKeys("Welcome@Nedbankdev12");
        objTransactionFeeReuse.clickSignIn.click();
        objTransactionFeeReuse.Accept.click();
    }
    public void scrollTo(){
        executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].scrollIntoView(true)",objTransactionFeeReuse.scrollToWealth);
        objTransactionFeeReuse.scrollToWealth.getLocation();
    }
    public void getTableData(String strXpath){
      // String str = objTransactionFeeReuse.feeTable.getText();
       //System.out.println("text=  " +str);
        String TableXpath, rowData;
        TableXpath = strXpath + "//tr";
        //List<String> allrowsData;
        //allrowsData = new List();
       // List allrowsData = new ArrayList<String>();
        int totalRows = driver.findElements(By.xpath(TableXpath)).size();
//        if (totalRows > 0)
//        {
//            for (int i = 1; i <= totalRows; i++)
//            {
//                rowData = driver.findElement(By.xpath(TableXpath + "[" + i + "]")).getText();
//                allrowsData.add(rowData);
//            }
//        }
        //System.out.println(allrowsData.toString());




    }





}
