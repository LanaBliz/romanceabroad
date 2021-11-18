import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class SearchPage extends BaseActions{

    public SearchPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);

    }

    public void List(){
        String actualTitle;
        String actualUrlSearch;

        List<WebElement> links = driver.findElements(Locators.TAB_OF_MAIN_PAGE);
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);
            links.get(i).click();

            if (info.contains("WORK")) {
                actualTitle = driver.findElement(Locators.TITLE_OF_PAGE).getText();
                Assert.assertEquals(actualTitle, Data.expectedTitleHowWeWork);
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
    }

    public void clickSearchButton(){
        String currentUrl;
        driver.findElement(Locators.LINK_SEARCH).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, Data.expectedUrlSearch);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void selectSortBy(){
        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
        getDropDownListByIndex(dropDownListSortBy, Data.dropDownListSortByIndex);
    }

    public void selectMinAndMaxAge(){
        WebElement dropDownListSortByMinAge = driver.findElement(Locators.DROP_DOWN_LIST_MIN_AGE);
        getDropDownListByValue(dropDownListSortByMinAge, Data.dropDownListMinAgeValue);
        WebElement dropDownListSortByMaxAge = driver.findElement(Locators.DROP_DOWN_LIST_MAX_AGE);
        getDropDownListByText(dropDownListSortByMaxAge, Data.dropDownListMaxAgeText);
    }

    public void searchPageAssertionsValidation (){
        Assert.assertEquals("Web","Web is");
        Assert.assertTrue(driver.findElement(By.xpath("//a")).isSelected(), "Element is not displayed");
        Assert.fail("Element is not displayed");
    }


}
