package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.MyDriver;

import java.util.List;
import java.util.Random;

public class SearchPage extends BasicFunctionalities{
    private WebDriver driver = MyDriver.getDriver();

    public SearchPage(){
        PageFactory.initElements(driver,this);
    }


    @FindAll({
            @FindBy(css = "div.v2-listing-card__info")
    })
    private List<WebElement> itemList;


    public void clickOnRandomItem(){
        int randomNumber = new Random().nextInt(itemList.size());
        clickElement(itemList.get(randomNumber));
    }
}
