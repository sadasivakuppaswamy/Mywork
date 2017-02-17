import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Sadasiva.Kuppaswamy on 25-07-2015.
 */
public class Screener {
    public static void main(String[] args) {

        // TODO Auto-generated method stub

      //  System.setProperty("webdriver.chrome.driver", "C:\\Users\\lingamgi\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver d= new FirefoxDriver();

        String url="https://www.screener.in/";

        d.get(url);

        d.manage().window().maximize();

        JavascriptExecutor jse = (JavascriptExecutor)d;

        jse.executeScript("window.scrollBy(0,700)");

        d.findElement(By.xpath("//a[@href='login']")).click();

        d.findElement(By.xpath("//input[@id='id_username']")).sendKeys("enugalak@gmail.com");;

        d.findElement(By.xpath("//input[@id='id_password']")).sendKeys("prathi5");;

        d.findElement(By.xpath("//input[@value='Log in']")).click();

        d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        d.findElement(By.linkText("AllStocks")).click();

        for(int i=2;i<4;i++){

            WebElement table = d.findElement(By.id("screen"));



            // Now get all the TR elements from the table

            List<WebElement> allRows = table.findElements(By.tagName("tr"));



            // And iterate over them, getting the cells

            for (WebElement row : allRows) {

                List<WebElement> cells = row.findElements(By.tagName("td"));



                // Print the contents of each cell

                for (WebElement cell : cells) {

                    System.out.print(cell.getText()+" " );
                   /* js.executeScript("window.scrollBy(2000,0)", ""); // scroll right
                    jsx.executeScript("window.scrollBy(-2000,0)", ""); // scroll left
*/
                }

                System.out.println();

            }

            d.findElement(By.xpath("//*[@id='top']/div[1]/div[2]/ul[1]/li["+i+"]/a")).click();

            d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            d.close();



        }

    }
}
