package page;

import elements.CartElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import util.Utils;

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
    /*
    public void valida_prod2(String produto){
        Utils util = new Utils();
        util.Validacoes(String.valueOf(prod1), produto);
    }
    public void valida_prod3(String produto){
        Utils util = new Utils();
        util.Validacoes(String.valueOf(prod1), produto);
    }
     */
}
