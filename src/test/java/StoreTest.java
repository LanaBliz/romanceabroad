import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class StoreTest extends BaseUI{
    String currentUrl;

    @Test
    public void testStore(){
        driver.findElement(Locators.LINK_STORE).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, Data.expectedUrlSStore);

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
