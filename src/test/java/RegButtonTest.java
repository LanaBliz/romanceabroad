import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RegButtonTest extends BaseUI{

    @Test
    public void testRegButton(){
        mainPage.clickJoinButton();
        if (!driver.findElement(Locators.TEXT_FIELD_EMAIL).isDisplayed()) {
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        }else{
            mainPage.completeFirstPartOfRegistration();
        }

        mainPage.completeSecondPartOfRegistration();

        WebElement checkboxConformation = driver.findElement(Locators.CHECKBOX_CONFIRMATION);
        if(driver.findElement(Locators.CHECKBOX_CONFIRMATION).isDisplayed()){
            checkboxConformation.click();
        }else{
            Assert.fail("Checkbox is already selected");
        }
    }

}
