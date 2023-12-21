import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * The InventoryPage class represents the page displaying items for sale.
 * It contains methods to interact with various elements on the page.
 */
public class InventoryPage {

    /*
     * WebElement representing the "View Cart" link.
     */
    @FindBy(id = "shopping_cart_link")
    private WebElement viewCart;

    /*
     * WebElement representing the "Add to Cart" button for a specific item (e.g., Sauce Labs Backpack).
     */
    @FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
    private WebElement add_bag_to_cart;

    /*
     * WebElement representing the link to the inventory link on the sidebar.
     */
    @FindBy(id = "inventory_sidebar_link")
    private WebElement inventory_link;

    /*
     * WebElement representing the link to the about link on the sidebar.
     */
    @FindBy(id = "about_sidebar_link")
    private WebElement about_link;

    /*
     * WebElement representing the link to log out from the application.
     */
    @FindBy(id = "logout_sidebar_link")
    private WebElement logout_link;

    /*
     * WebElement representing the link to reset the application state.
     */
    @FindBy(id = "reset_sidebar_link")
    private WebElement reset_link;

    /**
     * Constructor to initialize the InventoryPage with the WebDriver.
     *
     * @param driver The WebDriver instance to use for interacting with the web browser.
     */
    public InventoryPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    /**
     * Clicks the "View Cart" link to navigate to the shopping cart page.
     */
    public void clickViewCart() {
        viewCart.click();
    }

    /**
     * Clicks the "Add to Cart" button for a specific item (e.g., Sauce Labs Backpack)
     */
    public void addBagToCart() {
        add_bag_to_cart.click();
    }

    /**
     * Clicks the link to navigate to the inventory link on the sidebar.
     */
    public void clickInventoryLink() {
        inventory_link.click();
    }

    /**
     * Clicks the link to navigate to the about link on the sidebar.
     */
    public void clickAboutLink() {
        about_link.click();
    }

    /**
     * Clicks the link to log out from the application.
     */
    public void clickLogoutLink() {
        logout_link.click();
    }

    /**
     * Clicks the link to reset the application state.
     */
    public void clickResetLink() {
        reset_link.click();
    }
}
