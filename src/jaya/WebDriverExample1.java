package jaya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;

/**
 * Created by sadasivak on 03-04-2015.
 */
public class WebDriverExample1 {
    public static void main(String... a) throws InterruptedException {

        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("9553662351");
        driver.findElement(By.id("pass")).sendKeys("4u.sadasiva");
        driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
        Thread.sleep(3000);
        String actualString=driver.findElement(By.xpath(".//*[@id='blueBarNAXAnchor']/div[1]/div/div/div[1]/ul/li[1]/a/span")).getText();
        if(actualString.equals("Sadasiva")){
            System.out.println("Yes");
        }
        else
            System.out.println("No");

        int nooflinks=driver.findElements(By.tagName("a")).size();
        System.out.println(nooflinks);
       //
       // driver.findElement(By.linkText("Jobvite")).click();

        //.//*[@id='js_f']/ul[1]//a//div[3]/span[text()='Reddy Prasad Reddy Gaddam']
        String oldWindow=driver.getWindowHandle();
        System.out.println(oldWindow);

        driver.findElement(By.xpath(".//a[contains(text(),'foodpanda')]/parent::span/parent::div/parent::h5/parent::div/following-sibling::div[2]")).click();
        Set<String> windows=driver.getWindowHandles();
        for(String window:windows){
            System.out.println(window);
            //driver.switchTo().window("window");
        }

    }
}
