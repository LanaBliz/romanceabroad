import org.testng.Assert;
import org.testng.annotations.Test;

public class JoinTest extends BaseUI{
    String currentUrl;

    @Test
    public void testJoin(){
        driver.findElement(Locators.LINK_JOIN).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, Data.expectedUrlHome);
        driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(Data.email);
        driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(Data.password);
        driver.findElement(Locators.BUTTON).click();
    }
}
