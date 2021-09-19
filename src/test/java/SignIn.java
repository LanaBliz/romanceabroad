import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SignIn extends BaseUI{
    By LINK_SIGN_IN = By.xpath("//a[@href='https://romanceabroad.com/users/login_form']");
    int indexLinkSignIn = 0;

    @Test
    public void testSignIn(){
        driver.findElements(LINK_SIGN_IN).get(indexLinkSignIn).click();
    }
}
