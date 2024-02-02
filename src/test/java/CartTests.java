import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.CartPage;
import pages.LoginPage;

public class CartTests extends BasePage {
    private CartPage CartPage;


    @BeforeMethod
    public void setUp() {
        super.setUp();
        CartPage = new CartPage(driver);

    }
    @Test
    public void AddThreeItemsToTheCartAndCheckIfThereWereAdded(){
        CartPage.GetClickOnThePracticalWoodenBaconCart();
        CartPage.GetClickOnThePracticalWoodenBaconCart();
        CartPage.GetClickOnThePracticalWoodenBaconCart();
        String actualResult = driver.findElement(By.cssSelector(".shopping_cart_badge")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("3"));

    }
}
