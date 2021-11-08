import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends BaseUI {
    String currentUrl;

    @Test
    public void testHome() {
        homePage.homeUrlEqualityAssertion();
    }

    @Test
    public void iFrameYoutube() {
        int numberOfIFrames = homePage.verifyHomePageIFrameSize();
        Assert.assertTrue(numberOfIFrames > 0);
        homePage.verifyHomePageIFrameSize();
    }
}
