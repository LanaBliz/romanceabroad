import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomePage extends BaseActions{

    public HomePage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    public void homeUrlEqualityAssertion (){
        String currentUrl;
        driver.findElement(Locators.LINK_HOME).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, Data.expectedUrlHome);
    }

    public int verifyHomePageIFrameSize (){
        int size = driver.findElements(By.xpath("//iframe")).size();
        System.out.println(size+ "" + "iFrame number");
        return size;
    }


}
