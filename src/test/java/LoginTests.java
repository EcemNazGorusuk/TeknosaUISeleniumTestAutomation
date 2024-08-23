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

}
