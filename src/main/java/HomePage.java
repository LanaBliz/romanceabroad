import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BaseActions{

    public HomePage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    public int verifyHomePageIFrameSize (){
        int size = driver.findElements(By.xpath("//iframe")).size();
        System.out.println(size+ "" + "iFrame number");
        return size;
    }


}
