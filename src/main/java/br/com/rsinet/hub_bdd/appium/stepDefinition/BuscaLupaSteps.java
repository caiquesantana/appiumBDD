package br.com.rsinet.hub_bdd.appium.stepDefinition;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_bdd.appium.screenObject.BuscaLupaScreenObject;
import br.com.rsinet.hub_bdd.appium.screenObject.BuscaPaginaInicialScreenObject;
import br.com.rsinet.hub_bdd.appium.screenObject.LoginScreenObject;
import br.com.rsinet.hub_bdd.appium.suporte.Context;
import br.com.rsinet.hub_bdd.appium.suporte.DriverWeb;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class BuscaLupaSteps {
	private WebDriver driver;
	private BuscaLupaScreenObject lupa;
	private Context testContext;
	
	public BuscaLupaSteps (Context context) throws MalformedURLException {
		testContext = context;
		lupa = testContext.getManager().getLupa();
		driver = testContext.getDriver().creatDriver();
	}
	
	@Dado("^que estou na tela inicial$")
	public void que_estou_na_tela_inicial() throws Throwable {
		driver = DriverWeb.creatDriver();
	}

	@Quando("^clico na lupa de pesquisa$")
	public void clico_na_lupa_de_pesquisa() throws Throwable {
		lupa.clicarLupa();
	}

	@Quando("^digito o nome do produto desejado$")
	public void digito_o_nome_do_produto_desejado() throws Throwable {
		lupa.campoDePesquisa("HP CHROMEBOOK 14 G1(ENERGY");
	}

	@Quando("^clico no produto$")
	public void clico_no_produto() throws Throwable {
		lupa.clicarLupa();
	}

	@Então("^estarei na tela do produto pesquisado$")
	public void estarei_na_tela_do_produto_pesquisado() throws Throwable {
		lupa.selecionaProduto();
		
	}

	@Quando("^digitar um produto inexistente no site$")
	public void digitar_um_produto_inexistente_no_site() throws Throwable {
		lupa.campoDePesquisa("XBOX One");
		lupa.pesquisar();
		
	}

	@Entao("^constata que o produto nao existe$")
	public void constata_que_o_produto_nao_existe() throws Throwable {
	}
	
	@After
	public void fecharDriver() {
		DriverWeb.fecharDriver();
	}

}
