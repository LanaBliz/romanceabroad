import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends BaseUI{
    String currentUrl;
    By LINK_HOME = By.xpath("//a[contains(text(),'HOME')]");
    String expectedUrlHome = "https://romanceabroad.com/#";

    @Test
    public void testHome(){
        driver.findElement(LINK_HOME).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, expectedUrlHome);
    }
}
