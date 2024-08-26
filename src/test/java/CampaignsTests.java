import Base.BaseTest;
import Pages.*;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

@Feature("Campaign Test Scenarios")
public class CampaignsTests extends BaseTest {
    LoginPage loginPage=new LoginPage();
    HomePage homePage=new HomePage();
    CampaignsPage campaignsPage=new CampaignsPage();
    CampaignsListPage campaignsListPage=new CampaignsListPage();

    @Test(description = "Control of applying the selected campaigns to products")
    public void tc01_controlProductsBasedOnSelectedCampaign() throws InterruptedException {
        loginPage.fillEmailOrPhoneNumberInputField(email)
                .clickContinueButton();
        sleepThread(3000);
        loginPage.fillPasswordInputField(password)
                .clickLoginButton();
        sleepThread(3000);
        loginPage.clickRemindLaterButton();
        sleepThread(3000);
        homePage.myAccountControl();
        campaignsPage.clickCampaignsButton();
        sleepThread(3000);
        campaignsPage.clickTeknoClubCampaignsconButton();
        sleepThread(2000);

    }
}
