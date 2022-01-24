import org.testng.Assert;
import org.testng.annotations.Test;

public class BlogTest extends BaseUI{

    @Test
    public void testBlog(){
        String currentUrl;
        driver.findElement(Locators.LINK_BLOG).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, Data.expectedUrlBlog);
    }
}
