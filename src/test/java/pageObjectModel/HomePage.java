package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.MyDriver;

public class HomePage extends BasicFunctionalities{
    WebDriver driver = MyDriver.getDriver();

    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "global-enhancements-search-query")
    private WebElement searchInput;

    @FindBy(css = "button[value = 'Search']")
    private WebElement searchButton;

    public WebElement getSearchInput() {
        return searchInput;
    }

    public void setSearchInput(WebElement searchInput) {
        this.searchInput = searchInput;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public void setSearchButton(WebElement searchButton) {
        this.searchButton = searchButton;
    }
}
