package steps;

import io.cucumber.java.pt.E;
import page.ProductPage;
public class ProductsSteps {
    @E("selecionar a aba produtos")
    public void selecionar_a_aba_produtos() {
        ProductPage produtopage = new ProductPage();
        produtopage.ProdutosClickMenu();
    }
    @E("pesquisar pelo {string}")
    public void pesquisar_pelo(String produto) {
        ProductPage produtopage = new ProductPage();
        produtopage.PesquisarProduto(produto);
    }
    @E("realizar o pagamento com {string}, {string}, {string}, {string}")
    public void realizar_o_pagamento_com(String string, String string2, String string3, String string4) {

    }
    @E("valido a minha compra")
    public void valido_a_minha_compra() {

    }
}
