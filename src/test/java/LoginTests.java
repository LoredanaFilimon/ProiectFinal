import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPage;
import pages.SearchPage;

public class LoginTests extends BasePage {
    private LoginPage LoginPage;


    @BeforeMethod
    public void setUp() {
        super.setUp();
        LoginPage = new LoginPage(driver);

    }
    @Test
    public void EnterDinoUserAndCheckTheResult(){
        LoginPage.GetClickOnLoginIcon();
        LoginPage.EnterTextInUserNameField("dino");
        LoginPage.EnterPasswordInUserPasswordField("choochoo");
        LoginPage.ClickOnLoginButton();
        String actualResult = driver.findElement(By.cssSelector("a[href='#/account']")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("dino"));
    }
    @Test
    public void EnterBeetleUserAndCheckTheResult(){
        LoginPage.GetClickOnLoginIcon();
        LoginPage.EnterTextInUserNameField("beetle");
        LoginPage.EnterPasswordInUserPasswordField("choochoo");
        LoginPage.ClickOnLoginButton();
        String actualResult = driver.findElement(By.cssSelector("a[href='#/account']")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("beetle"));
    }
    @Test
    public void EnterTurtleUserAndCheckTheResult(){
        LoginPage.GetClickOnLoginIcon();
        LoginPage.EnterTextInUserNameField("turtle");
        LoginPage.EnterPasswordInUserPasswordField("choochoo");
        LoginPage.ClickOnLoginButton();
        String actualResult = driver.findElement(By.cssSelector("a[href='#/account']")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("turtle"));
    }
    @Test
    public void EnterLockedUserAndCheckTheResult(){
        LoginPage.GetClickOnLoginIcon();
        LoginPage.EnterTextInUserNameField("locked");
        LoginPage.EnterPasswordInUserPasswordField("choochoo");
        LoginPage.ClickOnLoginButton();
        String actualResult = driver.findElement(By.cssSelector("body > div.fade.modal.show > div > div > div.login_wrapper > div > form > p")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("The user has been locked out."));

    }
    @Test
    public void LoginDinoUserAndThenLogOutDinoUser(){
        LoginPage.GetClickOnLoginIcon();
        LoginPage.EnterTextInUserNameField("dino");
        LoginPage.EnterPasswordInUserPasswordField("choochoo");
        LoginPage.ClickOnLoginButton();
        LoginPage.ClickOnLogOutButton();
        String actualResult = driver.findElement(By.cssSelector("#responsive-navbar-nav > div:nth-child(2) > span > span > span")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Hello guest!"));

    }
    @Test
    public void LoginBeetleUserAndThenLogOutBeetleUser(){
        LoginPage.GetClickOnLoginIcon();
        LoginPage.EnterTextInUserNameField("beetle");
        LoginPage.EnterPasswordInUserPasswordField("choochoo");
        LoginPage.ClickOnLoginButton();
        LoginPage.ClickOnLogOutButton();
        String actualResult = driver.findElement(By.cssSelector("#responsive-navbar-nav > div:nth-child(2) > span > span > span")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Hello guest!"));

    }
    @Test
    public void LoginTurtleUserAndThenLogOutTurtleUser(){
        LoginPage.GetClickOnLoginIcon();
        LoginPage.EnterTextInUserNameField("turtle");
        LoginPage.EnterPasswordInUserPasswordField("choochoo");
        LoginPage.ClickOnLoginButton();
        LoginPage.ClickOnLogOutButton();
        String actualResult = driver.findElement(By.cssSelector("#responsive-navbar-nav > div:nth-child(2) > span > span > span")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Hello guest!"));

    }



}
