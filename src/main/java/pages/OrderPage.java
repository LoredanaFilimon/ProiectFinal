package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage extends BasePage {
    public OrderPage(WebDriver driver) {
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

    public void ClickOnLoginButton() {
        LoginButton.click();
    }

    @FindBy(css = "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(1) > div > div.text-muted.text-center.card-footer > button:nth-child(2) > svg > path")
    private WebElement AwesomeGraniteChipsCart;

    public void GetClickOnTheAwesomeGraniteChipsCartCart() {
        AwesomeGraniteChipsCart.click();
    }

    @FindBy(css = ".shopping_cart_badge")
    private WebElement ShoppingCartBadge;

    public void GetClickOnShoppingCartBadge() {
        ShoppingCartBadge.click();
    }

    @FindBy(css = ".btn-success")
    private WebElement CheckOutButton;

    public void GetClickOnCheckOutButton() {
        CheckOutButton.click();

    }

    @FindBy(id = "first-name")
    private WebElement FirstNameField;

    public void EnterNameInFirstNameField(String text) {
        FirstNameField.sendKeys(text);


    }

    @FindBy(id = "last-name")
    private WebElement LastNameField;

    public void EnterNameInLastNameField(String text) {
        LastNameField.sendKeys(text);
    }

    @FindBy(id = "address")
    private WebElement AddressField;

    public void EnterAddressInAddressField(String text) {
        AddressField.sendKeys(text);
    }

    @FindBy(css = ".btn-success")
    private WebElement ContinueCheckOutButton;

    public void GetClickOnContinueCheckOutButton() {
        ContinueCheckOutButton.click();


    }
    @FindBy(css = ".btn-success")
    private WebElement CompleteYourOrderButton;

    public void GetClickOnCompleteYourOrderButton() {
        CompleteYourOrderButton.click();



    }

}
