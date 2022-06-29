import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{





    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="/html/body/div/form/div/span[2]")
    public static WebElement contentForAssert;



    @FindBy(name="username")
    public WebElement username;

    @FindBy (name="password")
    public WebElement password;

    @FindBy(xpath="/html/body/div/form/div/button")
    public  WebElement button;


    void FillSearch(String value){
        username.sendKeys(value);
    }
    void FiillPasword(String value){
        password.sendKeys(value);
    }
    void ClickYes(){
        button.click();
    }
}
