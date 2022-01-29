import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends BaseUI {

    @Test
    public void testHome() {
        String currentUrl;
        mainPage.ajaxClick(driver.findElement(Locators.LINK_HOME));
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, Data.expectedUrlHome);
    }

    @Test
    public void iFrameYoutube() {
        int numberOfIFrames = homePage.verifyHomePageIFrameSize();
        Assert.assertTrue(numberOfIFrames > 0);
        homePage.verifyHomePageIFrameSize();
    }

    @Test
    public void testLinksOnMinPage () {
        mainPage.checkLinksOnWebPage("//a","href");
        mainPage.checkLinksOnWebPage("//img","src");
        driver.findElement(Locators.LINK_SEARCH);
        mainPage.checkLinksOnWebPage("//a","href");
        mainPage.checkLinksOnWebPage("//img","src");
    }

}
