package elements;
import page.CommonPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeElements extends CommonPage{
    @FindBy(id = "search_query_top")
    protected WebElement txtPesquisarProduto;
    @FindBy(name = "submit_search")
    protected WebElement btnPesquisarProduto;
    @FindBy(css = ".heading-counter")
    protected WebElement lblQtdResultadosEncontrados;
    @FindBy(partialLinkText = "/products")
    protected WebElement linkProdutos;

}
