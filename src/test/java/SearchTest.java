import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SearchTest extends BaseUI {

    @Test
    public void testSearch() {
        searchPage.List();
        Assert.assertTrue(driver.findElement(Locators.LINK_SEARCH).isDisplayed(), "Element is not displayed");
        searchPage.clickSearchButton();
        searchPage.selectSortBy();
        searchPage.selectMinAndMaxAge();
        softAssert.assertAll();
    }

    public void validateAssertions(){
        Assert.assertEquals("Web","Web is");
        Assert.assertTrue(driver.findElement(By.xpath("//a")).isSelected(), "Element is not displayed");
        Assert.fail("Element is not displayed");
    }
}
