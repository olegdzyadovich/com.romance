import org.testng.Assert;
import org.testng.annotations.Test;

public class HowWeWorkTests extends BaseUI {
    String currentUrlHowWeWork;

    @Test
    public void testHowWeWork() {
        driver.findElement(Locators.LINK_HOWWEWORK).click();
        currentUrlHowWeWork = driver.getCurrentUrl();
        System.out.println(currentUrlHowWeWork);
        Assert.assertEquals(currentUrlHowWeWork, Data.expectedUrlHowwework);


    }


}
