import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    WebDriver driver;
    LoginPage login;

    @BeforeMethod
    public void setup() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

    }

    @Test(priority=1)
    public void loginPositiveTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterCredentials("standard_user","secret_sauce");
        InventoryPage inventoryPage = new InventoryPage(driver);
        List<Product> products = inventoryPage.getProducts();
        for (int i = 0 ; i < products.size();i+=2){
            products.get(i).clickCardButton();
        }
        Thread.sleep(5000);
        products.get(2).clickCardButton();
        Thread.sleep(5000);
        inventoryPage.clickViewCart();
        Thread.sleep(5000);
        CartPage cartPage = new CartPage(driver);
        List<Product> cartProducts = cartPage.getCartProducts();
        cartProducts.get(1).clickCardButton();
        Thread.sleep(5000);


    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
