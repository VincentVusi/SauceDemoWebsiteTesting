import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage {
    WebDriver driver;

    @FindBy(id="shopping_cart_link")
    private WebElement viewCart;

    @FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
    private WebElement add_bag_to_cart;

    @FindBy(id="inventory_sidebar_link")
    private WebElement inventory_link;

    @FindBy(id="about_sidebar_link")
    private WebElement about_link;

    @FindBy(id="logout_sidebar_link")
    private WebElement logout_link;

    @FindBy(id="reset_sidebar_link")
    private WebElement reset_link;

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void clickViewCart() {
        viewCart.click();
    }

    public void addBagToCart() {
        add_bag_to_cart.click();
    }

    public void clickInventoryLink() {
        inventory_link.click();
    }

    public void clickAboutLink() {
        about_link.click();
    }

    public void clickLogoutLink() {
        logout_link.click();
    }

    public void clickResetLink() {
        reset_link.click();
    }




}
