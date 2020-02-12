package br.com.rsinet.hub_bdd.appium.stepDefinition;

import java.net.MalformedURLException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_bdd.appium.screenObject.BuscaLupaScreenObject;
import br.com.rsinet.hub_bdd.appium.screenObject.BuscaPaginaInicialScreenObject;
import br.com.rsinet.hub_bdd.appium.screenObject.LoginScreenObject;
import br.com.rsinet.hub_bdd.appium.suporte.Context;
import br.com.rsinet.hub_bdd.appium.suporte.DriverWeb;
import br.com.rsinet.hub_bdd.appium.suporte.Prints;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class BuscaLupaSteps {
	private WebDriver driver;
	private BuscaLupaScreenObject lupa;
	private Context testContext;
	private String produto = "HP CHROMEBOOK 14 G1(ES)";
	
	public BuscaLupaSteps (Context context) throws MalformedURLException {
		testContext = context;
		lupa = testContext.getManager().getLupa();
		driver = testContext.getDriver().creatDriver();
	}
	
	@Dado("^que estou na tela inicial$")
	public void que_estou_na_tela_inicial() throws Throwable {
		DriverWeb.creatDriver();
	}

	@Quando("^clico na lupa de pesquisa$")
	public void clico_na_lupa_de_pesquisa() throws Throwable {
		lupa.clicarLupa();
	}

	@Quando("^digito o nome do produto desejado$")
	public void digito_o_nome_do_produto_desejado() throws Throwable {
		lupa.campoDePesquisa(produto);
		lupa.clicarLupa();
	}

	@Quando("^clico no produto$")
	public void clico_no_produto() throws Throwable {
		lupa.selecionaProduto();
	}

	//Sucesso
	@Então("^estarei na tela do produto pesquisado$")
	public void estarei_na_tela_do_produto_pesquisado() throws Throwable {
		Assert.assertTrue(produto.equals("HP CHROMEBOOK 14 G1(ES)"));
		Prints.tirarPrints("BuscaLupaSucesso", driver);
		DriverWeb.fecharDriver();
		
	}

	@Quando("^digitar um produto inexistente no site$")
	public void digitar_um_produto_inexistente_no_site() throws Throwable {
		lupa.campoDePesquisa("XBOX One");
		lupa.pesquisar();
		
	}

	//Falha
	@Entao("^constata que o produto nao existe$")
	public void constata_que_o_produto_nao_existe() throws Throwable {
		String noResults = driver.findElement(By.id("com.Advantage.aShopping:id/textViewNoProductsToShow")).getText();
		Assert.assertTrue(noResults.equals("- No results for \"XBOX One\" -"));
		Prints.tirarPrints("BuscaLupaFalha", driver);
		DriverWeb.fecharDriver();
	}
	
}
