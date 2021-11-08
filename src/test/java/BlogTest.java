import org.testng.annotations.Test;

public class BlogTest extends BaseUI{

    @Test
    public void testBlog(){
        mainPage.blogUrlAssertionEquality();
    }
}
