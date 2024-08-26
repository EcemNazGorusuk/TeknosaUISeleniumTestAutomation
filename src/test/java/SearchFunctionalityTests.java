import Base.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.MainPage;
import org.testng.annotations.Test;

public class SearchFunctionalityTests extends BaseTest {
    LoginPage loginPage=new LoginPage();
    MainPage mainPage=new MainPage();
    HomePage homePage=new HomePage();

    @Test(description = "Product, Category, or Brand Search control")
    public void tc01_productCategoryBrandSearch() throws InterruptedException {
        loginPage.fillEmailOrPhoneNumberInputField(email)
                .clickContinueButton();
        sleepThread(3000);
        loginPage.fillPasswordInputField(password)
                .clickLoginButton();
        sleepThread(3000);
        loginPage.clickRemindLaterButton();
        sleepThread(3000);
        homePage.myAccountControl();
        sleepThread(3000);
        mainPage.clickSearchBar();
        sleepThread(1000);
        mainPage.enterSearchCriteria("klima");
        sleepThread(3000);
        mainPage.displaySearchResultTitle();

    }
}
