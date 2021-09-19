import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StoreTest extends BaseUI{
    String currentUrl;

    @Test
    public void testStore(){
        driver.findElement(Locators.LINK_STORE).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, Data.expectedUrlSStore);
    }
}
