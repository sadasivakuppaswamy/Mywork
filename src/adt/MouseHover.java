package adt;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover{

    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

       // driver = new FirefoxDriver();
      /*  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();*/
        WebDriver driver=new HtmlUnitDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://www.flipkart.com/");

        WebElement element = driver.findElement(By.xpath("//*[@id='fk-mainhead-id']/div[2]/div/div/ul/li[1]/a/span"));

        Actions action = new Actions(driver);

        action.moveToElement(element).build().perform();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id='menu-electronics-tab-0-content']/ul[1]/li[2]/a")).click();
        Thread.sleep(3000);
        WebElement womens=driver.findElement(By.xpath("//*[@id='fk-mainhead-id']/div[2]/div/div/ul/li[3]/a/span"));
        WebElement flats=driver.findElement(By.xpath("//*[@id='menu-women-tab-0-content']/ul[2]/li[3]/a"));
        action.moveToElement(womens).build().perform();

        Thread.sleep(2000);
        flats.click();
        if(driver.findElement(By.xpath("//*[@id='pageTitle']/h1")).getText().equals("Flats")){
            System.out.print("Yes");
        }
        else
            System.out.print("No");

    }

}