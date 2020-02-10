package br.com.rsinet.hub_bdd.appium.screenObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.TouchAction;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.touch.offset.PointOption;


public class CadastroUsuarioScreenPage {
	private WebDriver driver;
	private WebDriverWait aguardar;
	private TouchAction actions;

	public CadastroUsuarioScreenPage(WebDriver driver) {
		this.driver = driver;
		aguardar = new WebDriverWait(driver, 5);
		actions = new TouchAction((PerformsTouchActions) driver);
	}

	public CadastroUsuarioScreenPage cadastro() {
		driver.findElement(By.id("com.Advantage.aShopping:id/imageViewMenu")).click();
		driver.findElement(By.id("com.Advantage.aShopping:id/textViewMenuUser")).click();
		driver.findElement(By.id("com.Advantage.aShopping:id/textViewDontHaveAnAccount")).click();
		return this;

	}
	public CadastroUsuarioScreenPage digitarLogin(String login) {
		WebElement usuario = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.EditText"));
		usuario.click();
		usuario.sendKeys(login);
		return this;
	}

	public CadastroUsuarioScreenPage digitarEmail(String email) {
		WebElement Email = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText"));
		Email.click();
		Email.sendKeys(email);
		return this;
	}

	public CadastroUsuarioScreenPage digitarSenha(String senha) {
		WebElement Senha = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.EditText"));
				Senha.click();
				Senha.sendKeys(senha);
		return this;
	}
	public CadastroUsuarioScreenPage confirmarSenha(String confirmaSenha) {
		WebElement ConfirmaSenha = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.EditText"));
				ConfirmaSenha.click();
				ConfirmaSenha.sendKeys(confirmaSenha);
		return this;
	}
	public CadastroUsuarioScreenPage digitarNome(String nome) {
		WebElement Nome = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.EditText"));
		Nome.click();
		Nome.sendKeys(nome);
		return this;
	}
	public CadastroUsuarioScreenPage digitarSobrenome(String sobreNome) {
		WebElement SobreNome = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.EditText"));
		SobreNome.click();
		SobreNome.sendKeys(sobreNome);
		return this;
	}
	public CadastroUsuarioScreenPage digitarTelefone(String contato) {
		WebElement Telefone = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText"));
		Telefone.click();
		Telefone.sendKeys(contato);
		return this;
	}

	public CadastroUsuarioScreenPage selecionaPais() {
		driver.findElement(By.id("com.Advantage.aShopping:id/textViewCountries")).click();
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[9]"))
				.click();
		return this;
	}

	public CadastroUsuarioScreenPage digitarEstado(String estado) {
		WebElement Estado = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText"));
		Estado.click();
		Estado.sendKeys(estado);
		return this;
	}

	public CadastroUsuarioScreenPage digitarRua(String rua) {
		WebElement Endereco = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText"));
		Endereco.click();
		Endereco.sendKeys(rua);
		return this;
	}

	public CadastroUsuarioScreenPage digitarCidade(String cidade) {
		WebElement Cidade = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.EditText"));
		Cidade.click();
		Cidade.sendKeys(cidade);
		return this;
	}

	public CadastroUsuarioScreenPage digitarCodigoPostal(String cep) {
		WebElement Cep = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.EditText"));
		Cep.click();
		Cep.sendKeys(cep);
		return this;
	}

	public CadastroUsuarioScreenPage enviarFormulario() {
		driver.findElement(By.id("com.Advantage.aShopping:id/buttonRegister")).click();
		return this;
	}

	public CadastroUsuarioScreenPage scroll() {
		actions.press(PointOption.point(1042, 1694)).moveTo(PointOption.point(1063, 403)).release().perform();
		return this;
	}

	public CadastroUsuarioScreenPage Expected() throws InterruptedException {
		aguardar.until(ExpectedConditions.elementToBeClickable(By.id("com.Advantage.aShopping:id/imageViewMenu")));
		return this;
	}
}
