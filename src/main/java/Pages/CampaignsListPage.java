package Pages;

import Base.BaseLibrary;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CampaignsListPage extends BaseLibrary {

    @Step("Click on the first campaign in the campaign list")
    public CampaignsListPage clickFirstCampaignCard() throws InterruptedException{
        WebElement element = driver.findElement(By.xpath("//*[@id=\"allItems\"]/div/div[1]/a/div/div"));
        element.click();
        return this;
    }
}
