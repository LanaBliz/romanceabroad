import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class StorePage extends BaseActions{

    public StorePage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    public void storeEqualityAssertion (){
        String currentUrl;
        driver.findElement(Locators.LINK_STORE).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, Data.expectedUrlSStore);
    }

    public void storePageGiftsLinksList(){
        List<WebElement> links = driver.findElements(Locators.GIFT_BLOCK);
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);
            links.get(i).click();

            driver.get(Data.mainUrl);
            driver.findElement(Locators.LINK_STORE).click();
            links = driver.findElements(Locators.GIFT_BLOCK);
        }
    }

}
