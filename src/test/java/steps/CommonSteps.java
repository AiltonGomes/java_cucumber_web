package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import org.junit.Test;
import page.LoginPage;
import util.*;

public class CommonSteps {
    @Test
    @Dado("que acesso o ecommerce")
    public void acessarEcommerce() {
        String ecommerceUrl = "https://automationexercise.com/";
        TestRule.abrirNavegador(ecommerceUrl);
    }
}
