package jaya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Sadasiva.Kuppaswamy on 11-08-2015.
 */
public class FoodPanda {
    public static void main(String... a) throws InterruptedException {
       //
       // WebDriver driver=new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.foodpanda.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#menu-item-109>a")).click();
        String text=driver.findElement(By.xpath("//h1")).getText();
        if(text.equals("Order from 100+ cities in India!")){
            System.out.print("Yes");
        }
        else
            System.out.print("No");

        driver.findElement(By.xpath("//span[text()='Log in or Sign up']")).click();
        driver.findElement(By.id("customer_login_email")).sendKeys("raghuramboqv@gmail.com");
        driver.findElement(By.id("customer_login_password")).sendKeys("9642824424");
        driver.findElement(By.xpath("//*[@id='customer_login_login']")).click();
        Thread.sleep(3000);


    }
}
