package br.com.rsinet.hub_bdd.appium.screenObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuscaLupaScreenObject {
	private WebDriver driver;
	private String produto = "HP CHROMEBOOK 14 G1(ES)";
	
	public BuscaLupaScreenObject(WebDriver driver) {
		this.driver = driver;
	}

	public BuscaLupaScreenObject clicarLupa() {
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView")).click();
		return this;
	}
	public BuscaLupaScreenObject campoDePesquisa (String pesquisa) {
		driver.findElement(By.id("com.Advantage.aShopping:id/editTextSearch")).sendKeys(pesquisa);
		return this;
	}
	public BuscaLupaScreenObject selecionaProduto () {
		driver.findElement(By.id("com.Advantage.aShopping:id/imageViewProduct")).click();
		return this;
	}
	public BuscaLupaScreenObject pesquisar() {
		driver.findElement(By.id("com.Advantage.aShopping:id/imageViewSearch")).click();
		return this;
	}

}
