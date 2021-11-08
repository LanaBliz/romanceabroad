import org.testng.annotations.Test;

public class TourToUkrainTest extends BaseUI {

    @Test
    public void testTourToUkraine() {
        mainPage.tourToUkraineAssertionEquality();
    }
}
