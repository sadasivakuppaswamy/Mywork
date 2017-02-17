package jaya;

import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by Sadasiva.Kuppaswamy on 24-09-2015.
 */
public class FileUpload {
    private static WebDriver driver = null;

    public static void main(String[] args) throws IOException, InterruptedException {

        System.setProperty("webdriver.ie.driver", "D:\\Selenium\\IEDriverServer_Win32_2.47.0\\IEDriverServer.exe");
        driver =new InternetExplorerDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String baseUrl = "http://seleniummaster.com";

        // Create the Selenium implementation
        Selenium selenium = new WebDriverBackedSelenium(driver, baseUrl);

        // Perform actions with selenium

        selenium.open("/");
        Thread.sleep(50000);
        selenium.waitForPageToLoad("30000");
        selenium.click(".//*[@id='menu']/ul[1]/li[3]/a/span");
        Thread.sleep(1000);
       /* selenium.type("name=username", "sadasiva");
        selenium.click("name=Submit");*/
        Thread.sleep(3000);

        // Get the underlying WebDriver implementation back. This will refer to the
        // same WebDriver instance as the "driver" variable above.
        //WebDriver driverInstance = ((WebDriverBackedSelenium) selenium).getWrappedDriver();
        //Finally, close the browser. Call stop on the WebDriverBackedSelenium instance
        //instead of calling driver.quit(). Otherwise, the JVM will continue running after
        //the browser has been closed.
        selenium.stop();

/*

        driver.get("http://www.4shared.com/");
        Thread.sleep(50000);

        driver.findElement(By.id("fid0")).click();

        Runtime.getRuntime().exec("C:\\Users\\sadasiva.kuppaswamy\\Desktop\\test.exe");

        Thread.sleep(5000);

        driver.close();
*/

    }
}
