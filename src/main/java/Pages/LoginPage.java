package Pages;
import Base.BaseLibrary;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginPage extends BaseLibrary {

    @Step("The email/phone number field is filled in.")
    public LoginPage fillEmailOrPhoneNumberInputField(String value) {
        driver.findElement(By.id("j_username1")).sendKeys(value);
        return this;
    }

    @Step("Click on the 'Devam Et' button")
    public LoginPage clickContinueButton() throws InterruptedException {
        WebElement element = driver.findElement(By.id("newLoginStepSecond"));
        element.click();
        return this;
    }

    @Step("The password field is filled in.")
    public LoginPage fillPasswordInputField(String value) {
        driver.findElement(By.id("j_password")).sendKeys(value);
        return this;
    }

    @Step("Click on the 'Giriş Yap' button")
    public LoginPage clickLoginButton() throws InterruptedException {
        WebElement element = driver.findElement(By.id("customerLoginButton"));
        element.submit();
        return this;
    }


    @Step("Clicking on the 'Daha Sonra Hatırlat' button")
    public void clickRemindLaterButton() {
        WebElement element = driver.findElement(By.cssSelector(".emv-info-remind button"));
        element.click();
    }


    @Step("Check the error message for wrong email/phone number")
    public LoginPage checkEmailErrorMessage(String errMsgForWrongEmail) {
        String value = driver.findElement(By.cssSelector("[class='form-row-error js-user-check-error'] p")).getText();
        Assert.assertEquals(errMsgForWrongEmail, value);
        System.out.println(value);
        return this;
    }

    @Step("Check the error message for wrong password")
    public LoginPage checkPasswordErrorMessage(String errMsgForWrongPassword) {
        String value = driver.findElement(By.cssSelector("#loginForm > div.lgn > div > label > p")).getText();
        Assert.assertEquals(errMsgForWrongPassword, value);
        System.out.println(value);
        return this;
    }

    @Step("Check the error message for max character limit for wrong email/phone number")
    public LoginPage checkMaxCharacterErrMsgEmail(String txt) {
        String value = driver.findElement(By.id("j_username1-error")).getText();
        Assert.assertEquals(txt, value);
        System.out.println(value);
        return this;
    }


    @Step("Check the error message for max character limit for wrong password")
    public LoginPage checkMaxCharacterErrMsgPassword(String txt) {
        String value = driver.findElement(By.cssSelector("#loginForm > div.lgn > div > label > p")).getText();
        Assert.assertEquals(txt, value);
        System.out.println(value);
        return this;
    }

    @Step("Check the error message for min character limit for wrong email/phone number")
    public LoginPage checkMinCharacterErrMsgEmail(String txt) {
        String value = driver.findElement(By.id("j_username1-error")).getText();
        Assert.assertEquals(txt, value);
        System.out.println(value);
        return this;
    }

    @Step("Check the error message for min character limit for wrong password")
    public LoginPage checkMinCharacterErrMsgPassword(String txt) {
        String value = driver.findElement(By.cssSelector("#loginForm > div.lgn > div > label > p")).getText();
        Assert.assertEquals(txt, value);
        System.out.println(value);
        return this;
    }


    @Step("Check the error message for empty email/phone number field")
    public LoginPage emptyCharControlErrMsgEmail(String txt) {
        String value = driver.findElement(By.id("j_username1-error")).getText();
        Assert.assertEquals(txt, value);
        System.out.println(value);
        return this;
    }

    @Step("Check the error message for empty password field")
    public LoginPage emptyCharControlErrMsgPassword(String txt) {
        String value = driver.findElement(By.id("j_password-error")).getText();
        Assert.assertEquals(txt, value);
        System.out.println(value);
        return this;
    }
}