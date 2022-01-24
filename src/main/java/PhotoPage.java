import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PhotoPage extends BaseActions{

    public PhotoPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);

    }

    /*public void photoUrlEqualityAssertoin (){
        String currentUrl;
        wait.until(ExpectedConditions.elementToBeClickable(Locators.LINK_MEDIA));
        driver.findElement(Locators.LINK_MEDIA).click();
        javaWaitSec(5);
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, Data.expectedUrlMedia);
    }*/




}
