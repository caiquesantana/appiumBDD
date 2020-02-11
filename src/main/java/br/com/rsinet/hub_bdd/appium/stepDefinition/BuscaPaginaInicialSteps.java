package br.com.rsinet.hub_bdd.appium.stepDefinition;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.rsinet.hub_bdd.appium.screenObject.BuscaPaginaInicialScreenPage;
import br.com.rsinet.hub_bdd.appium.screenObject.LoginScreen;
import br.com.rsinet.hub_bdd.appium.suporte.Context;
import br.com.rsinet.hub_bdd.appium.suporte.DriverWeb;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class BuscaPaginaInicialSteps {
	private WebDriver driver;
	private BuscaPaginaInicialScreenPage busca;
	private Context testContext;
	private LoginScreen logar;
	
	public BuscaPaginaInicialSteps (Context context) throws MalformedURLException {
		testContext = context;
		busca = testContext.getManager().getBuscaHome();
		driver = testContext.getDriver().creatDriver();
	}
	
	//Contexto
	@Dado("^que estou na tela home$")
	public void que_estou_na_tela_home() throws Throwable {
		driver = DriverWeb.creatDriver();
	  
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

	@Então("^eu valido o produto$")
	public void eu_valido_o_produto() throws Throwable {
		//WebElement produto = driver.findElement(By.id("//android.widget.RelativeLayout[@content-desc=\"Laptops\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[1]/android.widget.TextView[1]"));
		String produto = "HP CHROMEBOOK 14 G1(ENERGY STAR)";
		String selecionado = driver.findElement(By.id("com.Advantage.aShopping:id/textViewProductName")).getText();
		
		Assert.assertTrue(produto.equals(selecionado));
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		DriverWeb.fecharDriver();
	  
	}

	//negativo
	@Dado("^Faco o login$")
	public void faco_o_login() throws Throwable {
		LoginScreen logar = new LoginScreen (driver);
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
		WebElement quantidade = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText"));
		quantidade.click();
		quantidade.sendKeys("1");
		busca.confirmarCompra();
		
	 
	}

	@Então("^eu comparo a quantidade de produto no carrinho$")
	public void eu_comparo_a_quantidade_de_produto_no_carrinho() throws Throwable {
		WebElement quantidade = driver.findElement(By.id("com.Advantage.aShopping:id/textViewProductQuantity"));
		quantidade.getText();
		String qtdCarrinho = driver.findElement(By.id("com.Advantage.aShopping:id/textViewCartLength")).getText();
		Assert.assertFalse(qtdCarrinho.equals(quantidade));
		
	}

}