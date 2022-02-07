package dotcoza;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class PageActions {

    WebDriver driver;
    PersonalLoan objPersonalLoan;

    @BeforeSuite
    public void initiateSetup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }
    @Test
    public void actionOnPage(){
        objPersonalLoan = new PersonalLoan(driver);
        objPersonalLoan.personalPage();
        objPersonalLoan.accept();
        objPersonalLoan.clickFixedTerm();
        objPersonalLoan.accept();
        objPersonalLoan.scrollBar();
        objPersonalLoan.getTxtBxValue();
        objPersonalLoan.getPayBackTwoYear();
        objPersonalLoan.moveSlider();
        objPersonalLoan.getPayBackThreeYear();
        objPersonalLoan.getTotalValueForthreeYear();
        objPersonalLoan.verifyInterest();
        objPersonalLoan.radioBtnCheck();


    }
}
