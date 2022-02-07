import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class IframeTest extends BaseUI {

    public static final boolean testCase20 = true;

    @Test(priority = 1, enabled = testCase20, groups = {"user", "admin"})
    public void TestIframeCase20() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.LINK_IFRAME)));
        WebElement ele = driver.findElement(Locators.LINK_IFRAME);
        driver.switchTo().frame(ele);
       // wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Locators.YOUTUBE_VIDEO_BUTTON)));
        driver.findElement(Locators.YOUTUBE_VIDEO_BUTTON).click();
    }
}
