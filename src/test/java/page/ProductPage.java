package page;

import elements.ProductsElements;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends ProductsElements {
    public ProductPage(){
        PageFactory.initElements(driver, this);
    }
    public void ProdutosClickMenu(){
        abaProdutos.click();
    }
    public void PesquisarProduto(String produto){
        txtPesquisarProduto.sendKeys(produto);
    }
    public void FechaPopupMouse() {
        WebElement clickable = abaProdutos;
        new Actions(driver)
                .click(clickable)
                .perform();
    }
    public void ClicarPesquisar() {
        btnPesquisarProduto.click();
    }
    public void ClicarVerProduto(){
        btnverproduto.click();
    }
    public void QtdProdutos(String quantidade){
        txtquantidadeproduto.click();
        txtquantidadeproduto.clear();
        txtquantidadeproduto.sendKeys(quantidade);
    }
    public void ClicarAddCarrinho(){
        btnaddtocart.click();
    }
    public void ClicarContinuarComprando(){
        btcontinueshopping.click();
    }
    public void ClicarVerCarrinho(){
        vercarrinho.click();
    }
}
