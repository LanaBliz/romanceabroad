import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BlogTest extends BaseUI{

    @Test
    public void testBlog(){
        String currentUrl;
        wait.until(ExpectedConditions.elementToBeClickable(Locators.LINK_BLOG));
        mainPage.ajaxClick(driver.findElement(Locators.LINK_BLOG));
        mainPage.javaWaitSec(5);
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, Data.expectedUrlBlog);
    }
}
