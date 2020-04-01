package br.com.rsinet.hub_bdd.appium.stepDefinition;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.rsinet.hub_bdd.appium.screenObject.BuscaPaginaInicialScreenObject;
import br.com.rsinet.hub_bdd.appium.screenObject.LoginScreenObject;
import br.com.rsinet.hub_bdd.appium.suporte.Context;
import br.com.rsinet.hub_bdd.appium.suporte.DriverWeb;
import br.com.rsinet.hub_bdd.appium.suporte.Prints;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class BuscaPaginaInicialSteps {
	private WebDriver driver = DriverWeb.driver;
	private BuscaPaginaInicialScreenObject busca;
	private Context testContext;
	private LoginScreenObject logar;
	
	public BuscaPaginaInicialSteps (Context context) {
		testContext = context;
		busca = testContext.getManager().getBuscaHome();
	}
	
	@Dado("^que estou na tela home$")
	public void que_estou_na_tela_home() throws Throwable {
		DriverWeb.creatDriver();
		
	  
	}

	//Possitivo
	@Quando("^clico na categoria LAPTOPS$")
	public void clico_na_categoria_LAPTOPS() throws Throwable {
		busca.categoriaLaptop();
	 
	}

	@Quando("^seleciono o produto$")
	public void seleciono_o_produto() throws Throwable {
		busca.produtoSelecionado();
		
		
	   
	}

	//Sucesso
	@Então("^eu valido o produto$")
	public void eu_valido_o_produto() throws Throwable {
		//WebElement produto = driver.findElement(By.id("//android.widget.RelativeLayout[@content-desc=\"Laptops\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[1]/android.widget.TextView[1]"));
		String produto = "HP CHROMEBOOK 14 G1(ENERGY STAR)";
		String selecionado = driver.findElement(By.id("com.Advantage.aShopping:id/textViewProductName")).getText();
		Assert.assertTrue(produto.equals(selecionado));
		Prints.tirarPrints("BuscaHomeSucesso", driver);
		DriverWeb.fecharDriver();
	}

	//Falha
	@Dado("^Faco o login$")
	public void faco_o_login() throws Throwable {
		LoginScreenObject logar = new LoginScreenObject (driver);
		logar.homePage().usuario("cauasantana").password("Caique1").entrar();
	   
	}

	@Dado("^escolho produto na tela inicial$")
	public void escolho_produto_na_tela_inicial() throws Throwable {
		busca.categoriaLaptop();
		busca.produtoSelecionado();
	   
	}

	@Dado("^adiciono mais de (\\d+) unidades no carrinho$")
	public void adiciono_mais_de_unidades_no_carrinho(int arg1) throws Throwable {
		busca.addCarrinho();
		busca.quantidade("1");
		busca.confirmarCompra();
		
	 
	}

	@Então("^eu comparo a quantidade de produto no carrinho$")
	public void eu_comparo_a_quantidade_de_produto_no_carrinho() throws Throwable {
		WebElement quantidade = driver.findElement(By.id("com.Advantage.aShopping:id/textViewProductQuantity"));
		quantidade.getText();
		String qtdCarrinho = driver.findElement(By.id("com.Advantage.aShopping:id/textViewCartLength")).getText();
		Assert.assertFalse(qtdCarrinho.equals(quantidade));
		Prints.tirarPrints("BuscaHomeFalha", driver);
		DriverWeb.fecharDriver();
	}

}