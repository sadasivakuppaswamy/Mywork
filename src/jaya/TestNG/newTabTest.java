package jaya.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

/**
 * Created by Sadasiva.Kuppaswamy on 22-05-2016.
 */
public class newTabTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.naukri.com/");







        String windowHandle = driver.getWindowHandle();
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
        ArrayList tabs = new ArrayList(driver.getWindowHandles());
        System.out.println(tabs.size());
        driver.switchTo().window(tabs.get(1).toString());
        driver.get("http://bing.com");
        driver.switchTo().window(windowHandle);
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "\t");
       // driver.switchTo().defaultContent();

    }
}
