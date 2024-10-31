import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends MainPage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }
/*поле логина*/
    @FindBy(id = "username")
    private WebElement loginField;

/*поле пароля*/
    @FindBy(id="password")
    private WebElement passwordField;
/*кнопка войти*/
    @FindBy(name = "submit")
    private WebElement loginButton;
/*вход с данными*/
public void login(String username, String password) {
        loginField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
    }
    @FindBy(xpath = "//*[@id=\"app\"]/main/div/div/div[2]/form/div[1]")
    private WebElement loginError;

    public WebElement getLoginError() {
        return loginError;
    }

    public void setLoginError(WebElement loginError) {
        this.loginError = loginError;
    }
}
