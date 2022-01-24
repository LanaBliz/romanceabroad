import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class IframeTest extends BaseUI {

    @Test
    public void TestIframe() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.LINK_IFRAME)));
        WebElement ele = driver.findElement(Locators.LINK_IFRAME);
        driver.switchTo().frame(ele);
       // wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Locators.YOUTUBE_VIDEO_BUTTON)));
        driver.findElement(Locators.YOUTUBE_VIDEO_BUTTON).click();
    }
}
