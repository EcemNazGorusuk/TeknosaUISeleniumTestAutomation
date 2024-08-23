package Pages;
import Base.BaseLibrary;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BaseLibrary {

    @Step("The email/phone number field is filled in.")
    public LoginPage fillEmailOrPhoneNumberInputField(String value){
        driver.findElement(By.id("j_username1")).sendKeys(value);
        return this;
    }

    @Step("Click on the 'Devam Et' button")
    public LoginPage clickContinueButton() throws InterruptedException {
        WebElement element= driver.findElement(By.id("newLoginStepSecond"));
        element.click();
        return this;
    }

    @Step("The password field is filled in.")
    public LoginPage fillPasswordInputField(String value){
        driver.findElement(By.id("j_password")).sendKeys(value);
        return this;
    }

    @Step("Click on the 'Giriş Yap' button")
    public LoginPage clickLoginButton() throws InterruptedException {
        WebElement element= driver.findElement(By.id("customerLoginButton"));
        element.submit();
        return this;
    }


    @Step("Clicking on the 'Daha Sonra Hatırlat' button")
    public void clickRemindLaterButton() {
        WebElement element =driver.findElement(By.cssSelector(".emv-info-remind button"));
        element.click();
    }
}
