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
       String getExpectedText = "\"klima\"";
       String expectedValue1 = formatEnterItemToSearch(getExpectedText) + " için arama sonuçları ";
       String expectedValue2 = formatEnterItemToSearch("klima") + " Modelleri ve " + formatEnterItemToSearch("klima") + " Fiyatları";

       boolean isExpectedValue1 = value.equals(expectedValue1);
       boolean isExpectedValue2 = value.equals(expectedValue2);

       Assert.assertTrue(isExpectedValue1 || isExpectedValue2, "Arama sonuç başlığı beklenen değerlerden biriyle eşleşmiyor");
       System.out.println(value);
       return this;
  }


    @Step("Click one or more checkboxes to filter by 'brand")
    public MainPage selectCheckboxesForBrandFilter() throws InterruptedException{
        WebElement element = driver.findElement(By.cssSelector(".fgp-body .fgp-items > div"));
        element.click();
        return this;
    }

    @Step("Set the minimum price range")
    public MainPage filterMinimumPriceRange(int price) throws InterruptedException {
        WebElement element = driver.findElement(By.id("minPrice"));
        element.sendKeys(String.valueOf(price));
        sleepThread(3000);
        return this;
    }

    @Step("The maximum price range is selected")
    public MainPage filterMaximumPriceRange(int price) throws InterruptedException {
        WebElement element = driver.findElement(By.id("maxPrice"));
        element.sendKeys(String.valueOf(price));
        sleepThread(3000);
        return this;
    }

    @Step("Click on the search icon button")
    public MainPage clickSearchIconButton()  {
        WebElement element= driver.findElement(By.cssSelector("[class='price-range-button']"));
        element.submit();
        return this;
    }


    @Step("Click on the 'Çok Satanlar' button")
    public MainPage clickBestSellersButton()  {
        WebElement element = driver.findElement(By.cssSelector(".sortForm2 li:nth-child(3)"));
        element.click();
        return this;
   }

    @Step("Cookie Notification Control")
    public MainPage closeCokieNotificationButton() throws InterruptedException {
        sleepThread(4000);
        WebElement element=driver.findElement(By.id("b7bca45b-4b2f-4bf7-a04a-c5b0aec83d7e"));
        if(element.isDisplayed())
            driver.findElement(By.id("b7bca45b-4b2f-4bf7-a04a-c5b0aec83d7e")).click();
        return this;
    }

}
