import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RegistrationTest extends BaseTest{

    RegistrationPage Registration= new RegistrationPage(driver);
    LogOutPage out= new LogOutPage(driver);

    @Test
    void CancreateAccount(){
        Registration.CreateAccount();
        Registration.YorName("Bandymas99");
        Registration.Password("Bandymas1999");
        Registration.PasswordReapeat("Bandymas1999");
        Registration.Submit();
        Assertions.assertEquals("Logout, Bandymas99", LogOutPage.contentForAssert.getText());
        Assertions.assertTrue(LogOutPage.contentForAssert.isDisplayed());
        out.Out();

    }

    @Test
    void CannotcreateAccount(){
        Registration.CreateAccount();
        Registration.YorName("Baandymas");
        Registration.Password("Bandymas1999");
        Registration.PasswordReapeat("Bandymas");
        Registration.Submit();
        Assertions.assertEquals("Įvesti slaptažodžiai nesutampa", RegistrationPage.contentForAssert.getText());
        Assertions.assertTrue(RegistrationPage.contentForAssert.isDisplayed());


    }

}
