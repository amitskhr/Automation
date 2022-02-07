package dotcoza;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GetTransactionFeeValues {
    WebDriver driver;
    TransactionFeeMethods objTransactionFeeMethods;

    @BeforeSuite
    public void initiateChrome(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }
    @Test
    public void getTransactionFeeData(){
        objTransactionFeeMethods=new TransactionFeeMethods(driver);
        objTransactionFeeMethods.trFee();
        objTransactionFeeMethods.aemLogin();
        objTransactionFeeMethods.scrollTo();
        objTransactionFeeMethods.getTableData("(//table)[1]");



    }
}
