package jaya;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * Created by Sadasiva.Kuppaswamy on 19-08-2015.
 */
public class BrowserNavigations {
    public static void main(String... a){
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.google.com/");
        //driver.findElement(By.xpath("//*[@id='gbw']/div/div/div[1]/div[1]/a")).click();
        driver.get("https://www.google.co.in/?gws_rd=ssl");
        String currentWindowHandle = driver.getWindowHandle();


        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.RETURN);
        driver.findElement(By.linkText("Gmail")).sendKeys(Keys.CONTROL, Keys.RETURN);

        new Actions(driver).sendKeys(Keys.chord(Keys.CONTROL, Keys.TAB)).perform();
        driver.findElement(By.id("Email")).sendKeys("sadasiva");

        //Get the list of all window handles
        ArrayList<String> windowHandles = new ArrayList<String>(driver.getWindowHandles());

        for (String window:windowHandles){

            //if it contains the current window we want to eliminate that from switchTo();
            if (window != currentWindowHandle){
                //Now switchTo new Tab.
                System.out.println(window);
                driver.switchTo().window(window);
                //Do whatever you want to do here.
                driver.findElement(By.id("Email")).sendKeys("sadasiva");
                //Close the newly opened tab

            }
        }

    }
}
