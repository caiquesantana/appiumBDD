package br.com.rsinet.hub_bdd.appium.stepDefinition;

import java.net.MalformedURLException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.rsinet.hub_bdd.appium.screenObject.CadastroUsuarioScreenObject;
import br.com.rsinet.hub_bdd.appium.suporte.Context;
import br.com.rsinet.hub_bdd.appium.suporte.DriverWeb;
import br.com.rsinet.hub_bdd.appium.suporte.Prints;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class CadastroUsuarioSteps {
	private WebDriver driver;
	private Context testContext;
	private CadastroUsuarioScreenObject cadastroForm;
	
	@SuppressWarnings("static-access")
	public CadastroUsuarioSteps (Context context) throws MalformedURLException {
		testContext = context;
		cadastroForm = testContext.getManager().getFormCadastro();
		driver = testContext.getDriver().creatDriver();
	}
	
	@Dado("^que eu esteja no app$")
	public void que_eu_esteja_no_app() throws Throwable {
		DriverWeb.creatDriver();
	    
	}

	@Dado("^clico em criar nova conta$")
	public void clico_em_criar_nova_conta() throws Throwable {
		cadastroForm.cadastro();
	    
	}

	@Dado("^insiro o login \"([^\"]*)\"$")
	public void insiro_o_login(String login) throws Throwable {
		cadastroForm.digitarLogin(login);
	    
	}

	@Dado("^o email \"([^\"]*)\"$")
	public void o_email(String email) throws Throwable {
		cadastroForm.digitarEmail(email);
	    
	}

	@Dado("^a senha \"([^\"]*)\"$")
	public void a_senha(String senha) throws Throwable {
		cadastroForm.digitarSenha(senha);
	    
	}

	@Dado("^confirmo a senha \"([^\"]*)\"$")
	public void confirmo_a_senha(String confirmaSenha) throws Throwable {
		cadastroForm.confirmarSenha(confirmaSenha);
	   
	}

	@Dado("^o nome \"([^\"]*)\"$")
	public void o_nome(String nome) throws Throwable {
		cadastroForm.digitarNome(nome);
		
	    
	}

	@Dado("^o sobrenome \"([^\"]*)\"$")
	public void o_sobrenome(String sobrenome) throws Throwable {
		cadastroForm.digitarSobrenome(sobrenome);
		cadastroForm.scroll();
	   
	}

	@Dado("^o telefone \"([^\"]*)\"$")
	public void o_telefone(String contato) throws Throwable {
		cadastroForm.digitarTelefone(contato);
	   
	}

	@Dado("^seleciono o Pais$")
	public void seleciono_o_Pais() throws Throwable {
		cadastroForm.selecionaPais();
	    
	}

	@Dado("^o insiro o Estado \"([^\"]*)\"$")
	public void o_insiro_o_Estado(String estado) throws Throwable {
		cadastroForm.digitarEstado(estado);
	  
	}

	@Dado("^o endereco \"([^\"]*)\"$")
	public void o_endereco(String endereco) throws Throwable {
		cadastroForm.digitarRua(endereco);
	    
	}

	@Dado("^a Cidade \"([^\"]*)\"$")
	public void a_Cidade(String cidade) throws Throwable {
		cadastroForm.digitarCidade(cidade);
	   
	}

	@Dado("^o codigo postal \"([^\"]*)\"$")
	public void o_codigo_postal(String cep) throws Throwable {
		cadastroForm.digitarCodigoPostal(cep);
		cadastroForm.scroll();
	    
	}

	@Quando("^clico no botão de registrar$")
	public void clico_no_botão_de_registrar() throws Throwable {
		cadastroForm.enviarFormulario();
	}

	//Sucesso
	@Então("^o usuário foi cadastrado \"([^\"]*)\"$")
	public void o_usuário_foi_cadastrado(String login) throws Throwable {
		cadastroForm.Expected();
		driver.findElement(By.id("com.Advantage.aShopping:id/imageViewMenu")).click();
		String usuarioLogado = driver.findElement(By.id("com.Advantage.aShopping:id/textViewMenuUser")).getText();
		Assert.assertTrue(login.equals(usuarioLogado));
		Prints.tirarPrints("CadastroUsuarioSucesso", driver);
		DriverWeb.fecharDriver();
		
	}

	//Falha
	@Então("^apresenta o que o login já esta cadastrado \"([^\"]*)\"$")
	public void apresenta_o_que_o_login_já_esta_cadastrado(String login) throws Throwable {
		cadastroForm.Expected();
		driver.findElement(By.id("com.Advantage.aShopping:id/imageViewMenu")).click();
		String usuarioLogado = driver.findElement(By.id("com.Advantage.aShopping:id/textViewMenuUser")).getText();
		Assert.assertFalse(login.equals(usuarioLogado));
		Prints.tirarPrints("CadastroUsuarioFalha", driver);
		DriverWeb.fecharDriver();
	   
	}	
}
