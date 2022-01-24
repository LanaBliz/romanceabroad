import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends BaseUI {
    String currentUrl;

    @Test
    public void testHome() {
        String currentUrl;
        driver.findElement(Locators.LINK_HOME).click();
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
