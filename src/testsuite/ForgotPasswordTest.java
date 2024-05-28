package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest
{


    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setup()
    {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully()
    {

        //click on the ‘Forgot your password’ link
        driver.findElement(By.xpath("//p[text() = 'Forgot your password? ']")).click();

        //Verify the text ‘Reset Password’
        String expected = "Reset Password";
        WebElement resetPasswordElement = driver.findElement(By.xpath("//h6[text() = 'Reset Password']"));
        String actual = resetPasswordElement.getText();
        Assert.assertEquals(expected, actual);

    }

    @After
    public void tearDown()
    {
        driver.close();
    }
}
