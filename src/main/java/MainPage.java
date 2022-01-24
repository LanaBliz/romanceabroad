import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BaseActions {
    public MainPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void clickJoinButton() {
        driver.findElement(Locators.BUTTON_REGISTRATION).click();
    }

    public void completeFirstPartOfRegistration() {
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(Data.email);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.TEXT_FIELD_PASSWORD)));
        driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(Data.password);
        wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON));
        driver.findElement(Locators.BUTTON).click();
        driver.findElement(Locators.BUTTON).click();
    }

    public void completeSecondPartOfRegistration() {
        driver.findElement(Locators.TEXT_FIELD_NICKNAME).sendKeys(generateNewNumber(Data.nickname, 10));
        driver.findElement(Locators.BUTTON_SELECT_DAY).click();
        driver.findElement(Locators.SELECT_DAY).click();
        driver.findElement(Locators.BUTTON_SELECT_MONTH).click();
        driver.findElement(Locators.SELECT_MONTH).click();
        driver.findElement(Locators.BUTTON_SELECT_YEAR).click();
        driver.findElement(Locators.SELECT_YEAR).click();
        driver.findElement(Locators.TEXT_FIELD_PHONE).sendKeys(Data.phone);
    }

}
