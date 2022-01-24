import org.testng.Assert;
import org.testng.annotations.Test;

public class BookNowTest extends BaseUI{

    @Test
    public void testBookNow(){
        String currentUrl;
        int indexLinkBookNow = 0;
        driver.findElements(Locators.LINK_TOUR_TO_UKRAINE).get(indexLinkBookNow).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, Data.expectedUrlTourToUkraine);
    }
}
