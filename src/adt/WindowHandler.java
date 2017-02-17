package adt;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.security.Credentials;

import java.util.Set;

/**
 * Created by Sadasiva.Kuppaswamy on 21-04-2015.
 */
public class WindowHandler {
    public static void main(String... a) throws InterruptedException {
       // WebDriver driver=new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.indianbank.net.in/");
        driver.manage().window().maximize();
        /*Alert alert = driver.switchTo().alert();
        alert.dismiss();*/
        driver.findElement(By.xpath("//*[@id='popupNewFacility']/table/tbody/tr[1]/td[2]/a")).click();

        String old=driver.getWindowHandle();
        System.out.println("old:" + old);
        driver.findElement(By.xpath("//a[@class='Internet']/font[text()='PERSONAL  BANKING']")).click();
        Thread.sleep(3000);
        Set<String> windows=driver.getWindowHandles();
        System.out.println("Windows size"+windows.size());
        String newWindow=null;
        for(String window:windows){
            System.out.println("Window name"+window);
            newWindow=window;
        }
        driver.switchTo().window(newWindow);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='LoginButton']")).click();
        driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("535565656");
        driver.findElement(By.className("loginButtons")).click();
        Thread.sleep(6000);
        Alert alert=driver.switchTo().alert();
        alert.accept();
        Thread.sleep(3000);
        driver.switchTo().window(old);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@class='Internet']/font[text()='REGISTER ONLINE']")).click();
        Thread.sleep(3000);






    }
}
