package jaya.easytests;

/**
 * Created by Sadasiva.Kuppaswamy on 22-01-2016.
 */
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CorridorTest {

    /**
     * @param args
     */
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        driver.get("http://corridor.pramati.com");

        driver.manage().window().maximize();
        String Script = "javascript:document.getElementById('username');";
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.xpath("//*[@id='uname']"));
        System.out.println(element.getAttribute("placeholder"));

        WebElement userlogin = driver.findElement(By.id("username"));

        WebElement passwordLogin = driver.findElement(By.id("password"));
        CharSequence usern[] = { "saicharan.srinivas@imaginea.com" };
        userlogin.sendKeys(usern);
        CharSequence passwd[] = { "Satyasai@566" };
        passwordLogin.sendKeys(passwd);
        WebElement submitButton = driver.findElement(By.id("login"));
        submitButton.click();

    }
}
