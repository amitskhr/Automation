package dotcoza;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WikiPedia {

    WebDriver driver;
    @BeforeSuite
    public void wiki(){
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.manage().window().maximize();

    }
    @Test
    public void openWiki(){

        driver.get("https://www.wikipedia.org/");
        driver.findElement(By.xpath("//strong[contains (text(), 'English')]")).click();
        System.out.println("I am English Wiki");

        // input search text in search box
        WebElement searchTxt= driver.findElement(By.xpath("//input[@placeholder='Search Wikipedia']"));
        searchTxt.sendKeys("Selenium");
        WebElement element = driver.findElement(By.xpath("//span[text()='Selenium'][1]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);



    }
}
