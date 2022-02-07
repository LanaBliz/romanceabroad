import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Conditions extends BaseUI {

    public static final boolean testCase1 = true;
    public static final boolean testCase2 = true;
    public static final boolean testCase3 = true;
    public static final boolean testCase4 = true;
    public static final boolean testCase5 = true;
    public static final boolean testCase6 = true;
    public static final boolean testCase7 = true;
    public static final boolean testCase8 = true;
    public static final boolean testCase9 = true;
    public static final boolean testCase10 = true;
    public static final boolean testCase11 = true;
    public static final boolean testCase12 = true;
    public static final boolean testCase13 = true;

    @Test(priority = 1, enabled = testCase1, groups = {"user", "admin"})
    public void testCase1() {
        String fruit = "orange";
        String fruit2 = "kiwi";

        if (fruit2.contains("kiwi") || fruit.contains("kiwi")) {
            System.out.println("We can find our fruit");
        } else {
            Assert.fail("We can't find fruit");
        }

    }

    @Test(priority = 2, enabled = testCase2, groups = {"ie"})
    public void testCase2() {
        int number1 = 10;
        int number2 = 10;
        int sum;

        if (number2 == number1) {
            sum = 95 + 100;
        } else {
            sum = 100 - 95;
        }
        System.out.println(sum);
    }

    @Test(priority = 3, enabled = testCase3, groups = {"ie"})
    public void testCase3() {
        boolean requirement = false;
        if (!requirement) {
            System.out.println("Boolean is true!");
        } else {
            Assert.fail("Boolean is false");
        }
    }

    @Test(priority = 4, enabled = testCase4, groups = {"ie"})
    public void testCase4() {
        WebElement tabSearch = driver.findElement(Locators.LINK_SEARCH);
        if (tabSearch.isDisplayed()) {
            tabSearch.click();
        } else {
            Assert.fail("\"We can't find Pretty Women tab\"");
        }

    }

    @Test(priority = 5, enabled = testCase5, groups = {"ie"})
    public void testCase5() {
        mainPage.clickJoinButton();
        registrationForm.getStarted();

        WebElement checkbox = driver.findElement(Locators.CHECKBOX_CONFIRMATION);

        if (!checkbox.isSelected()) {
            checkbox.click();
            System.out.println("Checkbox is selected!");
        }

    }

    @Test(priority = 6, enabled = testCase6, groups = {"ie"})
    public void testCase6() {
        /*List<String> crunchifyList1 = new ArrayList<>(Arrays.asList("kiwi", "orange"));
        String element = crunchifyList1.get(0);
        System.out.println(element);

        if (crunchifyList1.contains("orange")){
            System.out.println(crunchifyList1);
        }*/

        List<Integer> crunchifyList1 = new ArrayList<>(Arrays.asList(5, 10, 19));
        int sum = crunchifyList1.get(1) + crunchifyList1.get(2);
        System.out.println(sum);

    }

    @Test(priority = 7, enabled = testCase7, groups = {"ie"})
    public void testCase7() {
        String actualTitle;
        String actualUrlPrettyWomen;
        String expectedTitleHowWeWork = "UKRAINIAN GIRLS DATING SITE";
        List<WebElement> links = driver.findElements(Locators.TAB_OF_MAIN_PAGE);
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            /*WebElement elementOfList = links.get(i);
            String info = elementOfList.getText();*/
            String info = links.get(i).getText();
            System.out.println(info);
            //links.get(i).click();
            mainPage.ajaxClick(links.get(i));

            if (info.contains("WORK")) {
                actualTitle = driver.findElement(Locators.TITLE_OF_PAGE).getText();
                Assert.assertEquals(actualTitle, expectedTitleHowWeWork);
            }
            if (info.contains("PRETTY_WOMEN")) {
                actualTitle = driver.findElement(Locators.TITLE_OF_PAGE).getText();
                actualUrlPrettyWomen = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedUrlTitlePrettyWomen, actualTitle);
                Assert.assertEquals(actualUrlPrettyWomen, Data.expectedUrlPrettyWomen);
                driver.findElement(Locators.IMAGES).isDisplayed();

                if (actualUrlPrettyWomen.contains("#")){
                    Assert.fail("It contains restricted #");
                }else{
                    System.out.println("No special character. It is good URL");
                }
            }

            driver.get(Data.mainUrl);
            links = driver.findElements(Locators.TAB_OF_MAIN_PAGE);

        }

    }

    @Test(priority = 8, enabled = testCase8, groups = {"ie"})
    public void testCase8() {
        List<Integer> crunchifyList1 = new ArrayList<>(Arrays.asList(5, 10, 19));
        crunchifyList1.add(10);
        System.out.println(crunchifyList1.size());

        for (int i = 0; i < crunchifyList1.size(); i++) {
            int element = crunchifyList1.get(i);
            System.out.println(element);
        }

    }

    @Test(priority = 9, enabled = testCase9, groups = {"ie"})
    public void testCase9() {
        String phrase = "Melon is inside list";
        List<String> crunchifyList1 = new ArrayList<>(Arrays.asList("apple", "kiwi", phrase));
        crunchifyList1.add("melon");
        System.out.println(crunchifyList1.size());

        for (int i = 0; i < crunchifyList1.size(); i++) {
            String element = crunchifyList1.get(i);
            System.out.println(i + "iteration");


            /*if (element.contains("apple")) {
                System.out.println(phrase);
                break;
                //continue;
            }if (element.equals("orange")){
                System.out.println("Orange");
            }if (element.contains("i")){
                System.out.println("III");
            }else{
                System.out.println("Bed loop");
            }*/
        }

    }

    @Test(priority = 10, enabled = testCase10, groups = {"ie"})
    public void testCase10 (){
        wait.until(ExpectedConditions.elementToBeClickable(Locators.TAB_OF_MAIN_PAGE));
        mainPage.ajaxClick(Locators.TAB_OF_MAIN_PAGE, 3);
    }

    @Test(priority = 11, enabled = testCase11, groups = {"ie"})
    public void testCase11 (){
        wait.until(ExpectedConditions.elementToBeClickable(Locators.TAB_OF_MAIN_PAGE));
        mainPage.perfomClick(Locators.TAB_OF_MAIN_PAGE);
    }

    @Test(priority = 12, enabled = testCase12, groups = {"ie"})
    public void testCaase12 (){
        wait.until(ExpectedConditions.elementToBeClickable(Locators.TAB_OF_MAIN_PAGE));
        mainPage.perfomClick(Locators.TAB_OF_MAIN_PAGE, 4);
    }

    @Test(priority = 13, enabled = testCase13, groups = {"ie"})
    public void testCasee13 (){
        wait.until(ExpectedConditions.elementToBeClickable(Locators.TAB_OF_MAIN_PAGE));
        mainPage.scrollToBottomOfPage();
    }

}

