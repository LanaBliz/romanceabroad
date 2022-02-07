import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JoinTest extends BaseUI{
    String currentUrl;

    public static final boolean testCase21 = true;

    @Test(priority = 1, enabled = testCase21, groups = {"user", "admin"})
    public void testJoinCase21(){
        wait.until(ExpectedConditions.elementToBeClickable(Locators.LINK_JOIN));
        mainPage.ajaxClick(driver.findElement(Locators.LINK_JOIN));
        //driver.findElement(Locators.LINK_JOIN).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, Data.expectedUrlHome);

        /*driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(Data.email);
        driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(Data.password);
        driver.findElement(Locators.BUTTON).click();
        driver.findElement(Locators.BUTTON).click()*/
        ;

        registrationForm.getStarted();
        registrationForm.getStartedSecondPage();
        }
}
