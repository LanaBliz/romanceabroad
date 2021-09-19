import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JoinTest extends BaseUI{
    String currentUrl;
    String expectedUrlHome = "https://romanceabroad.com/#";
    String email = "12@gmail.com";
    String password = "12@gmail.com";
    By TEXT_FIELD_EMAIL = By.xpath("//input[@id='email']");
    By TEXT_FIELD_PASSWORD = By.cssSelector("input#password");
    By LINK_JOIN = By.cssSelector("a[data-action='show-registration-block']");
    By BUTTON = By.xpath("//button[@data-action='next-page'][text()='Next']");

    @Test
    public void testJoin(){
        //By.xpath("//input[@id='password']")
        driver.findElement(LINK_JOIN).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, expectedUrlHome);
        driver.findElement(TEXT_FIELD_EMAIL).sendKeys(email);
        driver.findElement(TEXT_FIELD_PASSWORD).sendKeys(password);
        driver.findElement(BUTTON).click();
    }
}
