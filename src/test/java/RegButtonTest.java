import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegButtonTest extends BaseUI{

    @Test
    public void testRegButton(){
        mainPage.clickJoinButton();
        mainPage.completeFirstPartOfRegistration();
        mainPage.completeSecondPartOfRegistration();
        WebElement checkboxConformation = driver.findElement(Locators.CHECKBOX_CONFIRMATION);
        if(driver.findElement(Locators.LINK_SEARCH).isDisplayed()){
            checkboxConformation.click();
        }else{
            Assert.fail("Checkbox is already selected");
        }
    }

}
