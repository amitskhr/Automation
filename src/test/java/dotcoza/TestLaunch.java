package dotcoza;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestLaunch {
    @Test
    public void test()
    {

        WebDriverManager.chromedriver().setup();
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stg-personal.nedbank.co.za/blog/do-not-overcapitalise-home-building-or-renovations.html");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement wb =  driver.findElement(By.xpath("(//button[contains(text(), 'Accept')])"));
        String str=wb.getText();
        System.out.println("Button Name:  "+ wb);
        wb.click();






        //driver.quit();






    }


}
