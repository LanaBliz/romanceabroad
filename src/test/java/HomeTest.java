import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class HomeTest extends BaseUI {
    int i;

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
    public void testLinksOnMinPage() {
        mainPage.checkLinksOnWebPage("//a", "href");
        mainPage.checkLinksOnWebPage("//img", "src");
        driver.findElement(Locators.LINK_SEARCH);
        mainPage.checkLinksOnWebPage("//a", "href");
        mainPage.checkLinksOnWebPage("//img", "src");
    }

    @Test
    public void smokeTestHomePage() {
        wait.until(ExpectedConditions.elementToBeClickable(Locators.LINK_HOME));
        List<WebElement> mainTabs = driver.findElements(By.xpath("//ul[@class='navbar-nav']//li/a"));
        for (int i = 0; i < mainTabs.size(); i++){
            mainTabs.get(i).click();
            driver.get(Data.mainUrl);
            mainTabs = driver.findElements(By.xpath("//ul[@class='navbar-nav']//li/a"));
        }
    }
}
