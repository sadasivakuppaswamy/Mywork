package jaya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by Sadasiva.Kuppaswamy on 04-09-2015.
 */
public class signUpFb {
    static WebDriver driver=null;
    @Parameters("browser")
    @BeforeClass
    public static void OpenBrowser(String browser){
        if(browser.equalsIgnoreCase("firefox")){
            driver=new FirefoxDriver();

        }
        else if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
            driver=new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("ie")){
            System.setProperty("webdriver.ie.driver","D:\\Selenium\\IEDriver_win32\\IEDriver.exe");
            driver=new ChromeDriver();

        }

    }
    @Test
    public void signUpFb(){
        driver.get("https://www.facebook.com");
        driver.findElement(By.xpath("//*[@id='u_0_i']")).click();

    }
    @AfterClass
    public static void tearDown(){
        driver.close();
    }
}
