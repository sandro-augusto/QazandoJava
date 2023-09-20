package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.HomePage;
import pages.LoginPage;
import runner.RunCucumberTest;
public class DescontoSteps extends RunCucumberTest {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage(driver);

    @Dado("^que esteja no site da Qazando$")
    public void que_esteja_no_site_da_Qazando() {
        loginPage.accessApplicator("Cuidado e diversão em cada passo");
    }

    @Quando("^informar os dados necessário para receber o cupom$")
    public void informar_os_dados_necessário_para_receber_o_cupom() {
        loginPage.clickBtnLogin("Quero ser Dog Walker");
    }

    @Então("^séra visualizado o código do cupom$")
    public void séra_visualizado_o_código_do_cupom() {
        homePage.accessHomePage("Voltar para home");
    }

}
