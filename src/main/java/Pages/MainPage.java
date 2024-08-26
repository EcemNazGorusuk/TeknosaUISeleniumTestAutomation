package Pages;

import Base.BaseLibrary;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class MainPage extends BaseLibrary {
    @Step("Enter the product, brand, or category to be searched into the search bar and click the button")
    public MainPage clickSearchBar() throws InterruptedException{
        WebElement element = driver.findElement(By.cssSelector("[class='search-button js_search_button sbx-fake btn-search']"));
        element.click();
        return this;
    }

   @Step("Enter the product, brand, or category to be searched into the search bar")
   public MainPage enterSearchCriteria(String searchText) throws InterruptedException{
       WebElement element = driver.findElement(By.id("search-input"));
       element.sendKeys(searchText, Keys.ENTER);
      return this;
  }

   @Step("Display the title of the product searched in the search bar")
   public MainPage displaySearchResultTitle() throws InterruptedException{
       String value= driver.findElement(By.cssSelector("[class='plp-title']")).getText();
       String expectedValue = formatEnterItemToSearch("klima") + " Modelleri ve " + formatEnterItemToSearch("klima") + " Fiyatları";
       Assert.assertEquals(expectedValue, value);
       System.out.println(value);
       return this;
  }

//filtreleme işlemleri
}
