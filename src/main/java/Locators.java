import org.openqa.selenium.By;

public class Locators {

    //Media Page
    public static final By LINK_MEDIA = By.xpath("/a[@href='https://romanceabroad.com/media/index']");

    //Registration
    public static final By BUTTON_REGISTRATION = By.cssSelector("#show-registration-block");
    public static final By BUTTON_NEXT = By.xpath("//button[@data-action='next-page'][text()='Next']");
    public static final By TEXT_FIELD_EMAIL = By.cssSelector("input#email");
    public static final By TEXT_FIELD_PASSWORD = By.cssSelector("input#password");
    public static final By TEXT_FIELD_NICKNAME = By.cssSelector("#nickname");
    public static final By TEXT_FIELD_PHONE = By.cssSelector("input[name='data[phone]");


    //Search Page
    public static final By LINK_SEARCH = By.xpath("//a[@href='https://romanceabroad.com/users/search']");

    //How We Work
    public static final By LINK_HOWWEWORK = By.xpath("//a[@href='https://romanceabroad.com/content/view/how-it-works']");

    //Gifts
    public static final By LINK_GIFTS = By.xpath("//a[@href='https://romanceabroad.com/store/category-sweets']");

    //Tour Page
    public static final By LINK_TOUR = By.xpath("//a[@href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine']");

    //Blog Page
    public static final By LINK_BLOG = By.xpath("//a[@href='https://romanceabroad.com/content/view/blog']");


}
