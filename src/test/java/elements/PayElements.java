package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import page.CommonPage;

public class PayElements extends CommonPage {

    @FindBy(name = "name_on_card")
    protected WebElement nomecartao;
    @FindBy(name = "card_number")
    protected WebElement numcartao;
    @FindBy(name = "cvc")
    protected WebElement numcvc;
    @FindBy(name = "expiry_month")
    protected WebElement mesvalidade;
    @FindBy(name = "expiry_year")
    protected WebElement anovalidade;
    @FindBy(id = "submit")
    protected WebElement confirmarpgt;
    @FindBy(xpath = "//b[contains(.,'Order Placed!')]")
    protected WebElement validarcompra;
}
