package StepDefinitions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import webpages.LoginPage;

public class LoginSteps {
    WebDriver driver;
    LoginPage loginPage;

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }
    @When("User enters valid username and password")
    public void user_enters_valid_username_and_password(DataTable credentials) {
        loginPage = new LoginPage(driver);
        List<Map<String, String>> list = credentials.asMaps(String.class, String.class);
        loginPage.enterCredentials(list.get(0).get("Username"), list.get(0).get("Password"));
    }
    @And("Clicks on the login button")
    public void clicks_on_the_login_button() {
        loginPage.clickSubmit();
    }
    @Then("Redirect to Inventory Page")
    public void redirect_to_inventory_page() {
        Assert.assertEquals("https://www.saucedemo.com/inventory.html",driver.getCurrentUrl());
        System.out.println("Successfully login");
        driver.quit();
    }

}
