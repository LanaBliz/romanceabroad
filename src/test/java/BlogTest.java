import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BlogTest extends BaseUI{
    String currentUrl;


    @Test
    public void testBlog(){
        driver.findElement(Locators.LINK_BLOG).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, Data.expectedUrlBlog);
    }
}
