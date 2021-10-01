import org.testng.annotations.Test;
public class RegButtonTest extends BaseUI{

    @Test
    public void testRegButton(){
        mainPage.clickJoinButton();
        mainPage.completeFirstPardOfRegistration();
        mainPage.completeFirstSecondOfRegistration();
    }

}
