import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TourToUkrainTest extends BaseUI {

    @Test
    public void testTourToUkraine() {
        String currentUrl;
        int indexLinkTourToUkraine = 1;
        wait.until(ExpectedConditions.elementToBeClickable(Locators.LINK_TOUR_TO_UKRAINE));
        mainPage.ajaxClick(driver.findElements(Locators.LINK_TOUR_TO_UKRAINE).get(indexLinkTourToUkraine));
        /*driver.findElements(Locators.LINK_TOUR_TO_UKRAINE).get(indexLinkTourToUkraine).click();*/
        mainPage.javaWaitSec(3);
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, Data.expectedUrlTourToUkraine);
    }
}
