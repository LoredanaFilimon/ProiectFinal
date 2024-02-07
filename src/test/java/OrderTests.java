import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPage;
import pages.OrderPage;

public class OrderTests extends BasePage {
    private OrderPage OrderPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        OrderPage = new OrderPage(driver);

    }
    @Test
    public void AddAProductToTheCartAndCompleteYourOrder(){
        OrderPage.GetClickOnLoginIcon();
        OrderPage.EnterTextInUserNameField("dino");
        OrderPage.EnterPasswordInUserPasswordField("choochoo");
        OrderPage.ClickOnLoginButton();
        OrderPage.GetClickOnTheAwesomeGraniteChipsCartCart();
        OrderPage.GetClickOnShoppingCartBadge();
        OrderPage.GetClickOnCheckOutButton();
        OrderPage.EnterNameInFirstNameField("loredana");
        OrderPage.EnterNameInLastNameField("Filimon");
        OrderPage.EnterAddressInAddressField("oasului");
        OrderPage.GetClickOnContinueCheckOutButton();
        OrderPage.GetClickOnCompleteYourOrderButton();
        String actualResult = driver.findElement(By.cssSelector(".text-center")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Thank you for your order!"));

    }

}
