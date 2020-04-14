import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.SearchPage;

public class SearchTests extends BaseTests {

    private SearchPage page = new SearchPage(driver);

    @BeforeClass
    public static void launchApp(){
        driver.get(System.getProperty("site.bookstore.url"));
    }

    @Test
    public void testSearchByFullTitle(){
        String title = "Agile Testing";
        page.search(title);
        eyesManager.validateWindow();
    }

    @Test
    public void testSearchByFullTitle_Element(){
        String title = "Agile Testing";
        page.search(title);
        eyesManager.validateElement(By.id("pid3"));
        Assert.assertEquals(1, page.getNumberOfVisibleBooks(), "Number of books returned" );
    }

}
