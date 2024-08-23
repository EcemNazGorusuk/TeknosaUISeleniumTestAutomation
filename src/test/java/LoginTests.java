import Base.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.MainPage;
import org.testng.annotations.Test;

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
        loginPage.checkMaxCharacterErrMsgEmail(errMsgMaxCharEmail);
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

    //min char
}
