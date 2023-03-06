package steps;

import io.cucumber.java.pt.E;
import org.junit.Test;
import page.CommonPage;
import page.ProductPage;
public class ProductsSteps {
    @Test
    @E("selecionar a aba produtos")
    public void selecionar_a_aba_produtos() throws InterruptedException {
        ProductPage produtopage = new ProductPage();
        CommonPage commonpage = new CommonPage();
        commonpage.EsperaThread();
        produtopage.ProdutosClickMenu();
    }
    @Test
    @E("pesquisar pelo {string}")
    public void pesquisar_pelo(String produto) throws InterruptedException {
        ProductPage produtopage = new ProductPage();
        CommonPage commonpage = new CommonPage();
        produtopage.FechaPopupMouse();
        commonpage.EsperaThread();
        produtopage.PesquisarProduto(produto);
        produtopage.ClicarPesquisar();
    }
    @Test
    @E("adicionar ao carrinho a {string}")
    public void adicionar_ao_carrinho_a(String quantidade) throws InterruptedException {
        ProductPage produtopage = new ProductPage();
        CommonPage commonpage = new CommonPage();
        commonpage.rolarTelaProdutos();
        produtopage.ClicarVerProduto();
        produtopage.QtdProdutos(quantidade);
        produtopage.ClicarAddCarrinho();
        commonpage.EsperaThread();
        produtopage.ClicarContinuarComprando();
    }
    @Test
    @E("adicionar ao carrinho a {string} indo para o pagamento")
    public void adicionar_ao_carrinho_a_indo_para_o_pagamento(String quantidade) throws InterruptedException {
        ProductPage produtopage = new ProductPage();
        CommonPage commonpage = new CommonPage();
        commonpage.rolarTelaProdutos();
        produtopage.ClicarVerProduto();
        produtopage.QtdProdutos(quantidade);
        produtopage.ClicarAddCarrinho();
        commonpage.EsperaThread();
        produtopage.ClicarVerCarrinho();
    }
}
