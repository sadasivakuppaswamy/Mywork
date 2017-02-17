package jaya.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sadasiva.Kuppaswamy on 01-09-2015.
 */
public class DataProvider {
    static WebDriver driver;
    private static String baseURL="http://store.demoqa.com";

    @BeforeClass
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseURL);
    }
    @Test(dataProvider = "login")
    public void loginTest(String userName,String password){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id='account']/a")).click();

        driver.findElement(By.xpath("//*[@id='log']")).sendKeys(userName);
        driver.findElement(By.xpath("//*[@id='pwd']")).sendKeys(password);
        driver.findElement(By.xpath("//*[@id='login']")).click();
        WebDriverWait wait=new WebDriverWait(driver,60);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='account_logout']"))));
        driver.findElement(By.xpath("//*[@id='account_logout']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='account']/a"))));


    }
    @AfterClass
    public void tearDown(){
        /*driver.findElement(By.xpath("/*//*[@id='wp-admin-bar-site-name']/a")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/*//*[@id='account_logout']/a")).click();*/
        driver.close();
    }
    @org.testng.annotations.DataProvider(name="login")
    public Object[][] getCredential(){
        return new Object[][] { { "sadasiva", "SadA19#sIVA" }, { "abc", "dfe" }};
    }

}
