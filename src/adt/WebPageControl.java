package adt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sadasiva.Kuppaswamy on 20-08-2015.
 */
public class WebPageControl {
    public static void main(String... a){
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.toolsqa.com/automation-practice-form");
        boolean isSelected=driver.findElement(By.xpath("//input[@value='Manual Tester']")).isSelected();
        if(!isSelected){
            driver.findElement(By.xpath("//input[@value='Manual Tester']")).click();
        }
        Select select=new Select(driver.findElement(By.xpath("//*[@id='continents']")));
        select.selectByIndex(2);
        select.deselectByIndex(2);
      //  select.selectByValue("Australia");
        for( WebElement wb:select.getOptions()){
            System.out.println(wb.getText());
        }
        select.selectByVisibleText("Australia");


    }
}
