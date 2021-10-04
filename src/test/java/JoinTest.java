import org.testng.annotations.Test;

public class JoinTest extends BaseUI{

    @Test
    public void testJoin(){
        mainPage.clickJoinTodayLink();
        registrationForm.getStarted();
        registrationForm.getStartedSecondPage();
        }
}
