package dotcoza;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MouseClick {

    WebDriver driver;
    Actions builder;
    Action mouseOver;
    @BeforeSuite
    public void initiate(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @Test
    public void mouseClick(){
        driver.get("https://stg-personal.nedbank.co.za/nedbank-personal-home.html");
        WebElement accLink= driver.findElement(By.xpath("//a[@data-val='Accounts']"));

        builder = new Actions(driver);
        mouseOver = builder.moveToElement(accLink).build();
        mouseOver.perform();





    }
}
