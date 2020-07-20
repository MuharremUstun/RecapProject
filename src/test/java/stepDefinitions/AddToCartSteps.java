package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import pageObjectModel.HomePage;
import pageObjectModel.SearchPage;
import utilities.MyDriver;
import utilities.ReadProperties;

import java.util.ArrayList;
import java.util.List;

public class AddToCartSteps {

    private WebDriver driver = MyDriver.getDriver();

    HomePage homePage = new HomePage();
    SearchPage searchPage = new SearchPage();

    @Given("^Go to website$")
    public void go_to_website() {
        driver.get(ReadProperties.getData("URL"));
        driver.manage().window().maximize();
    }

    @And("^Search for \"([^\"]*)\"$")
    public void search_for(String item) {
        homePage.sendKeysToSearchInput(item);
        homePage.clickOnSearchButton();
    }

    @And("^Click on random item$")
    public void click_on_random_item() {
        searchPage.clickOnRandomItem();
        List<String > tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }


}
