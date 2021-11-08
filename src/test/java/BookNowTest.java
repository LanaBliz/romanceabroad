import org.testng.annotations.Test;

public class BookNowTest extends BaseUI{

    @Test
    public void testBookNow(){
        mainPage.bookNowUrlAssertionEquality();
    }
}
