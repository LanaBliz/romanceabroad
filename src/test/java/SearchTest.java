import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends BaseUI{

    String currentUrl;
    String expectedUrlSearch = "https://romanceabroad.com/users/search";
    By LINK_SEARCH = By.xpath("//a[@href='https://romanceabroad.com/users/search']");

    @Test
    public void testSearch(){
        driver.findElement(LINK_SEARCH).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, expectedUrlSearch);
    }
}
