import org.testng.annotations.Test;

public class StoreTest extends BaseUI{

    @Test
    public void testStore(){
        storePage.storeEqualityAssertion();
        storePage.storePageGiftsLinksList();
    }
}
