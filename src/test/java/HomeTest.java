import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class HomeTest extends BaseUI {
    int i;

    public static final boolean testCase16 = true;
    public static final boolean testCase17 = true;
    public static final boolean testCase18 = true;
    public static final boolean testCase19 = true;

    @Test(priority = 1, enabled = testCase16, groups = {"ie"})
    public void testHomeCase16() {
        String currentUrl;
        mainPage.ajaxClick(driver.findElement(Locators.LINK_HOME));
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, Data.expectedUrlHome);
    }

    @Test(priority = 3, enabled = testCase17, groups = {"user", "admin"})
    public void iFrameYoutubeCase17() {
        int numberOfIFrames = homePage.verifyHomePageIFrameSize();
        Assert.assertTrue(numberOfIFrames > 0);
        homePage.verifyHomePageIFrameSize();
    }

    @Test(priority = 2, enabled = testCase18, groups = {"user", "admin"})
    public void testLinksOnMinPageCase18() {
        mainPage.checkLinksOnWebPage("//a", "href");
        mainPage.checkLinksOnWebPage("//img", "src");
        driver.findElement(Locators.LINK_SEARCH);
        mainPage.checkLinksOnWebPage("//a", "href");
        mainPage.checkLinksOnWebPage("//img", "src");
    }

    @Test(priority = 1, enabled = testCase19, groups = {"user", "admin"})
    public void smokeTestHomePageCase19() {
        wait.until(ExpectedConditions.elementToBeClickable(Locators.LINK_HOME));
        List<WebElement> mainTabs = driver.findElements(Locators.MAIN_TABS);
        for (int i = 0; i < mainTabs.size(); i++){
            mainTabs.get(i).click();
            driver.get(Data.mainUrl);
            wait.until(ExpectedConditions.elementToBeClickable(Locators.LINK_HOME));
            mainTabs = driver.findElements(Locators.MAIN_TABS);
        }
    }
}
