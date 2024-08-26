import Base.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.MainPage;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

@Feature("Search Functionality Test Scenarios")
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

    @Test(description = "Product, Category, or Brand Search Control - Filter by Brand in Search Results")
    public void tc02_checkSearchWithFilters() throws InterruptedException {
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
        mainPage.displaySearchResultTitle()
                .selectCheckboxesForBrandFilter();
        sleepThread(3000);
    }

    @Test(description = "Product, Category, or Brand Search Control - Filter by Price Range")
    public void tc03_filterByPriceRange()  throws InterruptedException {
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
        mainPage.filterMinimumPriceRange(10000)
                .filterMaximumPriceRange(15000)
                .clickSearchIconButton();
    }

    @Test(description = "Product, Category, or Brand Search Control - Filter by Best Sellers")
    public void tc04_filterByBestSellers() throws InterruptedException {
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
        mainPage.clickBestSellersButton();
    }
}
