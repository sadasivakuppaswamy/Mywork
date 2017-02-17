package jaya;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Sadasiva.Kuppaswamy on 21-08-2015.
 */
public class BrokenLinks {
    static Logger log = Logger.getLogger(BrokenLinks.class.getName());
       public static List findAllLinks(WebDriver driver)

        {

            List<WebElement> L1 = new ArrayList<WebElement>();
                   log.info("Hi");
            log.debug("Debug");

            L1 = driver.findElements(By.tagName("a"));
            log.info("Clicked on link");
            L1.addAll(driver.findElements(By.tagName("img")));

            List finalList = new ArrayList(); ;
            Iterator<WebElement> itr=L1.iterator();
           for(WebElement element:L1)

            {

                if(element.getAttribute("href") != null)

                {

                    finalList.add(element);

                }

            }

            return finalList;

        }

        public static String isLinkBroken(URL url) throws Exception

        {

            //url = new URL("http://yahoo.com");

            String response = "";

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            try

            {

                connection.connect();

                response = connection.getResponseMessage();

                connection.disconnect();

                return response;

            }

            catch(Exception exp)

            {

                return exp.getMessage();

            }

        }

        public static void main(String[] args) throws Exception {

            // TODO Auto-generated method stub

           // FirefoxDriver ff = new FirefoxDriver();
            System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
            WebDriver ff=new ChromeDriver();

            ff.get("http://www.toolsqa.com/automation-practice-switch-windows/");

            //ff.get("http://www.yahoo.com/");

            List<WebElement> allhrefLinks = findAllLinks(ff);

            System.out.println("Total number of elements found " + allhrefLinks.size());
            int nonBroken=0;
            int broken=0;

            for( WebElement element : allhrefLinks){

                try

                {
                    String url=element.getAttribute("href");

                    System.out.print("URL: " + url +" returned ");

                    System.out.println(isLinkBroken(new URL(url)));

                    //System.out.println("URL: " + element.getAttribute("outerhtml")+ " returned " + isLinkBroken(new URL(element.getAttribute("href"))));
                    nonBroken++;
                }

                catch(Exception exp)

                {

                    System.out.println("At " + element.getAttribute("innerHTML") + " Exception occured -&gt; " + exp.getMessage());
                    broken++;
                }

            }
            System.out.println("BrokenLinks:"+broken);
            System.out.println("Non BrokenLinks"+nonBroken);

        }

    }

