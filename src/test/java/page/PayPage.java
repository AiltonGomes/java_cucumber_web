package page;

import elements.PayElements;
import org.openqa.selenium.support.PageFactory;

public class PayPage extends PayElements {
    public PayPage(){
        PageFactory.initElements(driver, this);
    }
    public void DigitaNomeCartao(String namecartao){
        nomecartao.sendKeys(namecartao);
    }
    public void DigitaNumCartao(String cardnumber){
        numcartao.sendKeys(cardnumber);
    }
    public void DigitaNumCvc(String cvc){
        numcvc.sendKeys(cvc);
    }
    public void DigitaMesVenc(String mes){
        mesvalidade.sendKeys(mes);
    }
    public void DigitaAnoVenc(String ano){
        anovalidade.sendKeys(ano);
    }
    public void ClicarConfirmaPGT(){
        confirmarpgt.click();
    }
    public void ValidandoCompras() {
        validarcompra.equals("Order Placed!");
    }
}
