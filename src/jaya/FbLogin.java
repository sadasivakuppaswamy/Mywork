package jaya;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sadasiva.Kuppaswamy on 04-09-2015.
 */
public class FbLogin {
    static WebDriver driver=null;
    @Parameters("browser")
    @BeforeClass(groups = {"first","second","three"})
    public static void OpenBrowser(String browser){
        if(browser.equalsIgnoreCase("firefox")){
            driver=new  FirefoxDriver();

        }
        else if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
            driver=new ChromeDriver();
            driver.get("https://www.facebook.com");
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
        else if(browser.equalsIgnoreCase("ie")){
            System.setProperty("webdriver.ie.driver", "D:\\Selenium\\IEDriver_win32\\IEDriver.exe");
            driver=new ChromeDriver();
            /*driver.get("https://www.facebook.com");
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
*/
        }


    }
    /*@BeforeMethod
    public void openApplication(){

        driver.get("https://www.facebook.com");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }*/

    @Test(dataProvider = "Credential",groups = "three")
    public void loginFb(@Optional("9553662351") String userName,String passWord){

        driver.findElement(By.xpath("//*[@id='email']")).sendKeys(userName);
        driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(passWord);
        driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
    @AfterClass
    public void tearDown(){
        driver.close();
    }
    @DataProvider(name="Credential")
    public Object[][] readCredential(){
        return new Object[][]{{"9553662351","4u.sadasiva"},{"abc","bcd"}};
    }
    @Test(groups = "first")
    public void messanger(){
        driver.findElement(By.xpath("//*[@id='pageFooter']/div[2]/table/tbody/tr[1]/td[3]/a")).click();
        driver.navigate().back();
    }
    @Test(groups = "first")
    public void mobile(){
        driver.findElement(By.xpath("//*[@id='pageFooter']/div[2]/table/tbody/tr[1]/td[5]/a")).click();
       // driver.navigate().back();
    }
    @Test(groups = "second")
    public void createAdvertise(){
        driver.findElement(By.xpath("/*[@id='pageFooter']/div[2]/table/tbody/tr[2]/td[4]/a")).click();
      //  driver.navigate().back();
    }
    @Test(groups = {"first","second"})
    public void help(){
        driver.findElement(By.xpath("//*[@id='pageFooter']/div[2]/table/tbody/tr[3]/td[2]/a")).click();
       // driver.navigate().back();
    }


}
