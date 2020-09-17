import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTests extends BaseUI {
    String currentUrlSearch;


    @Test
    public void testSearch() {
        driver.findElement(Locators.LINK_SEARCH).click();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, Data.expectedUrlSearch);

    }


}
