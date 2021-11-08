import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Conditions extends BaseUI {

    @Test
    public void test1() {
        String fruit = "orange";
        String fruit2 = "kiwi";

        if (fruit2.contains("kiwi") || fruit.contains("kiwi")) {
            System.out.println("We can find our fruit");
        } else {
            Assert.fail("We can't find fruit");
        }

    }

    @Test
    public void test2() {
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

    @Test
    public void test3() {
        boolean requirement = false;
        if (!requirement) {
            System.out.println("Boolean is true!");
        } else {
            Assert.fail("Boolean is false");
        }
    }

    @Test
    public void test4() {
        WebElement tabSearch = driver.findElement(Locators.LINK_SEARCH);
        if (tabSearch.isDisplayed()) {
            tabSearch.click();
        } else {
            Assert.fail("\"We can't find Pretty Women tab\"");
        }

    }

    @Test
    public void test5() {
        mainPage.clickJoinButton();
        registrationForm.getStarted();

        WebElement checkbox = driver.findElement(Locators.CHECKBOX_CONFIRMATION);

        if (!checkbox.isSelected()) {
            checkbox.click();
            System.out.println("Checkbox is selected!");
        }

    }

    @Test
    public void test6() {
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

    @Test
    public void test7() {
        String actualTitle;
        String actualUrlPrettyWomen;
        String expectedTitleHowWeWork = "Ukrainian women for marriage";
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

    @Test
    public void test8() {
        List<Integer> crunchifyList1 = new ArrayList<>(Arrays.asList(5, 10, 19));
        crunchifyList1.add(10);
        System.out.println(crunchifyList1.size());

        for (int i = 0; i < crunchifyList1.size(); i++) {
            int element = crunchifyList1.get(i);
            System.out.println(element);
        }

    }

    @Test
    public void test9() {
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

    @Test
    public void test10 (){
       mainPage.ajaxClick(Locators.TAB_OF_MAIN_PAGE, 3);
    }

    @Test
    public void test11 (){
        mainPage.performClick(Locators.TAB_OF_MAIN_PAGE);
    }

    @Test
    public void test12 (){
        mainPage.performClick(Locators.TAB_OF_MAIN_PAGE, 4);
    }

    @Test
    public void test13 (){
        mainPage.scrollToBottomOfPage();
    }




}

