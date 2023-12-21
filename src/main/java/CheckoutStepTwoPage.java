import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutStepTwoPage {
    private WebDriver driver;

    @FindBy(id="finish")
    private WebElement finish;

    // Constructor
    public CheckoutStepTwoPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Method to click on the finish button
    public void clickFinish() {
        finish.click();
    }
}
