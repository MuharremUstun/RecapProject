package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import pageObjectModel.BasicFunctionalities;
import pageObjectModel.HomePage;
import utilities.MyDriver;
import utilities.ReadProperties;

public class AddToCartSteps {

    private WebDriver driver = MyDriver.getDriver();
    BasicFunctionalities bf = new BasicFunctionalities();
    HomePage hp = new HomePage();

    @Given("^Go to website$")
    public void go_to_website() {
        driver.get(ReadProperties.getData("URL"));

    }

    @And("^Search for \"([^\"]*)\"$")
    public void search_for(String item) {
        bf.sendKeysToElem(hp.);

    }

}
