import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage{
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="/html/body/div/form/div[3]/span")
    public static WebElement contentForAssert;

    @FindBy(xpath="/html/body/div/form/div/h4/a")
    public  WebElement CeateAnAccountr;

    @FindBy (id = "username") private WebElement username;

    @FindBy (id = "password") private WebElement password;

    @FindBy(id="passwordConfirm")
    public  WebElement passwordReapet;

    @FindBy(xpath="/html/body/div/form/button")
    public  WebElement submit;

   void  CreateAccount (){CeateAnAccountr.click();}

    void YorName(String value){
        username.sendKeys(value);
    }

    void Password(String value){
        password.sendKeys(value);
    }
    void PasswordReapeat(String value){
        passwordReapet.sendKeys(value);
    }
    void Submit(){
        submit.click();
    }
}
