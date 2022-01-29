import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class SearchTest extends BaseUI {

    @Test
    public void testSearch() {
        String actualTitle;
        String actualUrlSearch;

        List<WebElement> links = driver.findElements(Locators.TAB_OF_MAIN_PAGE);
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);
            wait.until(ExpectedConditions.elementToBeClickable(Locators.TAB_OF_MAIN_PAGE));
            /*links.get(i).click();*/
            mainPage.ajaxClick(links.get(i));
            mainPage.javaWaitSec(5);


            if (info.contains("WORK")) {
                actualTitle = driver.findElement(Locators.TITLE_OF_PAGE).getText();
                Assert.assertEquals(actualTitle, Data.expectedTitleHowWeWork);
            }
            if (info.contains("PRETTY_WOMEN")) {
                actualTitle = driver.findElement(Locators.TITLE_OF_PAGE).getText();
                actualUrlSearch = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedUrlSearch, actualTitle);
                Assert.assertEquals(actualUrlSearch, Data.expectedUrlSearch);
                wait.until(ExpectedConditions.elementToBeClickable(Locators.IMAGES));
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

        String currentUrl;
        wait.until(ExpectedConditions.elementToBeClickable(Locators.LINK_SEARCH));
        //driver.findElement(Locators.LINK_SEARCH).click();
        mainPage.ajaxClick(driver.findElement(Locators.LINK_SEARCH));
        mainPage.javaWaitSec(5);


        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, Data.expectedUrlSearch);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        searchPage.selectSortBy();
        searchPage.selectMinAndMaxAge();
        softAssert.assertAll();
    }

    public void validateAssertions(){
        Assert.assertEquals("Web","Web is");
        Assert.assertTrue(driver.findElement(By.xpath("//a")).isSelected(), "Element is not displayed");
        Assert.fail("Element is not displayed");
    }

    @Test
    public void selectRandomDropDownList(){
        wait.until(ExpectedConditions.elementToBeClickable(Locators.LINK_SEARCH));
        /*driver.findElement(Locators.LINK_SEARCH).click();*/
        mainPage.ajaxClick(driver.findElement(Locators.LINK_SEARCH));
        mainPage.javaWaitSec(5);
        int sizeOfDropDownListSortBy = searchPage.getSizeDropDownList(Locators.DROP_DOWN_LIST_MAX_AGE);
        System.out.println(sizeOfDropDownListSortBy);
        for (int i = 0; i < 5; i++) {
            searchPage.selectItemDropDownRandomOption(Locators.DROP_DOWN_LIST_MAX_AGE,"Sort by");
            mainPage.javaWaitSec(5);
        }
    }
}
