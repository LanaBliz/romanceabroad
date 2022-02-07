import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PhotoTest extends BaseUI {
    String currentUrl;

    public static final boolean testCase22 = true;

    @Test(priority = 1, enabled = testCase22, groups = {"user", "admin"})
    public void testPhotoCase22() {
        wait.until(ExpectedConditions.elementToBeClickable(Locators.LINK_MEDIA));
        /*driver.findElement(Locators.LINK_MEDIA).click();*/
        mainPage.ajaxClick(driver.findElement(Locators.LINK_MEDIA));
        mainPage.javaWaitSec(5);
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, Data.expectedUrlMedia);
    }

}
