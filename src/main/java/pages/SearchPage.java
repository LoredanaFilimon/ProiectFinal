package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

public class SearchPage extends BasePage{
    public SearchPage(WebDriver driver) {
    super(driver);
    PageFactory.initElements(driver, this);
}
    @FindBy(id = "input-search")
    private WebElement SearchField;
    public void EnterTextInSearchField(String text) {
        SearchField.sendKeys(text);
    }
    @FindBy(css = ".btn-light")
    private WebElement SearchButton;
    public void GetClickOnSearchButton() {
        SearchButton.click();
    }


}
