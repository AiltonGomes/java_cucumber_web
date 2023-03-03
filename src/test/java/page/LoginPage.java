package page;
import elements.LoginElements;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends LoginElements {
    public LoginPage(){
        PageFactory.initElements(driver, this);
    }
    public void LoginClickMenu(){
        linklogin.click();
    }
    public void LoginInpUsuario(String usuario){
        txtemail.sendKeys(usuario);
    }
    public void LoginInpSenha(String senha){
        txtsenha.sendKeys(senha);
        btnlogin.click();
    }
}
