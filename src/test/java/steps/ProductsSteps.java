package steps;

import io.cucumber.java.pt.E;
import page.CommonPage;
import page.ProductPage;
public class ProductsSteps {
    @E("selecionar a aba produtos")
    public void selecionar_a_aba_produtos() {
        ProductPage produtopage = new ProductPage();
        produtopage.ProdutosClickMenu();
    }
    @E("pesquisar pelo {string}")
    public void pesquisar_pelo(String produto) throws InterruptedException {
        ProductPage produtopage = new ProductPage();
        CommonPage commonpage = new CommonPage();
        produtopage.FechaPopupMouse();
        commonpage.EsperaThread();
        produtopage.PesquisarProduto(produto);
        produtopage.ClicarPesquisar();
    }
    @E("adicionar ao carrinho a {string}")
    public void adicionar_ao_carrinho_a(String quantidade) throws InterruptedException {
        ProductPage produtopage = new ProductPage();
        CommonPage commonpage = new CommonPage();
        commonpage.rolarTela();
        produtopage.ClicarVerProduto();
        produtopage.QtdProdutos(quantidade);
        produtopage.ClicarAddCarrinho();
        commonpage.EsperaThread();
        produtopage.ClicarContinuarComprando();
    }
    @E("adicionar ao carrinho a {string} indo para o pagamento")
    public void adicionar_ao_carrinho_a_indo_para_o_pagamento(String quantidade) throws InterruptedException {
        ProductPage produtopage = new ProductPage();
        CommonPage commonpage = new CommonPage();
        commonpage.rolarTela();
        produtopage.ClicarVerProduto();
        produtopage.QtdProdutos(quantidade);
        produtopage.ClicarAddCarrinho();
        commonpage.EsperaThread();
        produtopage.ClicarVerCarrinho();
    }
}
