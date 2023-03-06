package page;

import elements.CartElement;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends CartElement{
    public CartPage(){
        PageFactory.initElements(driver, this);
    }
    public void continuarCompra( ){
        btnseguircomprar.click();
    }
    public void continuarPagamento( ){
        btnseguirpagamento.click();
    }

}
