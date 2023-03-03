package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import util.TestRule;

public class CommonPage {
    protected WebDriver driver = TestRule.getDriver();

    public CommonPage(){}

    //actions example
    protected void moveToElement(WebElement element){
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
    }
}
