package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import page.CommonPage;

public class CartElement extends CommonPage {
    @FindBy(xpath = "//a[contains(.,'Stylish Dress')]")
    protected WebElement prod1;
    @FindBy(xpath = "//a[contains(.,'Beautiful Peacock Blue Cotton Linen Saree')]")
    protected WebElement prod2;
    @FindBy(xpath = "//a[contains(.,'Men Tshirt')]")
    protected WebElement prod3;
    @FindBy(xpath = "//a[contains(.,'Proceed To Checkout')]")
    protected WebElement btnseguircomprar;
    @FindBy(xpath = "//a[contains(@class,'btn btn-default check_out')]")
    protected WebElement btnseguirpagamento;
}
