import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PhotoTest extends BaseUI {
    String currentUrl;

    @Test
    public void testPhoto() {
        wait.until(ExpectedConditions.elementToBeClickable(Locators.LINK_MEDIA));
        /*driver.findElement(Locators.LINK_MEDIA).click();*/
        mainPage.ajaxClick(driver.findElement(Locators.LINK_MEDIA));
        mainPage.javaWaitSec(5);
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, Data.expectedUrlMedia);
    }

}
