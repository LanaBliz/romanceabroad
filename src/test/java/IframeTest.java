import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class IframeTest extends BaseUI {

    @Test
    public void TestIframe() throws InterruptedException {
        Thread.sleep(5000);
        WebElement ele = driver.findElement(Locators.LINK_IFRAME);
        driver.switchTo().frame(ele);
        driver.findElement(Locators.YOUTUBE_VIDEO_BUTTON).click();
    }
}
