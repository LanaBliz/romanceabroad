import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BlogTest extends BaseUI{
    String currentUrl;
    String expectedUrlBlog = "https://romanceabroad.com/content/view/blog";
    By LINK_BLOG = By.xpath("//a[@href='https://romanceabroad.com/content/view/blog']");

    @Test
    public void testBlog(){
        driver.findElement(LINK_BLOG).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, expectedUrlBlog);
    }
}
