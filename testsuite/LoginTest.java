package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LoginTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void logintest(){
        WebElement register = driver.findElement(By.xpath("//a[@class='ico-login']"));
        register.click();
    }
    @Test
    public void loginsuccessfullywithvalidcredentials(){
        WebElement username = driver.findElement(By.xpath("//input[@name='Email']"));
        username.sendKeys("akashdalwadi1992@gmail.com");

        WebElement password = driver.findElement(By.xpath("//input[@name='Password']"));
        password.sendKeys("123456");

        WebElement loginbutton = driver.findElement(By.xpath(" //button[@name='register-button']"));
        loginbutton.click();
        Assert.assertEquals("valid credentials","login successfully");
    }


    @After
    public void endTest() {
        closeBrowser();
    }

}
