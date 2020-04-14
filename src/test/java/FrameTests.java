import base.BaseTests;
import org.testng.annotations.Test;

public class FrameTests extends BaseTests {

    @Test
    public void testTopFrame(){
        driver.get(System.getProperty("site.frames.url"));
        eyesManager.validateFrame("frame-top");
    }

}
