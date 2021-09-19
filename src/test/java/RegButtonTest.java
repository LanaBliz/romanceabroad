import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegButtonTest extends BaseUI{

    String email = "12@gmail.com";
    String password = "12@gmail.com";
    By BUTTON_REGISTRATION = By.xpath("//button[@id='show-registration-block']");
    By TEXT_FIELD_EMAIL = By.xpath("//input[@id='email']");
    By TEXT_FIELD_PASSWORD = By.cssSelector("input#password");
    By BUTTON = By.xpath("//button[@data-action='next-page'][text()='Next']");

    @Test
    public void testRegButton(){
        driver.findElement(BUTTON_REGISTRATION).click();
        driver.findElement(TEXT_FIELD_EMAIL).sendKeys(email);
        driver.findElement(TEXT_FIELD_PASSWORD).sendKeys(password);
        driver.findElement(BUTTON).click();
    }

}
