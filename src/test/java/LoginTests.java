import Base.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.MainPage;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

@Feature("Login Test Scenarios")
public class LoginTests extends BaseTest {

    LoginPage loginPage=new LoginPage();
    MainPage mainPage=new MainPage();
    HomePage homePage=new HomePage();

    @Test(description = "Successful user login control")
    public void loginSuccessful() throws InterruptedException {
      loginPage.fillEmailOrPhoneNumberInputField(email)
               .clickContinueButton();
      sleepThread(3000);
      loginPage.fillPasswordInputField(password)
               .clickLoginButton();
      sleepThread(3000);
      loginPage.clickRemindLaterButton();
      sleepThread(3000);
      homePage.myAccountControl();
    }

    @Test(description = "Unsuccessful user login control with wrong email")
    public void checkUnsuccessfulLoginWithEmail() throws InterruptedException {
        loginPage.fillEmailOrPhoneNumberInputField("wrong-email@gmail.com")
                 .clickContinueButton();
        sleepThread(3000);
        loginPage.checkEmailErrorMessage(errMsgForWrongEmail);
    }

    @Test(description = "Unsuccessful user login control with wrong password")
    public void checkUnsuccessfulLoginWithPassword() throws InterruptedException {
        loginPage.fillEmailOrPhoneNumberInputField(email)
                 .clickContinueButton();
        sleepThread(3000);
        loginPage.fillPasswordInputField("wrongpasswd")
                 .clickLoginButton();
        sleepThread(3000);
        loginPage.checkPasswordErrorMessage(errMsgForWrongPassword);
    }

    @Test(description = "Maximum character control with wrong email")
    public void maxCharacterControlWithEmail() throws InterruptedException {
        loginPage.fillEmailOrPhoneNumberInputField(maxCharacter)
                 .clickContinueButton();
        sleepThread(3000);
        loginPage.checkMaxCharacterErrMsgEmail(errMessageEmailOrPhone);
    }

    @Test(description = "Maximum character control with wrong password")
    public void maxCharacterControlWithPassword() throws InterruptedException {
        loginPage.fillEmailOrPhoneNumberInputField(email)
                 .clickContinueButton();
        sleepThread(3000);
        loginPage.fillPasswordInputField(maxCharacter)
                .clickLoginButton();
        sleepThread(3000);
        loginPage.checkMaxCharacterErrMsgPassword(errMsgForWrongPassword);
    }


    @Test(description = "Minimum character control with wrong email")
    public void minCharacterControlWithEmail() throws InterruptedException {
        loginPage.fillEmailOrPhoneNumberInputField(minCharacter)
                 .clickContinueButton();
        sleepThread(3000);
        loginPage.checkMinCharacterErrMsgEmail(errMessageEmailOrPhone);
    }


    @Test(description = "Minimum character control with wrong password")
    public void minCharacterControlWithPassword() throws InterruptedException {
        loginPage.fillEmailOrPhoneNumberInputField(email)
                .clickContinueButton();
        sleepThread(3000);
        loginPage.fillPasswordInputField(minCharacter)
                .clickLoginButton();
        sleepThread(3000);
        loginPage.checkMinCharacterErrMsgPassword(errMsgForWrongPassword);
    }

    @Test(description = "Check for empty email or phone number field")
    public void checkEmptyEmailOrPhoneField() throws InterruptedException {
        loginPage.fillEmailOrPhoneNumberInputField("")
                 .clickContinueButton();
        sleepThread(3000);
        loginPage.emptyCharControlErrMsgEmail(errMessageEmailOrPhone);
    }


    @Test(description = "Check for empty password field")
    public void checkEmptyPasswordField() throws InterruptedException {
        loginPage.fillEmailOrPhoneNumberInputField(email)
                .clickContinueButton();
        sleepThread(3000);
        loginPage.fillPasswordInputField("")
                 .clickLoginButton();
        sleepThread(3000);
        loginPage.emptyCharControlErrMsgPassword(emptyErrPassword);
    }

}
