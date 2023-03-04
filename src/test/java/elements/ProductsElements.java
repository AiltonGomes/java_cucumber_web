package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import page.CommonPage;

public class ProductsElements extends CommonPage {
    @FindBy(xpath = "//a[contains(.,'\uE8F8 Products')]")
    protected WebElement abaProdutos;
    @FindBy(id = "search_product")
    protected WebElement txtPesquisarProduto;
    @FindBy(id = "submit_search")
    protected WebElement btnPesquisarProduto;
    @FindBy(xpath = "//a[contains(.,'View Product')]")
    protected WebElement btnverproduto;
    @FindBy(id = "quantity")
    protected WebElement txtquantidadeproduto;
    @FindBy(xpath = "//button[@type='button'][contains(.,'Add to cart')]")
    protected WebElement btnaddtocart;
    @FindBy(xpath = "//button[@class='btn btn-success close-modal btn-block'][contains(.,'Continue Shopping')]")
    protected WebElement btcontinueshopping;
    @FindBy(xpath = "//u[contains(.,'View Cart')]")
    protected WebElement vercarrinho;
}
