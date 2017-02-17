package jaya.easytests;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sadasiva.Kuppaswamy on 22-01-2016.
 */
public class BrowserSize {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.co.in/");
        System.out.println(driver.manage().window().getSize());
        Dimension d=new Dimension(420,600);
        driver.manage().window().setSize(d);

    }
}
