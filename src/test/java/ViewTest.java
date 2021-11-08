import org.testng.annotations.Test;

public class ViewTest extends BaseUI{

    @Test
    public void testView(){
        mainPage.viewAssertionEquality();
    }
}
