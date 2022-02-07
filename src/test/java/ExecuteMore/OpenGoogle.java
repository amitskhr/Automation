package ExecuteMore;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class OpenGoogle {

    //Write a script to open google.com and verify that title is Google and
// also verify that it is redirected to google.co.in
    public static void main(String[] args) {
        WebDriver driver;
        //WebDriverManager.chromedriver().setup();
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
       // driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        String str = driver.getTitle();
        System.out.println("Title name is : " + str);
        driver.quit();
        if (str.equals("Google")) {
            System.out.println("Pass:Title is Google");
        } else {
            System.out.println("Fail:Title is not Google : actual title is " + str);
        }
    }
}
