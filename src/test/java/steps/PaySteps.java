package steps;

import io.cucumber.java.pt.Então;
import page.CommonPage;
import page.PayPage;

public class PaySteps {
    @Então("realizar o pagamento com {string}, {string}, {string}, {string}, {string}")
    public void realizar_o_pagamento_com(String nome, String cc, String mes, String ano, String cvc) throws InterruptedException {
        PayPage paypage = new PayPage();
        CommonPage commonpage = new CommonPage();
        commonpage.EsperaThread();
        paypage.DigitaNomeCartao(nome);
        paypage.DigitaNumCartao(cc);
        paypage.DigitaNumCvc(cvc);
        paypage.DigitaMesVenc(mes);
        paypage.DigitaAnoVenc(ano);
        paypage.ClicarConfirmaPGT();
        paypage.ValidandoCompras();
    }
}
