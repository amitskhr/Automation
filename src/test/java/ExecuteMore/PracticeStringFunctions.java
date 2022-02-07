package ExecuteMore;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class PracticeStringFunctions {

    WebDriver driver;


    public void opBrowser() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }


    public static void main(String[] args) {


        String name = "Singapore";
        System.out.println("CityName is " + name);

        //length count of string name
        int str = name.length();
        System.out.println("Length count of Name iS  " + str);

        //concat the string
        String description = " is becoming the financial HUB";
        System.out.println(name.concat(description));

        //another type to concat the string by using +
        System.out.println(name + description);

        //print string, starting from 3rd char
        String suB = name.substring(0, 3);
        System.out.println(suB);

        //print the array of string
        char[] arrCity = name.toCharArray();
        for (int i = 0; i < arrCity.length; i++) {
            System.out.println(arrCity[i]);
        }
        //convert the string to uppercase
        String strUpperCase = name.toUpperCase();
        System.out.println(strUpperCase);

        //compareTo method implementation
        System.out.println("the comparison between two strings = " + name.compareTo(description));

        //contains method
        System.out.println("The string is = " + description);
        System.out.println("Is The string contains HUB ?  = " + description.contains("HUB"));
        System.out.println("Is The string contains Hello ? = " + description.contains("Hello"));

        PracticeStringFunctions pr = new PracticeStringFunctions();
        pr.opBrowser();

    }


}
