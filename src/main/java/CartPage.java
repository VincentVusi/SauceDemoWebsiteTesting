import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * The CartPage class represents the shopping cart page.
 * It contains methods to interact with the cart items and proceed to checkout.
 */
public class CartPage {

    /**
     * WebElement representing all the products in the cart
     */

    @FindBy(className = "cart_item")
    private List<WebElement> cartElements;

    /**
     * WebElement representing the checkout button in the cart.
     */
    @FindBy(id = "checkout")
    private WebElement checkout;

    /**
     * Constructor to initialize the CartPage with the WebDriver.
     *
     * @param driver The WebDriver instance to use for interacting with the web browser.
     */
    public CartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public List<Product> getCartProducts(){
        List<Product> products = new ArrayList<>();
        for (WebElement element:cartElements) {
            products.add(new Product(element));
        }

        return products;
    }

    /**
     * Clicks the checkout button to proceed to checkout.
     */
    public void proceedToCheckout() {
        checkout.click();
    }

}
