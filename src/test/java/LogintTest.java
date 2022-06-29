import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LogintTest extends BaseTest {


    LoginPage Page = new LoginPage(driver);
    LogOutPage out = new LogOutPage(driver);


    @Test
    void CanLogin() {
        //  Find.FillLoginFom();
        Page.FillSearch("Bandymas1");
        Page.FiillPasword("Bandymas1999");
        Page.ClickYes();
        Assertions.assertEquals("Logout, Bandymas1", LogOutPage.contentForAssert.getText());
        Assertions.assertTrue(LogOutPage.contentForAssert.isDisplayed());
        out.Out();

    }

    @Test
    void CannotLogin() {

        Page.FillSearch("B");
        Page.FiillPasword("Bandymas1999");
        Page.ClickYes();
        Assertions.assertEquals("Įvestas prisijungimo vardas ir/ arba slaptažodis yra neteisingi", LoginPage.contentForAssert.getText());
        Assertions.assertTrue(LoginPage.contentForAssert.isDisplayed());


    }
}