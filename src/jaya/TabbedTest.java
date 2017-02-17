package jaya;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Created by Sadasiva.Kuppaswamy on 18-08-2015.
 */
public class TabbedTest {
    public static void main(String... a){
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.co.in");
        driver.manage().window().maximize();
        String old=driver.getWindowHandle();
        System.out.println("Old:" + old);
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
        driver.get("https://www.gmail.com");
        Set<String> windows=driver.getWindowHandles();
        Iterator<String> itr=windows.iterator();
        String newWindow=null;
        for(String window:windows){
            System.out.println(window);
            newWindow=window;
        }
        driver.switchTo().window(newWindow);
        driver.navigate().to("https://www.facebook.com/");
        driver.findElement(By.cssSelector("body")).click();
        driver.findElement(By.id("email")).sendKeys("4u.sadasiva@gmail.com");
        driver.findElement(By.id("email")).sendKeys(Keys.CONTROL + "a");
        driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"c");
        driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"v");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys(Keys.TAB);
        driver.findElement(By.xpath("//*[@id='u_0_1']")).sendKeys(Keys.CONTROL+"v");

    }
}
