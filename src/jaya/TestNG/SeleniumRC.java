package jaya.TestNG;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.SeleneseTestCase;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by Sadasiva.Kuppaswamy on 08-12-2016.
 */
public class SeleniumRC extends SeleneseTestCase {
    @BeforeTest
    public void setUp() throws Exception {
        selenium = new DefaultSelenium("localhost", 4444, "*googlechrome", "http://www.yatra.com/flights-india-vx/");
        selenium.start();
    }

    @Test
    public void test() throws Exception {
        selenium.open("/flights-india-vx/");
        selenium.click("id=auto_origin");
        selenium.click("xpath=(//*[@class="+"ui-corner-all"+"])[5]");
        selenium.click("id=auto_destination");
        selenium.click("id=ui-active-menuitem");
        selenium.click("id=datePickerDepart_dom1");
        selenium.click("link=12");
        selenium.click("id=btnFindFlights");
        selenium.waitForPageToLoad("30000");
    }

}
