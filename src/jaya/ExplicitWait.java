package jaya;

import org.openqa.selenium.WebDriver;


        import java.util.concurrent.TimeUnit;

        import org.openqa.selenium.Alert;

        import org.openqa.selenium.By;

        import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

        import org.openqa.selenium.support.ui.ExpectedConditions;

        import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

    public static WebDriver driver;

    public static void main(String[] args) {

        // Create a new instance of the Firefox driver

        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        // Put an Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Launch the URL

        driver.get("http://www.toolsqa.com/automation-practice-switch-windows/");

        // Click on the Button "Timing Alert"

        driver.findElement(By.id("alert")).click();

        System.out.println("Timer JavaScript Alert is triggered but it is not yet opened");

        // Create new WebDriver wait

        WebDriverWait wait = new WebDriverWait(driver,40);

        // Wait for Alert to be present

        Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());

        System.out.println("Either Pop Up is displayed or it is Timed Out");

        // Accept the Alert

        myAlert.accept();

        System.out.println("Alert Accepted");

        // Close the main window

        driver.close();

    }

}