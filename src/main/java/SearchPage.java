import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SearchPage extends BaseActions{

    public SearchPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);

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


}
