import org.testng.annotations.Test;

public class SearchTest extends BaseUI {

    @Test
    public void testSearch() {
        searchPage.clickSearchButton();
        searchPage.selectSortBy();
        searchPage.selectMinAndMaxAge();
    }
}
