package steps;

import io.cucumber.java.pt.E;
import page.CartPage;
import page.CommonPage;

public class CartSteps {
    @E("valido os produtos {string}, {string}, {string} indo para o pagamento")
    public void valido_os_produtos_indo_para_o_pagamento(String prod1, String prod2, String prod3) throws InterruptedException {

    }
    @E("realizar o pagamento com {string}, {string}, {string}, {string}")
    public void realizar_o_pagamento_com(String nome, String CC, String data, String cvc) throws InterruptedException {
        CartPage cartpage = new CartPage();
        CommonPage commonpage = new CommonPage();
        commonpage.EsperaThread();
        cartpage.continuarCompra();
        commonpage.rolarTela1();
        cartpage.continuarPagamento();
    }
}
