import org.testng.Assert;
import org.testng.annotations.Test;

public class ViewTest extends BaseUI{

    @Test
    public void testView(){
        String currentUrl;
        driver.findElement(Locators.LINK_VIEW).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, Data.expectedUrlView);
    }
}
