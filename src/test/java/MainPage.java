import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainPage {
    String mainUrl = "https://romanceabroad.com/";
    WebDriver driver;
    String currentUrl;
    String expectedUrlSearch = "https://romanceabroad.com/users/search";
    String expectedUrlMedia = "https://romanceabroad.com/media/index";
    String expectedUrlHome = "https://romanceabroad.com/#";
    String expectedUrlView = "https://romanceabroad.com/content/view/how-it-works";
    String expectedUrlSStore = "https://romanceabroad.com/store/category-sweets";
    String expectedUrlTourToUkraine = "https://romanceabroad.com/store/sweets/20-tour_to_ukraine";
    String expectedUrlBlog = "https://romanceabroad.com/content/view/blog";
    String email = "12@gmail.com";
    String password = "12@gmail.com";
    By LINK_SEARCH = By.xpath("//a[@href='https://romanceabroad.com/users/search']");
    By LINK_MEDIA = By.cssSelector("a[href='https://romanceabroad.com/media/index']");
    By LINK_SIGN_IN = By.xpath("//a[@href='https://romanceabroad.com/users/login_form']");
    By BUTTON_REGISTRATION = By.xpath("//button[@id='show-registration-block']");
    By LINK_HOME = By.xpath("//a[contains(text(),'HOME')]");
    By LINK_VIEW = By.xpath("//a[@href='https://romanceabroad.com/content/view/how-it-works']");
    By LINK_STORE = By.cssSelector("a[href='https://romanceabroad.com/store/category-sweets']");
    By LINK_TOUR_TO_UKRAINE = By.cssSelector("a[href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine']");
    By LINK_BLOG = By.xpath("//a[@href='https://romanceabroad.com/content/view/blog']");
    By LINK_JOIN = By.cssSelector("a[data-action='show-registration-block']");
    By TEXT_FIELD_EMAIL = By.xpath("//input[@id='email']");
    By TEXT_FIELD_PASSWORD = By.cssSelector("input#password");
    By BUTTON = By.xpath("//button[@data-action='next-page'][text()='Next']");
    int indexLinkSignIn = 0;
    int indexLinkTourToUkraine = 1;
    int indexLinkBookNow = 0;
    int indexButtonNext = 1;


    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(mainUrl);
    }

    @Test
    public void testSearch(){
        driver.findElement(LINK_SEARCH).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, expectedUrlSearch);
    }

    @Test
    public void testPhoto(){
        driver.findElement(LINK_MEDIA).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, expectedUrlMedia);
    }

    @Test
    public void testSignIn(){
         driver.findElements(LINK_SIGN_IN).get(indexLinkSignIn).click();
    }

    @Test
    public void testHome(){
        driver.findElement(LINK_HOME).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, expectedUrlHome);
    }

    @Test
    public void testView(){
        driver.findElement(LINK_VIEW).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, expectedUrlView);
    }

    @Test
    public void testStore(){
        driver.findElement(LINK_STORE).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, expectedUrlSStore);
    }

    @Test
    public void testTourToUkraine(){
        driver.findElements(LINK_TOUR_TO_UKRAINE).get(indexLinkTourToUkraine).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, expectedUrlTourToUkraine);
    }

    @Test
    public void testBlog(){
        driver.findElement(LINK_BLOG).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, expectedUrlBlog);

    }

    @Test
    public void testBookNow(){
        driver.findElements(LINK_TOUR_TO_UKRAINE).get(indexLinkBookNow).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, expectedUrlTourToUkraine);
    }



    @Test
    public void testJoin(){
        //By.xpath("//input[@id='password']")
        driver.findElement(LINK_JOIN).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, expectedUrlHome);
        driver.findElement(TEXT_FIELD_EMAIL).sendKeys(email);
        driver.findElement(TEXT_FIELD_PASSWORD).sendKeys(password);
        driver.findElement(BUTTON).click();
    }

    @Test
    public void testRegButton(){
        //By.cssSelector("input#email") By.xpath("//button[@data-action='next-page'][text()='Next']")
        driver.findElement(BUTTON_REGISTRATION).click();
        driver.findElement(TEXT_FIELD_EMAIL).sendKeys(email);
        driver.findElement(TEXT_FIELD_PASSWORD).sendKeys(password);
        driver.findElement(BUTTON).click();
    }

    @AfterMethod
    public void afterActions(){
        //driver.quit();
    }
}
