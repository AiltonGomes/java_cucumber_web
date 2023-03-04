package elements;

import io.cucumber.java.pt.E;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartElement {

    @FindBy(xpath = "//a[contains(.,'Stylish Dress')]")
    protected WebElement prod1;
    @FindBy(xpath = "//a[contains(.,'Beautiful Peacock Blue Cotton Linen Saree')]")
    protected WebElement prod2;
    @FindBy(xpath = "//a[contains(.,'Men Tshirt')]")
    protected WebElement prod3;

    /* Elementos
    *  Tela de confirmacão de compra,
    *       validar os tres produtos:
    *           prod1: //a[contains(.,'Stylish Dress')]
    *           qtd:   //button[@class='disabled'][contains(.,'3')]
    *           prod2: //a[contains(.,'Beautiful Peacock Blue Cotton Linen Saree')]
    *           qtd:   (//button[@class='disabled'][contains(.,'2')])[1]
    *           prod3: //a[contains(.,'Men Tshirt')]
    *           qtd:   (//button[@class='disabled'][contains(.,'1')])[2]
    *       confirmar compra e ir para tela de pgt:
    *           //a[@class='btn btn-default check_out'][contains(.,'Proceed To Checkout')]
    *
    *
    * */

}
