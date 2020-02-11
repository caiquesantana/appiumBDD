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


public class CadastroUsuarioScreenObject {
	private WebDriver driver;
	private WebDriverWait aguardar;
	private TouchAction actions;

	public CadastroUsuarioScreenObject(WebDriver driver) {
		this.driver = driver;
		aguardar = new WebDriverWait(driver, 5);
		actions = new TouchAction((PerformsTouchActions) driver);
	}

	public CadastroUsuarioScreenObject cadastro() {
		driver.findElement(By.id("com.Advantage.aShopping:id/imageViewMenu")).click();
		driver.findElement(By.id("com.Advantage.aShopping:id/textViewMenuUser")).click();
		driver.findElement(By.id("com.Advantage.aShopping:id/textViewDontHaveAnAccount")).click();
		return this;

	}
	public CadastroUsuarioScreenObject digitarLogin(String login) {
		WebElement usuario = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.EditText"));
		usuario.click();
		usuario.sendKeys(login);
		return this;
	}

	public CadastroUsuarioScreenObject digitarEmail(String email) {
		WebElement Email = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText"));
		Email.click();
		Email.sendKeys(email);
		return this;
	}

	public CadastroUsuarioScreenObject digitarSenha(String senha) {
		WebElement Senha = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.EditText"));
				Senha.click();
				Senha.sendKeys(senha);
		return this;
	}
	public CadastroUsuarioScreenObject confirmarSenha(String confirmaSenha) {
		WebElement ConfirmaSenha = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.EditText"));
				ConfirmaSenha.click();
				ConfirmaSenha.sendKeys(confirmaSenha);
		return this;
	}
	public CadastroUsuarioScreenObject digitarNome(String nome) {
		WebElement Nome = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.EditText"));
		Nome.click();
		Nome.sendKeys(nome);
		return this;
	}
	public CadastroUsuarioScreenObject digitarSobrenome(String sobreNome) {
		WebElement SobreNome = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.EditText"));
		SobreNome.click();
		SobreNome.sendKeys(sobreNome);
		return this;
	}
	public CadastroUsuarioScreenObject digitarTelefone(String contato) {
		WebElement Telefone = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText"));
		Telefone.click();
		Telefone.sendKeys(contato);
		return this;
	}

	public CadastroUsuarioScreenObject selecionaPais() {
		driver.findElement(By.id("com.Advantage.aShopping:id/textViewCountries")).click();
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[9]"))
				.click();
		return this;
	}

	public CadastroUsuarioScreenObject digitarEstado(String estado) {
		WebElement Estado = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText"));
		Estado.click();
		Estado.sendKeys(estado);
		return this;
	}

	public CadastroUsuarioScreenObject digitarRua(String rua) {
		WebElement Endereco = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText"));
		Endereco.click();
		Endereco.sendKeys(rua);
		return this;
	}

	public CadastroUsuarioScreenObject digitarCidade(String cidade) {
		WebElement Cidade = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.EditText"));
		Cidade.click();
		Cidade.sendKeys(cidade);
		return this;
	}

	public CadastroUsuarioScreenObject digitarCodigoPostal(String cep) {
		WebElement Cep = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.EditText"));
		Cep.click();
		Cep.sendKeys(cep);
		return this;
	}

	public CadastroUsuarioScreenObject enviarFormulario() {
		driver.findElement(By.id("com.Advantage.aShopping:id/buttonRegister")).click();
		return this;
	}

	public CadastroUsuarioScreenObject scroll() {
		actions.press(PointOption.point(1042, 1694)).moveTo(PointOption.point(1063, 403)).release().perform();
		return this;
	}

	public CadastroUsuarioScreenObject Expected() throws InterruptedException {
		aguardar.until(ExpectedConditions.elementToBeClickable(By.id("com.Advantage.aShopping:id/imageViewMenu")));
		return this;
	}
}
