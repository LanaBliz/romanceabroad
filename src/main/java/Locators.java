import org.openqa.selenium.By;

public class Locators {

    //Blog Test
    public static final By LINK_BLOG = By.xpath("//a[@href='https://romanceabroad.com/content/view/blog']");

    //Book Now Test and Tour To Ukrain Test
    public static final By LINK_TOUR_TO_UKRAINE = By.cssSelector("a[href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine']");

    //Home test
    public static final By LINK_HOME = By.xpath("//a[contains(text(),'HOME')]");

    //Join Test and Reg Button Test
    public static final By TEXT_FIELD_EMAIL = By.xpath("//input[@id='email']");
    public static final By TEXT_FIELD_PASSWORD = By.cssSelector("input#password");
    public static final By LINK_JOIN = By.cssSelector("a[data-action='show-registration-block']");
    public static final By BUTTON = By.xpath("//button[@data-action='next-page'][text()='Next']");

    //Photo Test
    public static final By LINK_MEDIA = By.cssSelector("a[href='https://romanceabroad.com/media/index']");

    //Reg Button Test
    public static final By BUTTON_REGISTRATION = By.xpath("//button[@id='show-registration-block']");

    //Search Test
    public static final By LINK_SEARCH = By.xpath("//a[@href='https://romanceabroad.com/users/search']");

    //Sign In test
    public static final By LINK_SIGN_IN = By.xpath("//a[@href='https://romanceabroad.com/users/login_form']");

    //Store Test
    public static final By LINK_STORE = By.cssSelector("a[href='https://romanceabroad.com/store/category-sweets']");

    //View Test
    public static final By LINK_VIEW = By.xpath("//a[@href='https://romanceabroad.com/content/view/how-it-works']");
}
