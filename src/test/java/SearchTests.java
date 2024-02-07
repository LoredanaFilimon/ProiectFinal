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
        SearchPage.EnterTextInSearchField("gorgeous");
        SearchPage.GetClickOnSearchButton();
        String actualResult = driver.findElement(By.id("root")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Gorgeous Soft Pizza"));

    }

    @Test
    public void WriteMouseWordAndCheckTheResult() {
        SearchPage.EnterTextInSearchField("mouse");
        SearchPage.GetClickOnSearchButton();
        String actualResult = driver.findElement(By.id("root")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Practical Metal Mouse"));

    }
    @Test
    public void WriteHatWordAndCheckTheResult() {
        SearchPage.EnterTextInSearchField("hat");
        SearchPage.GetClickOnSearchButton();
        String actualResult = driver.findElement(By.id("root")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Incredible Concrete Hat"));

    }
    @Test
    public void WriteRefinedWordAndCheckTheResult() {
        SearchPage.EnterTextInSearchField("refined");
        SearchPage.GetClickOnSearchButton();
        String actualResult = driver.findElement(By.id("root")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Refined Frozen Mouse"));

    }
    @Test
    public void WriteLicensedWordAndCheckTheResult() {
        SearchPage.EnterTextInSearchField("licensed");
        SearchPage.GetClickOnSearchButton();
        String actualResult = driver.findElement(By.id("root")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Licensed Steel Gloves"));

    }
    @Test
    public void WriteBaconWordAndCheckTheResult() {
        SearchPage.EnterTextInSearchField("bacon");
        SearchPage.GetClickOnSearchButton();
        String actualResult = driver.findElement(By.id("root")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Practical Wooden Bacon"));

    }
    @Test
    public void WritePizzaWordAndCheckTheResult() {
        SearchPage.EnterTextInSearchField("pizza");
        SearchPage.GetClickOnSearchButton();
        String actualResult = driver.findElement(By.id("root")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Gorgeous Soft Pizza"));

    }
}

