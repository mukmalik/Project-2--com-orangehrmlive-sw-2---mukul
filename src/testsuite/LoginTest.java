package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest
{
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setup()
    {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials()
    {

        //find the username field and type the username in username field
        driver.findElement(By.name("username")).sendKeys("Admin");

        //find the password field and type the password in the password field
        driver.findElement(By.name("password")).sendKeys("admin123");

        //Find the login button and click on login button
        driver.findElement(By.tagName("button")).click();

        // Verify the text ‘Dashboard’
        String expectedText = "Dashboard";
        WebElement DashboardElement = driver.findElement(By.tagName("h6"));
        String actualText = DashboardElement.getText();
        Assert.assertEquals("Error Verification", expectedText, actualText);
    }


    @After
    public void tearDown()
    {
        driver.close();
    }


}
