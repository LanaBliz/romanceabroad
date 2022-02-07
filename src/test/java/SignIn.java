import org.testng.annotations.Test;

public class SignIn extends BaseUI{
    int indexLinkSignIn = 0;

    public static final boolean testCase26 = true;

    @Test(priority = 1, enabled = testCase26, groups = {"user", "admin"})
    public void testSignInCase26(){
        driver.findElements(Locators.LINK_SIGN_IN).get(indexLinkSignIn).click();
    }
}
