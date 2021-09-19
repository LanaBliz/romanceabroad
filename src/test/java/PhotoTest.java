import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PhotoTest extends BaseUI{

    String currentUrl;
    String expectedUrlMedia = "https://romanceabroad.com/media/index";


    @Test
    public void testPhoto(){
        driver.findElement(Locators.LINK_MEDIA).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, expectedUrlMedia);
    }
}
