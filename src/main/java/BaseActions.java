import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;

public class BaseActions {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BaseActions(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

    public static String generateNewNumber(String name, int lenght){
        return  name + RandomStringUtils.random(lenght, "172984757");
    }

    public void getDropDownListByIndex(WebElement element, int index) {
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    public void getDropDownListByText(WebElement element, String text) {
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }

    public void getDropDownListByValue(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByValue(value);
    }

    public void ajaxClick (WebElement element){
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public void ajaxClick (By by){
       // wait.until(ExpectedConditions.presenceOfElementLocated(by));
        wait.until(ExpectedConditions.elementToBeClickable(by));
        ajaxClick(driver.findElement(by));
    }

    public void ajaxClick (By by, int index){
        //wait.until(ExpectedConditions.presenceOfElementLocated(by));
        wait.until(ExpectedConditions.elementToBeClickable(by));
        ajaxClick(driver.findElements(by).get(index));
    }

    public void performClick (By locator){
        WebElement element = driver.findElement(locator);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
        actions.click().build().perform();
    }

    public void performClick (By locator, int index){
        WebElement element = driver.findElements(locator).get(index);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
        actions.click().build().perform();
    }

    public void performClick (WebElement element){
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
        actions.click().build().perform();
    }

    public void clickUnselectedCheckbox(By checkbox){
        WebElement currentCheckbox = driver.findElement(checkbox);
        if (!currentCheckbox.isSelected()){
            ajaxClick(currentCheckbox);
        }
    }

    public void scrollToBottomOfPage(){
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight);");
    }

    public void getTextString (By locator, String text){
        driver.findElement(locator).getText();
        System.out.println(text);
    }

    public void getTextNumber (By locator, int number){
        driver.findElement(locator).getText();
        System.out.println(number);
    }

    public void getNavigateToLinkPage (By locator){driver.findElement(locator).click();}

    public void getElementIsDisplayed (By locator){
        WebElement element = driver.findElement(locator);
        boolean elementDisplayed = element.isDisplayed();
        if (element.isDisplayed()){
            System.out.println(elementDisplayed + "" + "element is displayed");
        }else{
            System.out.println(elementDisplayed + "" + "element is not displayed");
        }
    }
}
