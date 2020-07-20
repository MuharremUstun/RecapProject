package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.MyDriver;

import java.util.List;

public class HomePage extends BasicFunctionalities{
    WebDriver driver = MyDriver.getDriver();

    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "global-enhancements-search-query")
    private WebElement searchInput;

    @FindBy(css = "button[value = 'Search']")
    private WebElement searchButton;


    public void sendKeysToSearchInput(String item){
        sendKeysToElem(searchInput,item);
    }

    public void clickOnSearchButton(){
        clickElement(searchButton);
    }


}
