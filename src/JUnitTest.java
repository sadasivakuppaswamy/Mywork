import org.junit.Assert;
import org.junit.rules.ExpectedException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Sadasiva.Kuppaswamy on 24-08-2015.
 */
public class JUnitTest {
    public static String baseUrl="https://www.freecharge.in";
    public static WebDriver driver;

    public static void navigateToApplication(String url){

        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
       driver =new ChromeDriver();
        driver.get(url);

    }
    public static void loginTOfreeChange(String userName,String password){
        driver.findElement(By.xpath("//*[@id='mainHeader']/div/div[3]/a")).click();
        driver.findElement(By.xpath("//*[@id='emailId']")).sendKeys(userName);
        driver.findElement(By.xpath("//*[@id='loginPassword']")).sendKeys(password);
        driver.findElement(By.id("loginButton")).click();


    }
    public static void ajaxwait(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public static void explictlyWait(int time){
        WebDriverWait wait=new WebDriverWait(driver,time);
        WebElement element=driver.findElement(By.xpath("//*[@id='mainHeader']/div/div[3]/div[1]"));
        wait.until(ExpectedConditions.elementToBeClickable(element));

    }
    public static void verifyUser(String user){
        driver.findElement(By.xpath("//*[@id='mainHeader']/div/div[3]/div[1]")).click();
        String actualUserName=driver.findElement(By.xpath("//*[@id='mainHeader']/div/div[5]/div/div/a/h5")).getText();
        String expectedUserName=user;
        Assert.assertEquals(actualUserName, expectedUserName);
    }
    public static void rechargeRecommendMobile(){
        driver.findElement(By.xpath("//*[@id='prePostForm']/div[1]/section/div[1]/div/div/div/div[1]")).click();
        driver.findElement(By.xpath("//*[@id='serviceNumber']")).sendKeys("//*[@id='serviceNumber']");
        driver.findElement(By.xpath("//*[@id='nextBtn']")).click();
        driver.findElement(By.xpath("//*[@id='nextBtn']")).click();
        driver.findElement(By.xpath("//*[@id='nextBtn']")).click();
        driver.findElement(By.xpath("//*[@id='rechargeForm']/div/fieldset[6]/div/span[2]")).click();
        driver.findElement(By.xpath("//*[@id='sidebar']/div/ul[1]/li[1]")).click();
        List<WebElement> recommend=driver.findElements(By.xpath("//*[@id='sidebar']/div/ul[2]/li/div[2]"));
        System.out.print(recommend.size() - 1);
        /*boolean flag=false;
        if(recommend.size()>1)
            flag=true;
        Assert.assertTrue(flag);*/

    }
    public static void rechargeFullTalkTimewithFoodCoupon(){
        naviGateToPlan();
        driver.findElement(By.xpath("/*[@id='normalcouponTypes']/li[2]")).click();
        driver.findElement(By.xpath("/*[@id='1297']/div/button")).click();

        /*boolean flag=false;
        if(recommend.size()>1)
            flag=true;
        Assert.assertTrue(flag);*/

    }
    public static void  fullTalkTimeWithEntertainmentCoupon(){

        naviGateToPlan();
        driver.findElement(By.xpath("//*[@id='normalcouponTypes']/li[3]")).click();
        driver.findElement(By.xpath("//*[@id='1767']/div/button")).click();
    }
public static void naviGateToPlan(){
    driver.findElement(By.xpath("//*[@id='prePostForm']/div[1]/section/div[1]/div/div/div/div[1]")).click();
    driver.findElement(By.xpath("//*[@id='serviceNumber']")).sendKeys("//*[@id='serviceNumber']");
    driver.findElement(By.xpath("//*[@id='nextBtn']")).click();
    driver.findElement(By.xpath("//*[@id='nextBtn']")).click();
    driver.findElement(By.xpath("//*[@id='nextBtn']")).click();
    driver.findElement(By.xpath("//*[@id='rechargeForm']/div/fieldset[6]/div/span[2]")).click();
    driver.findElement(By.xpath("//*[@id='sidebar']/div/ul[1]/li[2]")).click();
    List<WebElement> recommend=driver.findElements(By.xpath("//*[@id='sidebar']/div/ul[2]/li/div[2]"));
    System.out.print(recommend.size()-1);
    driver.findElement(By.xpath("//*[@id='sidebar']/div/ul[2]/li[2]/div[2]")).click();
    driver.findElement(By.xpath("//*[@id='nextBtn']")).click();
}









    public static void main(String... a) throws InterruptedException {
        navigateToApplication(baseUrl);
        ajaxwait();
        loginTOfreeChange("4u.sadasiva@gmail.com", "159733");
       // explictlyWait(60);
        Thread.sleep(3000);
        verifyUser("Sadasiva");

    }


}
