package jaya;

import com.thoughtworks.selenium.webdriven.commands.FireEvent;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Sadasiva.Kuppaswamy on 14-08-2015.
 */
public class WebTableHandling {
    public static void  main(String... a) throws IOException {
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.screener.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id='top']/div[3]/div/p/a[1]")).click();
        driver.findElement(By.id("id_username")).sendKeys("enugalak@gmail.com");
        driver.findElement(By.xpath("//*[@id='id_password']")).sendKeys("prathi5");
        driver.findElement(By.xpath("//*[@id='top']/div[1]/form/div/input")).click();
        driver.findElement(By.linkText("AllStocks")).click();
        WebElement table=driver.findElement(By.xpath("//*[@id='screen']"));

        String excelFileName = "F:/Test2.xlsx";//name of excel file
        String sheetName = "Sheet1";//name of sheet
        XSSFWorkbook wb = new XSSFWorkbook();
        XSSFSheet sheet = wb.createSheet(sheetName) ;



        List<WebElement> rows=table.findElements(By.tagName("tr"));

        Iterator itr=rows.iterator();
        for(WebElement row:rows){
            XSSFRow excelRow=sheet.createRow(rows.indexOf(row));
            List<WebElement> columns=row.findElements(By.tagName("td"));
            Iterator it=columns.iterator();
            for (WebElement col:columns){
                XSSFCell xcelCel=excelRow.createCell(columns.indexOf(col));
                xcelCel.setCellValue(col.getText());
                System.out.print(col.getText()+"   " );

            }
            System.out.println();

        }

        FileOutputStream fileOut = new FileOutputStream(excelFileName);

        //write this workbook to an Outputstream.
        wb.write(fileOut);
        fileOut.flush();
        fileOut.close();

    }
}
