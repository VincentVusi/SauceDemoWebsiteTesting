package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * The webpages.CheckoutStepTwoPage class represents the second step of the checkout process.
 * It contains methods to complete the checkout process.
 */
public class CheckoutStepTwoPage {

    /**
     * WebElement representing the "Finish" button to complete the checkout.
     */
    @FindBy(id = "finish")
    private WebElement finish;

    /**
     * Constructor to initialize the webpages.CheckoutStepTwoPage with the WebDriver.
     *
     * @param driver The WebDriver instance to use for interacting with the web browser.
     */
    public CheckoutStepTwoPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    /**
     * Clicks the "Finish" button to complete the checkout process.
     */
    public void clickFinish() {
        finish.click();
    }
}
