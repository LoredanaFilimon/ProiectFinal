import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.SearchPage;

public class SearchTests extends BasePage {
    private SearchPage SearchPage;


    @BeforeMethod
    public void setUp() {
        super.setUp();
        SearchPage = new SearchPage(driver);

    }

    @Test
    public void WriteGraniteWordAndCheckTheResult() {
        SearchPage.EnterTextInSearchField("granite");
        SearchPage.GetClickOnSearchButton();
        String actualResult = driver.findElement(By.id("root")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Awesome Granite Chips"));
    }

    @Test
    public void WriteMetalWordAndCheckTheResult() {
        SearchPage.EnterTextInSearchField("metal");
        SearchPage.GetClickOnSearchButton();
        String actualResult = driver.findElement(By.id("root")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Awesome Metal Chair"));
    }

    @Test
    public void WriteSoftWordAndCheckTheResult() {
        SearchPage.EnterTextInSearchField("soft");
        SearchPage.GetClickOnSearchButton();
        String actualResult = driver.findElement(By.id("root")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Awesome Soft Shirt"));
    }

    @Test
    public void WriteGorgeousWordAndCheckTheResult() {
        SearchPage.EnterTextInSearchField("Gorgeous");
        SearchPage.GetClickOnSearchButton();
        String actualResult = driver.findElement(By.id("root")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Gorgeous Soft Pizza"));

    }

    @Test
    public void WriteMouseWordAndCheckTheResult() {
        SearchPage.EnterTextInSearchField("Mouse");
        SearchPage.GetClickOnSearchButton();
        String actualResult = driver.findElement(By.id("root")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Practical Metal Mouse"));


    }
}

