package br.com.rsinet.hub_bdd.appium.stepDefinition;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import br.com.rsinet.hub_bdd.appium.screenObject.CadastroUsuarioScreenPage;
import br.com.rsinet.hub_bdd.appium.suporte.Context;
import br.com.rsinet.hub_bdd.appium.suporte.DriverWeb;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class CadastroUsuarioStep {
	private WebDriver driver;
	private Context testContext;
	private CadastroUsuarioScreenPage cadastroForm;
	
	@SuppressWarnings("static-access")
	public CadastroUsuarioStep (Context context) throws MalformedURLException {
		testContext = context;
		cadastroForm = testContext.getManager().getFormCadastro();
		driver = testContext.getDriver().creatDriver();
	}
	
	@Dado("^que eu esteja no site$")
	public void que_eu_esteja_no_site() throws Throwable {
		driver = DriverWeb.creatDriver();
	}

	@Dado("^clico em criar nova conta$")
	public void clico_em_criar_nova_conta() throws Throwable {
		CadastroUsuarioScreenPage cadastroForm = new CadastroUsuarioScreenPage(driver);
		cadastroForm.cadastro();
	}

	@Dado("^insiro o login$")
	public void insiro_o_login() throws Throwable {
		cadastroForm.digitarLogin("Matuhqe");
		
	}

	@Dado("^o email$")
	public void o_email() throws Throwable {
		cadastroForm.digitarEmail("matue@email.com");
	}

	@Dado("^a senha$")
	public void a_senha() throws Throwable {
		cadastroForm.digitarSenha("Matue1");
	}

	@Dado("^confirmo a senha$")
	public void confirmo_a_senha() throws Throwable {
		cadastroForm.confirmarSenha("Matue1");
	}

	@Dado("^o nome$")
	public void o_nome() throws Throwable {
		cadastroForm.digitarNome("caique");
		
	}

	@Dado("^o sobrenome$")
	public void o_sobrenome() throws Throwable {
		cadastroForm.digitarSobrenome("caique");
		cadastroForm.scroll();
	}
	
	@Dado("^o telefone$")
	public void o_telefone() throws Throwable {
		cadastroForm.digitarTelefone("1110393829");
	}

	@Dado("^seleciono o Pais$")
	public void seleciono_o_Pais() throws Throwable {
		cadastroForm.selecionaPais();
	}

	@Dado("^o insiro o Estado$")
	public void o_insiro_o_Estado() throws Throwable {
		cadastroForm.digitarEstado("caique");
	}

	@Dado("^o endereco$")
	public void o_endereco() throws Throwable {
		cadastroForm.digitarRua("caique");
		
	}

	@Dado("^a Cidade$")
	public void a_Cidade() throws Throwable {
		cadastroForm.digitarCidade("caique");
		
	}

	@Dado("^o codigo postal$")
	public void o_codigo_postal() throws Throwable {
		cadastroForm.digitarCodigoPostal("0938920");
		cadastroForm.scroll();
	}

	@Quando("^clico no botão de registrar$")
	public void clico_no_botão_de_registrar() throws Throwable {
		cadastroForm.enviarFormulario();
		cadastroForm.Expected();
	}

	//Cenário possitivo
	@Então("^o usuário foi cadastrado$")
	public void o_usuário_foi_cadastrado() throws Throwable {
		driver.findElement(By.id("com.Advantage.aShopping:id/imageViewMenu")).click();
		cadastroForm.Expected();
		DriverWeb.fecharDriver();
		
		
	}

	//Cenário Falha
	@Então("^apresenta o que o login já esta cadastrado$")
	public void apresenta_o_que_o_login_já_esta_cadastrado() throws Throwable {
		driver.findElement(By.id("com.Advantage.aShopping:id/imageViewMenu")).click();
		cadastroForm.Expected();
		DriverWeb.fecharDriver();
	}

}
