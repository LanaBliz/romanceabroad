import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ViewTest extends BaseUI{

    @Test
    public void testView(){
        String currentUrl;
        wait.until(ExpectedConditions.elementToBeClickable(Locators.LINK_VIEW));
        mainPage.ajaxClick(driver.findElement(Locators.LINK_VIEW));
        mainPage.javaWaitSec(5);
        /*driver.findElement(Locators.LINK_VIEW).click();*/
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, Data.expectedUrlView);
    }
}
