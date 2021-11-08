import org.testng.Assert;
import org.testng.annotations.Test;

public class PhotoTest extends BaseUI{
    String currentUrl;

    @Test
    public void testPhoto(){
        photoPage.photoUrlEqualityAssertoin();
    }
}
