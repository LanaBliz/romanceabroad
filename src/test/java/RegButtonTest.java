import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegButtonTest extends BaseUI{

    @Test
    public void testRegButton(){
        driver.findElement(Locators.BUTTON_REGISTRATION).click();
        driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(Data.email);
        driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(Data.password);
        driver.findElement(Locators.BUTTON).click();
    }

}
