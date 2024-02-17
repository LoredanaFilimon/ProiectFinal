import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.HomePage;

public class HomeTests extends BasePage {
    private HomePage HomePage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        HomePage = new HomePage(driver);

    }
    @Test
    public void ClickOnHomePageButtonAfterLoginDinoUserAndCheckTheResult(){
        HomePage.GetClickOnLoginIcon();
        HomePage.EnterTextInUsernameField("dino");
        HomePage.EnterTextInPasswordField("choochoo");
        HomePage.GetClickOnLoginButton();
        HomePage.ClickOnHomeButton();
        String actualResult = driver.findElement(By.id("responsive-navbar-nav")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("dino"));
    }
    @Test
    public void ClickOnHomePageButtonAfterLoginTurtleUserAndCheckTheResult(){
        HomePage.GetClickOnLoginIcon();
        HomePage.EnterTextInUsernameField("turtle");
        HomePage.EnterTextInPasswordField("choochoo");
        HomePage.GetClickOnLoginButton();
        HomePage.ClickOnHomeButton();
        String actualResult = driver.findElement(By.id("responsive-navbar-nav")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("turtle"));
    }
}
