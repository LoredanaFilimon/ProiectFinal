package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.Text;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#responsive-navbar-nav > div:nth-child(2) > span > span > span > button > svg")
    private WebElement LoginIcon;
    public void GetClickOnLoginIcon() {
        LoginIcon.click();
    }
    @FindBy(id = "user-name")
    private WebElement UserName;
    public void EnterTextInUserNameField(String text) {
        UserName.sendKeys(text);
    }
    @FindBy(id = "password")
    private WebElement Password;
    public void EnterPasswordInUserPasswordField(String text) {
        Password.sendKeys(text);
    }
    @FindBy(css = ".btn-primary")
    private WebElement LoginButton;
    public void ClickOnLoginButton(){
        LoginButton.click();
    }

    @FindBy(css = "#responsive-navbar-nav > div:nth-child(2) > span > span > button")
    private WebElement LogOutButton;
    public void ClickOnLogOutButton(){
        LogOutButton.click();
    }
}