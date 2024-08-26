package Pages;

import Base.BaseLibrary;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CampaignsPage extends BaseLibrary {

    @Step("Click on the 'Kampanyalar' link")
    public CampaignsPage clickCampaignsButton() throws InterruptedException {
        WebElement element= driver.findElements(By.cssSelector("[class='hb3-col2'] a")).get(0);
        element.click();
        return this;
    }

    @Step("Click on the 'TeknoClub Kampanyaları' link")
    public CampaignsPage clickTeknoClubCampaignsconButton() throws InterruptedException {
        WebElement element= driver.findElement(By.cssSelector("[class='swiper-slide js-campaign-tab-click slide-active']"));
        element.click();
        return this;
    }
}
