import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class PhotoPage extends BaseActions{

    public PhotoPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);

    }

    public void photoUrlEqualityAssertoin (){
        String currentUrl;
        driver.findElement(Locators.LINK_MEDIA).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, Data.expectedUrlMedia);
    }




}
