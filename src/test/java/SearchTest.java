import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SearchTest extends BaseUI {
    String currentUrlSearch;

    @Test
    public void testSearch() {

        String actualTitle;
        String actualUrlSearch;
        String expectedTitleHowWeWork = "Ukrainian women for marriage";
        List<WebElement> links = driver.findElements(Locators.TAB_OF_MAIN_PAGE);
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);
            links.get(i).click();

            if (info.contains("WORK")) {
                actualTitle = driver.findElement(Locators.TITLE_OF_PAGE).getText();
                Assert.assertEquals(expectedTitleHowWeWork, actualTitle);
            }
            if (info.contains("PRETTY_WOMEN")) {
                actualTitle = driver.findElement(Locators.TITLE_OF_PAGE).getText();
                actualUrlSearch = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedUrlSearch, actualTitle);
                Assert.assertEquals(actualUrlSearch, Data.expectedUrlSearch);
                driver.findElement(Locators.IMAGES).isDisplayed();

                if (actualUrlSearch.contains("#")){
                    Assert.fail("It contains restricted #");
                }else{
                    System.out.println("No special character. It is good URL");
                }
            }

            driver.get(Data.mainUrl);
            links = driver.findElements(Locators.TAB_OF_MAIN_PAGE);

        }








        Assert.assertTrue(driver.findElement(Locators.LINK_SEARCH).isDisplayed(), "Element is not displayed");
        searchPage.clickSearchButton();

        //Assert.assertEquals(currentUrlSearch, Data.expectedUrlSearch);
        //softAssert.assertEquals(currentUrlSearch, Data.expectedUrlSearch, "Element is wrong ");

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
