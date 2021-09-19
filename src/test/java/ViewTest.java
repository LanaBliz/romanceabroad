import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ViewTest extends BaseUI{
    String currentUrl;
    String expectedUrlView = "https://romanceabroad.com/content/view/how-it-works";
    By LINK_VIEW = By.xpath("//a[@href='https://romanceabroad.com/content/view/how-it-works']");

    @Test
    public void testView(){
        driver.findElement(LINK_VIEW).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, expectedUrlView);
    }
}
