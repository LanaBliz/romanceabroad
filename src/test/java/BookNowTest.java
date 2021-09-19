import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BookNowTest extends BaseUI{
    String currentUrl;
    String expectedUrlTourToUkraine = "https://romanceabroad.com/store/sweets/20-tour_to_ukraine";
    By LINK_TOUR_TO_UKRAINE = By.cssSelector("a[href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine']");
    int indexLinkBookNow = 0;

    @Test
    public void testBookNow(){
        driver.findElements(LINK_TOUR_TO_UKRAINE).get(indexLinkBookNow).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, expectedUrlTourToUkraine);
    }
}
