package jaya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sadasiva.Kuppaswamy on 25-08-2015.
 */
public class FileUploading {
    public static WebDriver driver;
    public static void main(String... a){
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        driver =new ChromeDriver();
        driver.get("http://qaweb2.dev.zoomsystems.com/ecenter/smart/planograms/257/gui");
        driver.findElement(By.xpath("//*[@id='username']")).sendKeys("qa.user2");
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("QAWelcome2");
        driver.findElement(By.xpath("//*[@id='button']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("(//*[@id='upload-content-container'])[1]")).
                sendKeys("C:\\Users\\sadasiva.kuppaswamy\\Desktop\\Master_theorem.docx");




    }
}
