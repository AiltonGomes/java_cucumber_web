package steps;

import io.cucumber.java.pt.E;
import org.junit.Test;
import page.CartPage;
import page.CommonPage;

public class CartSteps {
    @Test
    @E("valido os produtos {string}, {string}, {string} indo para o pagamento")
    public void valido_os_produtos_indo_para_o_pagamento(String prod1, String prod2, String prod3) throws InterruptedException {

    }
    @Test
    @E("confirmo os produtos")
    public void confirmo_os_produtos() throws InterruptedException {
        CartPage cartpage = new CartPage();
        CommonPage commonpage = new CommonPage();
        commonpage.EsperaThread();
        cartpage.continuarCompra();
        commonpage.rolarTela1();
        cartpage.continuarPagamento();
    }
}
