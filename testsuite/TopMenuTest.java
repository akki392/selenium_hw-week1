package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void Topmenutest(){
        driver.findElement(By.xpath("//div[@class='header-menu']/ul/li")).click();
        driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[2]")).click();
        driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[3]")).click();
        driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[4]")).click();
        driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[5]")).click();
        driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[6]")).click();
        driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[7]")).click();

    }


    @After
    public void endTest() {
        closeBrowser();
    }

}