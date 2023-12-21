import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    @FindBy(id="user-name")
    private WebElement userName;

    @FindBy(id="password")
    private WebElement password;

    @FindBy(id="login-button")
    private WebElement submit;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterUsername(String strUserName){
        userName.sendKeys(strUserName);
    }

    public void enterPassword(String strPassword){
        password.sendKeys(strPassword);
    }

    public void clickSubmit(){
        submit.click();
    }

    public void enterCredentials(String strUserName,String strPassword){
        this.enterUsername(strUserName);
        this.enterPassword(strPassword);
    }
}
