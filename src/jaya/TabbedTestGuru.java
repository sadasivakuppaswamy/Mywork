package jaya;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class TabbedTestGuru {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.co.in");
        driver.manage().window().maximize();
        String old=driver.getWindowHandle();
        System.out.println("Old:"+old);
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t");
        //driver.get(");
        Set<String>windows=driver.getWindowHandles();
        Iterator<String> itr=windows.iterator();
        String newWindow=null;
        for(String window:windows){
            System.out.println(window);
            newWindow=window;

        }
        driver.switchTo().window(newWindow);
        driver.navigate().to("http://www.guru99.com/software-testing.html");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("body")).click();
        WebElement testing = driver.findElement(By.xpath("//*[@id='rt-header']/div/div[2]/div[1]/ul/li[2]/a"));
        Actions action = new Actions(driver);

        action.moveToElement(testing).build().perform();
        driver.findElement(By.xpath("//*[@id='rt-header']/div/div[2]/div[1]/ul/li[2]/div/div/ul/li[3]/a")).click();




    }
}