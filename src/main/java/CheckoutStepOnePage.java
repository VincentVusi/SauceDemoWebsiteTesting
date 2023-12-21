import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutStepOnePage {
    private WebDriver driver;

    @FindBy(id="first-name")
    private WebElement firstName;

    @FindBy(id = "last-name")
    private WebElement lastName;

    @FindBy(id="postal-code")
    private WebElement postalCode;

    @FindBy(id="continue")
    private WebElement continueButton;

    // Constructor
    public CheckoutStepOnePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Method to enter first name
    public void enterFirstName(String firstName) {
        this.firstName.sendKeys(firstName);
    }

    // Method to enter last name
    public void enterLastName(String lastName) {
        this.lastName.sendKeys(lastName);
    }

    // Method to enter postal code
    public void enterPostalCode(String postalCode) {
        this.postalCode.sendKeys(postalCode);
    }

    // Method to click on the continue button
    public void clickContinue() {
        this.continueButton.click();
    }

    public void enterCheckoutInfo(String firstName , String lastName , String postalCode)
    {
        enterFirstName(firstName);
        enterLastName(lastName);
        enterPostalCode(postalCode);
    }
}


