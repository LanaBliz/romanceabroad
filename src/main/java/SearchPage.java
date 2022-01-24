import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage extends BaseActions{

    public SearchPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);

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

   /* public void searchPageAssertionsValidation (){
        Assert.assertEquals("Web","Web is");
        Assert.assertTrue(driver.findElement(By.xpath("//a")).isSelected(), "Element is not displayed");
        Assert.fail("Element is not displayed");
    }

*/
}
