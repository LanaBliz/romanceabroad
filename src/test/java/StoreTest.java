import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StoreTest extends BaseUI{
    String currentUrl;
    String expectedUrlSStore = "https://romanceabroad.com/store/category-sweets";
    By LINK_STORE = By.cssSelector("a[href='https://romanceabroad.com/store/category-sweets']");

    @Test
    public void testStore(){
        driver.findElement(LINK_STORE).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, expectedUrlSStore);
    }
}
