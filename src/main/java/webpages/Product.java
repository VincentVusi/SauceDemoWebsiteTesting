package webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.text.DecimalFormat;

public class Product {

    private WebElement pageProduct;

    public Product(WebElement pageProduct){
        this.pageProduct = pageProduct;
    }

    public String getName() {
        return pageProduct.findElement(By.className("inventory_item_name")).getText();
    }

    public double getPrice() {
        return Double.parseDouble(
                pageProduct.findElement(
                        By.className("inventory_item_price"))
                        .getText()
                        .replace("$",""));
    }

    public void clickCardButton() {
        pageProduct.findElement(By.className("btn_small")).click();
    }

    @Override
    public String toString() {
        return "webpages.Product{" +
                "name=" + this.getName() +
                "\nprice=" + this.getPrice() +
                '}';
    }
}
