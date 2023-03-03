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
    @FindBy(id = "aswift_4")
    protected WebElement clickaleatorio;



}
