package page;

import elements.ProductsElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;

public class ProductPage extends ProductsElements {
    public ProductPage(){
        PageFactory.initElements(driver, this);
    }
    public void ProdutosClickMenu(){
        abaProdutos.click()
        ;
    }

    public void PesquisarProduto(String produto){
        //String originalWindow = driver.getWindowHandle();
        //driver.switchTo().window(originalWindow);
        //driver.switchTo().frame(iframe);
        WebElement clickable = driver.findElement(By.id("aswift_4"));
        new Actions(driver)
                .clickAndHold(clickable)
                .perform();
/*        txtPesquisarProduto.sendKeys(produto);
        btnPesquisarProduto.click();*/

        //String teste = driver.getWindowHandle();
        //driver.switchTo().newWindow(WindowType.TAB);
        //driver.switchTo().newWindow(WindowType.WINDOW);
        //clickaleatorio.click();
        //clickaleatorio.click();
    }
}
