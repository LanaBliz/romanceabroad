import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class StorePage extends BaseActions{

    public StorePage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    public void storePageGiftsLinksList(){
        List<WebElement> links = driver.findElements(Locators.GIFT_BLOCK);
        System.out.println(links.size());
       /* for (int i = 0; i < links.size(); i++) {*/
        for (int i = 0; i < 3; i++) {
            String info = links.get(i).getText();
            System.out.println(info);
            wait.until(ExpectedConditions.elementToBeClickable(Locators.GIFT_BLOCK));
            /*links.get(i).click();*/
            ajaxClick(links.get(i));
            javaWaitSec(3);

            driver.get(Data.mainUrl);
            wait.until(ExpectedConditions.elementToBeClickable(Locators.LINK_STORE));
            ajaxClick(driver.findElement(Locators.LINK_STORE));
            javaWaitSec(3);
            /*driver.findElement(Locators.LINK_STORE).click();*/
            links = driver.findElements(Locators.GIFT_BLOCK);
        }
    }

}
