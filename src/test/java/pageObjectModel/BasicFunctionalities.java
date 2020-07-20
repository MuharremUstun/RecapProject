package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.MyDriver;

public class BasicFunctionalities {

    private WebDriver driver = MyDriver.getDriver();
    Wait wait = new WebDriverWait(driver,5);

    public void clickElement(WebElement elem) {
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.click();
    }

    public void sendKeysToElem(WebElement elem, String value){
        wait.until(ExpectedConditions.visibilityOf(elem));
        elem.sendKeys(value);
    }

}
