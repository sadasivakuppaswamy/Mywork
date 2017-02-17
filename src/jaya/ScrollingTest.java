package jaya;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/**
 * Created by Sadasiva.Kuppaswamy on 28-08-2015.
 */
public class ScrollingTest {
    public static void main(String... a) throws IOException {
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://jobbuzz.timesjobs.com");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //To get current URL
        System.out.println(driver.getCurrentUrl());
        //To get Current Title
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//*[@id='navbar-collapse1']/ul/li[3]/a")).click();
        System.out.println(driver.getTitle());
        System.out.print(driver.getCurrentUrl());
        //Explicit Wait
        WebDriverWait wait=new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//*[@id='navbar-collapse1Wrap']/div/div/div[1]/ol/li[2]")), "Jobs"));
        System.out.println(driver.findElements(By.xpath("//*[@id='jobsSection']/div/div[2]")).size());
        System.out.println(getCurrentTime());

        //Executing javavascript functiond

        JavascriptExecutor js=(JavascriptExecutor)driver;
        //To scrolling ,calling java script function scrollTo
        js.executeScript("window.scrollTo(0,500)");
        System.out.println(driver.findElements(By.xpath("//*[@id='jobsSection']/div/div[2]")).size());
        js.executeScript("window.scrollTo(0,500)");
        System.out.println(driver.findElements(By.xpath("//*[@id='jobsSection']/div/div[2]")).size());
        //To get ScreenShot of page
        File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("D:\\Selenium\\"+"JobBuzz_"+getCurrentTime()+".jpg"));

    }
    //To get CurrentTime
    public static String getCurrentTime(){

        SimpleDateFormat dateFormat=new SimpleDateFormat("YYYY_MMM_DD_HH_MM_SS");
        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar.getTime());
        return dateFormat.format(calendar.getTime());

    }
}
