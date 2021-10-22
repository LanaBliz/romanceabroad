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
    public static final By TEXT_FIELD_NICKNAME = By.cssSelector("input#nickname");
    public static final By TEXT_FIELD_PHONE = By.xpath("//input[@name='data[phone]']");
    public static final By BUTTON_SELECT_DAY = By.cssSelector("#daySelect");
    public static final By SELECT_DAY = By.xpath("//li[@data-handler='selectDay']//a[text()='2']");
    public static final By BUTTON_SELECT_MONTH = By.cssSelector("#monthSelect");
    public static final By SELECT_MONTH = By.xpath("//li[@data-handler='selectMonth']//a[text()='Jan']");
    public static final By BUTTON_SELECT_YEAR = By.cssSelector("#yearSelect");
    public static final By SELECT_YEAR = By.xpath("//li[@data-handler='selectYear']//a[text()='1999']");
    public static final By CHECKBOX_CONFIRMATION = By.cssSelector("input#confirmation");

    //Photo Test
    public static final By LINK_MEDIA = By.cssSelector("a[href='https://romanceabroad.com/media/index']");

    //Reg Button Test
    public static final By BUTTON_REGISTRATION = By.xpath("//button[@id='show-registration-block']");

    //Search Test
    public static final By LINK_SEARCH = By.xpath("//a[@href='https://romanceabroad.com/users/search']");
    public static final By DROP_DOWN_LIST_SORT_BY = By.xpath("//div[@class='pull-left pl15']//select");
    public static final By DROP_DOWN_LIST_MIN_AGE = By.xpath("//div[@class='col-xs-5 no-padding-left']//select");
    public static final By DROP_DOWN_LIST_MAX_AGE = By.xpath("//div[@class='col-xs-5 no-padding-right']//select");

    //Sign In test
    public static final By LINK_SIGN_IN = By.xpath("//a[@href='https://romanceabroad.com/users/login_form']");

    //Store Test
    public static final By LINK_STORE = By.cssSelector("a[href='https://romanceabroad.com/store/category-sweets']");
    public static final By GIFT_BLOCK = By.xpath("//div[@class='contrasting-block']");

    //View Test
    public static final By LINK_VIEW = By.xpath("//a[@href='https://romanceabroad.com/content/view/how-it-works']");

    //Iframe Test
    public static final By YOUTUBE_VIDEO_BUTTON = By.cssSelector("button[class='ytp-large-play-button ytp-button']");
    public static final By LINK_IFRAME = By.cssSelector("iframe[src='https://www.youtube.com/embed/RRECuJzm3IY?start=85']");

    //Conditions
    public static final By TITLE_OF_PAGE = By.xpath("//h1");
    public static final  By TAB_OF_MAIN_PAGE = By.xpath("//ul[@class='navbar-nav']/li");
    public static final By IMAGES = By.xpath("//a[@class='g-pic-border g-grounded']");
}
