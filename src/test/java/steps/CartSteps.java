package steps;

import io.cucumber.java.pt.E;
import org.junit.Test;
import page.CartPage;
import page.CommonPage;

public class CartSteps {
    @Test
    @E("confirmo os produtos")
    public void confirmo_os_produtos() throws InterruptedException {
        CartPage cartpage = new CartPage();
        CommonPage commonpage = new CommonPage();
        commonpage.EsperaThread();
        cartpage.continuarCompra();
        commonpage.rolarTelaCheckout();
        cartpage.continuarPagamento();
    }
}
