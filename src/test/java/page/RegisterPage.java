package page;

import com.github.javafaker.Faker;
import elements.RegisterElements;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.Locale;

public class RegisterPage extends RegisterElements {

    public RegisterPage(){
        PageFactory.initElements(driver, this);
    }
    public void Clicarlogin(){
        linklogin.click();
    }
    public void FakerName(){
        Faker faker = new Faker(new Locale("pt-BR"));
        String firstName = faker.name().firstName();
        txtnome.sendKeys(firstName);
    }
    public void FakerEmail() {
        Faker faker = new Faker();
        String email = faker.name().username() + "@teste.com";
        txtemail.sendKeys(email);
    }
    public void ClicarCadastrar(){
        btnsignup.click();
    }
    public void SelecionarTitulo(){
        radMale.click();
    }
    public void FakerSenha(){
        Faker faker = new Faker(new Locale("pt-BR"));
        String psw = faker.number().digits(8);
        txtpassoword.sendKeys(psw);
    }
    public void DiaAniversario(){
        Select day = new Select(dayBirth);
        day.selectByValue("9");
    }
    public void MesAniversario(){
        Select mes = new Select(monthBirth);
        mes.selectByValue("7");
    }
    public void AnoAniversario(){
        Select ano = new Select(yearBirth);
        ano.selectByValue("1990");
    }
    public void FakerNome(){
        Faker faker = new Faker(new Locale("pt-BR"));
        String nome = faker.name().firstName();
        txtfirstName.sendKeys(nome);
    }
    public void FakerSobrenome(){
        Faker faker = new Faker(new Locale("pt-BR"));
        String sobrenome = faker.name().lastName();
        txtlasttName.sendKeys(sobrenome);
    }
    public void FakerEmpresa(){
        Faker faker = new Faker(new Locale("pt-BR"));
        String empresa = faker.company().name();
        company.sendKeys(empresa);
    }
    public void FakerEndereco(){
        Faker faker = new Faker(new Locale("pt-BR"));
        String endereco = faker.address().streetAddress();
        txtaddress.sendKeys(endereco);
    }
    public void SelecionarPais(){
        Select pais = new Select(country);
        pais.selectByValue("United States");
    }
    public void FakerEstado(){
        Faker faker = new Faker(new Locale("pt-BR"));
        String estado = faker.address().state();
        txtstate.sendKeys(estado);
    }
    public void FakerCidade(){
        Faker faker = new Faker(new Locale("pt-BR"));
        String cidade = faker.address().cityName();
        txtcity.sendKeys(cidade);
    }
    public void FakerCEP(){
        Faker faker = new Faker(new Locale("pt-BR"));
        String cep = faker.address().zipCode();
        txtpostcode.sendKeys(cep);
    }
    public void FakerNumCelular(){
        Faker faker = new Faker(new Locale("pt-BR"));
        String celular = faker.phoneNumber().cellPhone();
        txt_mobile.sendKeys(celular);
    }
    public void CriarUsuario(){
        btnRegister.click();
    }
    public void ValidarCriacaoUsuario(){
        validacontacriada.equals("Account Created!");
    }
}
