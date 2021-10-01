import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class MainPage extends BaseActions{
    public MainPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    public void clickJoinButton(){
        driver.findElement(Locators.BUTTON_REGISTRATION).click();
    }

    public void completeFirstPardOfRegistration(){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(Data.email);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.TEXT_FIELD_PASSWORD)));
        driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(Data.password);
        wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON));
        driver.findElement(Locators.BUTTON).click();
        driver.findElement(Locators.BUTTON).click();
    }

    public void completeFirstSecondOfRegistration(){
        driver.findElement(Locators.TEXT_FIELD_NICKNAME).sendKeys(generateNewNumber(Data.nickname, 10));
        driver.findElement(By.cssSelector("#daySelect")).click();
        driver.findElement(By.xpath("//li[@data-handler='selectDay']//a[text()='2']")).click();
        driver.findElement(By.cssSelector("#monthSelect")).click();
        driver.findElement(By.xpath("//li[@data-handler='selectMonth']//a[text()='Jan']")).click();
        driver.findElement(By.cssSelector("#yearSelect")).click();
        driver.findElement(By.xpath("//li[@data-handler='selectYear']//a[text()='1999']")).click();
        driver.findElement(Locators.TEXT_FIELD_PHONE).sendKeys(Data.phone);
        WebElement checkboxConfirmation = driver.findElement(By.cssSelector("input#confirmation"));
        checkboxConfirmation.click();
    }

    public void clickJoinTodayLink(){
        String currentUrl;
        driver.findElement(Locators.LINK_JOIN).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, Data.expectedUrlHome);
        driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(Data.email);
        driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(Data.password);
        driver.findElement(Locators.BUTTON).click();
        driver.findElement(Locators.BUTTON).click();
    }


}
