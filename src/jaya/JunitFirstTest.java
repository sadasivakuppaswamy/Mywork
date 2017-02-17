package jaya;

import org.junit.*;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * Created by Sadasiva.Kuppaswamy on 26-08-2015.
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JunitFirstTest {
    static WebDriver driver;
    static Properties properties;
    @BeforeClass
    public static void setUpTest() throws Exception{
        try {
            File file = new File("F:\\Project\\SeleniumWebDriver\\src\\jaya\\test.properties");
            //  InputStream in=getClass().getClassLoader().getResourceAsStream("app.properties");
            FileInputStream fileInput = new FileInputStream(file);
            properties = new Properties();
            properties.load(fileInput);

            System.out.println(properties.getProperty("userName"));
            System.out.print(properties.getProperty("password"));
            String browserName = properties.getProperty("browser");
           /* switch (browserName) {
                case "firefox":
                    driver = new FirefoxDriver();
                    break;
                case "chrome":
                    System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
                    driver = new ChromeDriver();
                    break;
                default:
                    System.setProperty("webdriver.ie.driver", "D:\\Selenium\\chromedriver_win32\\IEDriver.exe");
                    driver = new ChromeDriver();
                    break;

            }*/
            if(browserName.equals("firefox")){
                driver = new FirefoxDriver();
            }
            else if(browserName.equals("chrome")){
                System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
                driver = new ChromeDriver();
            }
            else{
                System.setProperty("webdriver.ie.driver", "D:\\Selenium\\chromedriver_win32\\IEDriver.exe");
                driver = new InternetExplorerDriver();
            }


            driver.get(properties.getProperty("baseURL"));
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//*[@id='account']/a")).click();

            driver.findElement(By.xpath("//*[@id='log']")).sendKeys(properties.getProperty("userName"));
            driver.findElement(By.xpath("//*[@id='pwd']")).sendKeys(properties.getProperty("password"));
            driver.findElement(By.xpath("//*[@id='login']")).click();
        }catch (Exception e){

        }

       // String s1=driver.findElement(By.xpath("//*[@id='wp-admin-bar-my-account']/a")).getText();
    }
    /*@Test
    public void loginToStore(){
        driver.findElement(By.xpath("/*//*[@id='account']/a")).click();

        driver.findElement(By.xpath("/*//*[@id='log']")).sendKeys("sadasiva");
        driver.findElement(By.xpath("/*//*[@id='pwd']")).sendKeys("SadA19#sIVA");
        driver.findElement(By.xpath("/*//*[@id='login']")).click();
        String s1=driver.findElement(By.xpath("/*//*[@id='wp-admin-bar-my-account']/a")).getText();
        Assert.assertEquals(s1.substring(7), "sadasiva");

    }*/
   /* @Test
    public void logout() {
        *//*Actions action=new Actions(driver);
       // WebDriverWait wait=new WebDriverWait(driver,10);


        action.moveToElement(driver.findElement(By.xpath("*//*//**//*[@id='wp-admin-bar-my-account']/a"))).build().perform();
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("*//*//**//*[@id='wp-admin-bar-logout']/a']")));
        driver.findElement(By.xpath("*//*//**//*[@id='wp-admin-bar-logout']/a")).click();*//*

        driver.findElement(By.xpath("/*//*[@id='account_logout']/a")).click();

    }*/

    @Test
    public void profileUpdateTest(){
        driver.findElement(By.xpath("//*[@id='wp-admin-bar-my-account']/a")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id='profile-page']/h2")).getText().trim(), "Profile");
        driver.findElement(By.xpath("//*[@id='first_name']")).clear();
        String firstName=properties.getProperty("firstName");
        String lastName=properties.getProperty("lastname");
        driver.findElement(By.xpath("//*[@id='first_name']")).sendKeys(firstName);
        driver.findElement(By.xpath("//*[@id='last_name']")).sendKeys(lastName);
        driver.findElement(By.xpath("//*[@id='submit']")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id='first_name']")).getAttribute("value"), firstName);
        Assert.assertEquals((driver.findElement(By.xpath("//*[@id='last_name']"))).getAttribute("value"), lastName);


    }
    @Test
    public void dashBoardTest(){
        driver.findElement(By.xpath("//*[@id='wp-admin-bar-my-account']/a")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id='profile-page']/h2")).getText().trim(), "Profile");
        driver.findElement(By.xpath("//*[@id='menu-dashboard']/a/div[3]")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id='wpbody-content']/div[4]/h2")).getText(),"Dashboard");
    }
    @Test
    public void onlineStoreTest(){
        driver.findElement(By.xpath("//*[@id='wp-admin-bar-site-name']/a")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Assert.assertEquals(driver.findElements(By.xpath("//*[@id='logo']/img")).size(), 1);
        Actions action=new Actions(driver);

    WebElement productCategory= driver.findElement(By.xpath("//*[@id='menu-item-33']/a"));
        action.moveToElement(productCategory).build().perform();
        driver.findElement(By.xpath("//*[@id='menu-item-35']/a")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id='post-40']/header/h1")).getText(),"iMacs");
    }

    @AfterClass
    public static void tearDown(){
        driver.findElement(By.xpath("//*[@id='wp-admin-bar-site-name']/a")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id='account_logout']/a")).click();
        driver.close();
    }


}
