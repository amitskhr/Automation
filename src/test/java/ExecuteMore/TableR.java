package ExecuteMore;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TableR {
    WebDriver driver;
    Actions builder;
    Action mouseover;
    JavascriptExecutor executor;


    @BeforeSuite
    public void brwsLaunch(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @Test
    public void getTableValues() throws InterruptedException {
        driver.get("https://stg-banking.nedbank.co.za/home.html");
        driver.findElement(By.xpath("//button[contains (text(), 'Accept')]")).click();
        WebElement accLink = driver.findElement(By.xpath("(//a[contains(text(),'Accounts')])[1]"));
        WebElement allAcc = driver.findElement(By.xpath("(//a[contains(text(),'See all accounts')])[1]"));
        builder = new Actions(driver);
        mouseover = builder.moveToElement(accLink).build();
        mouseover.perform();
        executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();",allAcc);
        Thread.sleep(300);
        WebElement seeMore= driver.findElement(By.xpath("(//a[@data-pagequicklinktype ='link'])[1]"));
        executor.executeScript("arguments[0].ScrollIntoView",seeMore);
        seeMore.click();
        WebElement linkNavigateRateFee= driver.findElement(By.xpath("(//a[@data-pagequicklinkname='See rates and fees '])[1]"));
        String str=linkNavigateRateFee.getText();
        System.out.println("Navigate to "+str);
        String exp ="See rates and fees";
        Assert.assertEquals(str,exp);
        linkNavigateRateFee.click();

        WebElement trLocate = driver.findElement(By.xpath("(//tr[th])[1]"));
        String trV = trLocate.getText();
        System.out.println("values "+trV);



    }
}
