package jaya.easytests;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.io.File;

/**
 * Created by Sadasiva.Kuppaswamy on 22-01-2016.
 */
public class TakeScreenShotExample {

    public WebDriver driver;

    @Test
    public void openBrowser() throws Exception {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        try{
            //the below statement will throw an exception as the element is not found, Catch block will get executed and takes the screenshot.
            driver.findElement(By.id("testing")).sendKeys("test");

            //if we remove the below comment, it will not return exception and screen shot method will not get executed.
            //driver.findElement(By.id("gbqfq")).sendKeys("test");
        }
        catch (Exception e){
            System.out.println("I'm in exception");
//calls the method to take the screenshot.
            getscreenshot();
        }
    }

    public void getscreenshot() throws Exception
    {


        File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcfile,new File("D:\\screenshot.png\""));
    }
}
