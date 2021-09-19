import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SignIn extends BaseUI{

    int indexLinkSignIn = 0;

    @Test
    public void testSignIn(){
        driver.findElements(Locators.LINK_SIGN_IN).get(indexLinkSignIn).click();
    }
}
