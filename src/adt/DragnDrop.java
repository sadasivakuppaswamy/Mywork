package adt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class DragnDrop {

    //source:http://selenium-training-way2automation.blogspot.in/2013/04/magic-of-actions-class-with-webdriver.html
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://jqueryui.com/resources/demos/droppable/default.html");


        WebElement draggable = driver.findElement(By.xpath("//*[@id='draggable']"));
        WebElement droppable = driver.findElement(By.xpath("//*[@id='droppable']"));


        Actions action = new Actions(driver);

        action.dragAndDrop(draggable, droppable).perform();




    }

}