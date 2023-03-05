package steps;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import page.CommonPage;
import page.RegisterPage;

public class RegisterStep {
    @Quando("selecionar para logar")
    public void selecionar_para_logar() throws InterruptedException {
        RegisterPage registerpage = new RegisterPage();
        CommonPage commonpage = new CommonPage();
        commonpage.EsperaThread();
        registerpage.Clicarlogin();
    }
    @E("digitar um novo nome e email")
    public void digitar_um_novo_nome_e_email() throws InterruptedException {
        RegisterPage registerpage = new RegisterPage();
        CommonPage commonpage = new CommonPage();
        commonpage.EsperaThread();
        registerpage.FakerName();
        registerpage.FakerEmail();
    }
    @E("selecionar para cadastrar")
    public void selecionar_para_cadastrar() {
        RegisterPage registerpage = new RegisterPage();
        registerpage.ClicarCadastrar();
    }
    @E("selecionar o titulo")
    public void selecionar_o_titulo() {
        RegisterPage registerpage = new RegisterPage();
        registerpage.SelecionarTitulo();
    }
    @E("selecionar a data de aniversario")
    public void selecionar_a_data_de_aniversario() {
        RegisterPage registerpage = new RegisterPage();
        registerpage.DiaAniversario();
        registerpage.MesAniversario();
        registerpage.AnoAniversario();
    }
    @E("digitar uma senha")
    public void digitar_uma_senha() {
        RegisterPage registerpage = new RegisterPage();
        registerpage.FakerSenha();
    }
    @E("digitar o primeiro nome")
    public void digitar_o_primeiro_nome() {
        RegisterPage registerpage = new RegisterPage();
        registerpage.FakerNome();
    }
    @E("digitar o sobrenome")
    public void digitar_o_sobrenome() {
        RegisterPage registerpage = new RegisterPage();
        registerpage.FakerSobrenome();
    }
    @E("digitar a empresa")
    public void digitar_a_empresa() {
        RegisterPage registerpage = new RegisterPage();
        registerpage.FakerEmpresa();
    }
    @E("digitar o endereço")
    public void digitar_o_endereço() {
        RegisterPage registerpage = new RegisterPage();
        registerpage.FakerEndereco();
    }
    @E("selecionar o pais")
    public void selecionar_o_pais() {
        RegisterPage registerpage = new RegisterPage();
        registerpage.SelecionarPais();
    }
    @E("digitar o estado")
    public void digitar_o_estado() {
        RegisterPage registerpage = new RegisterPage();
        registerpage.FakerEstado();
    }
    @E("digitar a cidade")
    public void digitar_a_cidade() {
        RegisterPage registerpage = new RegisterPage();
        registerpage.FakerCidade();
    }
    @E("digitar o cep")
    public void digitar_o_cep() {
        RegisterPage registerpage = new RegisterPage();
        registerpage.FakerCEP();
    }
    @E("digitar o numero de celular")
    public void digitar_o_numero_de_celular() {
        RegisterPage registerpage = new RegisterPage();
        registerpage.FakerNumCelular();
    }
    @E("selecionar para criar conta")
    public void selecionar_para_criar_conta() throws InterruptedException {
        RegisterPage registerpage = new RegisterPage();
        CommonPage commonpage = new CommonPage();
        commonpage.EsperaThread();
        registerpage.CriarUsuario();
    }
    @Então("valido a criação da nova conta")
    public void valido_a_criação_da_nova_conta() {
        RegisterPage registerpage = new RegisterPage();
        //CommonPage commonpage = new CommonPage();
        //commonpage.rolarTela2();
        registerpage.ValidarCriacaoUsuario();
    }
}
