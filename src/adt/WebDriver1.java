package adt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;

/**
 * Created by sadasivak on 17-04-2015.
 */
public class WebDriver1 {
    static WebDriver driver;
    public static void main(String... a) throws InterruptedException {
        driver= new FirefoxDriver();
        driver.get("https://paytm.com");
        driver.manage().window().maximize();
        if(driver.getTitle().equals("Online Mobile Recharge - Postpaid, DTH & Datacard Bill Payments at Paytm.com")){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
       login_paytm("9553662351", "1597");
        Thread.sleep(3000);

        WebElement first=driver.findElement(By.xpath(".//*[@id='menu']/a[7]"));
        Actions actions=new Actions(driver);

        actions.moveToElement(first);
        actions.moveToElement(driver.findElement(By.xpath(".//*[@id='menu-pane']/div[7]/ul[3]/li[2]/a")));
        actions.click(driver.findElement(By.xpath(".//*[@id='menu-pane']/div[7]/ul[3]/li[2]/a")));
        Action mouseover=actions.build();
        mouseover.perform();
       // actions.build().perform();
        Thread.sleep(3000);

    }

    public static void login_paytm(String userName,String password) throws InterruptedException {
        String old=driver.getWindowHandle();
        System.out.println(old);
        driver.findElement(By.linkText("Log In / Sign Up")).click();
        Thread.sleep(5000);

        /*Set<String> windows=driver.getWindowHandles();
        for(String window:windows){
            System.out.println(window);
        }*/
       // driver.switchTo().window("paytm");
        driver.switchTo().frame(
                driver.findElement(By
                        .xpath("//iframe[@ng-hide='showVerificationScreen']")));
       // objDriver.findElement(By.id("mobileNumber")).sendKeys("xyz");
        driver.findElement(By.xpath(".//*[@id='mobileNumber']")).sendKeys(userName);
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys(password);
        driver.findElement(By.xpath("//*[@id='pre']/form/div[4]/button")).click();
        Thread.sleep(2000);

    }


}
