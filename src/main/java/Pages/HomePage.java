package Pages;

import Base.BaseLibrary;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends BaseLibrary {

    @Step("Check the text 'My Account")
    public HomePage myAccountControl(){
        String value= driver.findElement(By.xpath("//*[@id=\"site-header\"]/div/div[3]/div[4]/a[2]/div/span[1]")).getText();
        Assert.assertEquals("Hesabım", value);
        System.out.println(value);
        return this;
    }



}
