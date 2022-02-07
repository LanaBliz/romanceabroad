import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StoreTest extends BaseUI{
    String currentUrl;

    public static final boolean testCase27 = true;

    @Test(priority = 1, enabled = testCase27, groups = {"user", "admin"})
    public void testStoreCase27(){
        wait.until(ExpectedConditions.elementToBeClickable(Locators.LINK_STORE));
        mainPage.ajaxClick(driver.findElement(Locators.LINK_STORE));
        mainPage.javaWaitSec(5);

        /*driver.findElement(Locators.LINK_STORE).click();*/
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, Data.expectedUrlSStore);
        storePage.storePageGiftsLinksList();
    }
}
