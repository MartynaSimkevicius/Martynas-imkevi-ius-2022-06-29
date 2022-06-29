import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogOutPage extends BasePage {





    @FindBy(xpath="/html/body/nav/div/ul[2]/a")
    public static WebElement contentForAssert;

    public LogOutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="/html/body/nav/div/ul[2]/a")
    public WebElement logOut;

    public static boolean isMyAccountDisplayed() {
        return false;
    }


    void Out(){
        logOut.click();
    }
}
