import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BookNowTest extends BaseUI{

    @Test
    public void testBookNow(){
        String currentUrl;
        int indexLinkBookNow = 0;
        wait.until(ExpectedConditions.elementToBeClickable(Locators.LINK_TOUR_TO_UKRAINE));
        mainPage.ajaxClick(driver.findElements(Locators.LINK_TOUR_TO_UKRAINE).get(indexLinkBookNow));
        mainPage.javaWaitSec(5);
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, Data.expectedUrlTourToUkraine);
    }
}
