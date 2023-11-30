package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;


public class RegisterTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void Setup(){
        openBrowser(baseUrl);
    }

    @Test
    public void Registertest(){
        WebElement register = driver.findElement(By.xpath("//a[@class='ico-register']"));
        register.click();
        WebElement firstname = driver.findElement(By.xpath("//div[@class='inputs']/input[@id='FirstName']"));
        firstname.sendKeys("Akash");
        WebElement lastname = driver.findElement(By.xpath("//input[contains(@name,'LastName')]"));
        lastname.sendKeys("Dalwadi");
        WebElement dateofbirth = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
        dateofbirth.sendKeys("3");
        WebElement dateofmonth = driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
        dateofmonth.sendKeys("May");
        WebElement dateofbirthyear = driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
        dateofbirthyear.sendKeys("1992");
        WebElement email = driver.findElement(By.xpath("//input[@name='Email']"));
        email.sendKeys("akashdalwadi1992@gmail.com");
        WebElement companyname = driver.findElement(By.xpath("//input[@name='Company']"));
        companyname.sendKeys("Aksari");
        WebElement newsletter = driver.findElement(By.xpath("//input[@name='Newsletter']"));
        newsletter.sendKeys("Newsletter");
        WebElement password = driver.findElement(By.xpath("//input[@name='Password']"));
        password.sendKeys("123456");
        WebElement confirmpassword = driver.findElement(By.xpath("//input[@name='ConfirmPassword']"));
        confirmpassword.sendKeys("123456");
        WebElement registerbtn = driver.findElement(By.xpath(" //button[@name='register-button']"));
        registerbtn.click();
        String expectedMessage = "Your registration completed";
        WebElement errorMessage = driver.findElement(By.xpath("//div[text()='Your registration completed']"));String actualMessage = errorMessage.getText();
        Assert.assertEquals("user is not register successfully..",expectedMessage,actualMessage);
    }
    @After
    public void endTest() {closeBrowser();}


}
