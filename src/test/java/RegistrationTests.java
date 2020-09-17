import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class RegistrationTests extends BaseUI {

    @Test
    public void testRegistrationBlock() {
        driver.findElement(Locators.BUTTON_REGISTRATION).click();

    }

    @Test
    public void testJoinForFree() {
        driver.findElement(By.xpath("//button[@id='show-registration-block']")).click();
        driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(Data.email);
        driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(Data.password);
        driver.findElement(Locators.BUTTON_NEXT).click();
        driver.findElement(Locators.TEXT_FIELD_NICKNAME).sendKeys(Data.nickname);
        driver.findElement(Locators.TEXT_FIELD_PHONE).sendKeys(Data.phone);

    }

}