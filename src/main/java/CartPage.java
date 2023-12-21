import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    private WebDriver driver;

    @FindBy(id = "remove-sauce-labs-backpack")
    private WebElement remove_item;

    @FindBy(id="checkout")
    private WebElement checkout;

    // Constructor
    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Method to remove an item from the cart
    public void removeItemFromCart() {
        remove_item.click();
    }

    // Method to proceed to checkout
    public void proceedToCheckout() {
        checkout.click();
    }
}

