import org.testng.Assert;
import org.testng.annotations.Test;

public class TourToUkrainTest extends BaseUI {
    String currentUrl;
    int indexLinkTourToUkraine = 1;

    @Test
    public void testTourToUkraine() {
        driver.findElements(Locators.LINK_TOUR_TO_UKRAINE).get(indexLinkTourToUkraine).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, Data.expectedUrlTourToUkraine);
    }
}
