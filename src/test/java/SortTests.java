import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.SearchPage;
import pages.SortPage;

public class SortTests extends BasePage {
    private SortPage SortPage;


    @BeforeMethod
    public void setUp() {
        super.setUp();
        SortPage = new SortPage(driver);

    }
    @Test
    public void SortAToZAndCheckTheResult() {
        SortPage.SelectFirstOptionOfTheList();
        String actualResult = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[1]/div/div[1]/a")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Awesome Granite Chips"));
    }
    @Test
    public void SortZToAAndCheckTheResult() {
        SortPage.SelectSecondOptionOfTheList();
        String actualResult = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[1]/div/div[1]/a")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Refined Frozen Mouse"));
    }
    @Test
    public void SortLowToHighAndCheckTheResult() {
        SortPage.SelectThirdOptionOfTheList();
        String actualResult = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[1]/div/div[1]/a")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Practical Wooden Bacon"));
    }
    @Test
    public void SortHighToLowAndCheckTheResult() {
        SortPage.SelectFourthOptionOfTheList();
        String actualResult = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[1]/div/div[1]/a")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Awesome Soft Shirt"));
    }


}
