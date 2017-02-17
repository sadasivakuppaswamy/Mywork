package jaya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class PayTm {
    public static void main(String... args) throws InterruptedException{
        //WebDriver driver=new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://bigbasket.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.id("uiv2-ftv-button")).click();
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("Fruits ")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//*[@id='product_2_1_10000008']/div[1]/a/img")).click();

        Thread.sleep(5000);
        driver.findElement(By.id("radio_10000008_10000007")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("p_10000007_1")).click();
        Thread.sleep(5000);
        driver.findElement(By.className("uiv2-basket-items")).click();
        //driver.findElement(By.xpath("//body/div[17]/div[3]/div/div/div[3]/div[1]/div")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//body/div[17]/div[2]/div[2]/div[4]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys("trend.shankar@hmail.com");
        driver.findElement(By.id("password")).sendKeys("7204422617");
        Thread.sleep(2000);
        driver.findElement(By.className("uiv2-login-button")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("checkout")).click();







    }

}