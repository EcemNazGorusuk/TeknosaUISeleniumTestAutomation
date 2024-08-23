package Base;

import Pages.MainPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.chrome.ChromeDriver;
public class BaseTest extends BaseLibrary{

    MainPage mainPage=new MainPage();

    @BeforeMethod
    public void setUp() throws InterruptedException {
        driver=new ChromeDriver();
        driver.manage().window().maximize(); //To maximize the window
        driver.get("https://www.teknosa.com/login");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
