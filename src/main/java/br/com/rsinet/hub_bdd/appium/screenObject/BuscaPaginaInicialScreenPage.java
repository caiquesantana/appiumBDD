package br.com.rsinet.hub_bdd.appium.screenObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BuscaPaginaInicialScreenPage {
	private WebDriver driver;
	private WebDriverWait aguardar;

	public BuscaPaginaInicialScreenPage (WebDriver driver) {
		this.driver = driver;
	}
	public BuscaPaginaInicialScreenPage categoriaLaptop () {
		driver.findElement(By.xpath("//android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.ImageView")).click();
		return this;
	}
	public BuscaPaginaInicialScreenPage produtoSelecionado() {
		driver.findElement(By.xpath("//android.widget.RelativeLayout[@content-desc=\"Laptops\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[1]/android.widget.TextView[1]")).click();
		return this;
	}
	public BuscaPaginaInicialScreenPage addCarrinho () {
		driver.findElement(By.id("com.Advantage.aShopping:id/textViewProductQuantity")).click();
		
		return this;
	}
	public BuscaPaginaInicialScreenPage confirmarCompra () {
		driver.findElement(By.id("com.Advantage.aShopping:id/textViewApply")).click();
		driver.findElement(By.id("com.Advantage.aShopping:id/buttonProductAddToCart")).click();
		return this;
		
	}
	
	public BuscaPaginaInicialScreenPage credenciais () {
		//credenciais necessaria para add ao carrinho
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[3]/android.widget.EditText")).sendKeys("cauasantana");
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[4]/android.widget.EditText")).sendKeys("Caique1");
		driver.findElement(By.id("com.Advantage.aShopping:id/buttonLogin")).click();
		return this;
	}
	public BuscaPaginaInicialScreenPage Expected() throws InterruptedException {
		aguardar.until(ExpectedConditions.elementToBeClickable(By.id("com.Advantage.aShopping:id/imageViewMenu")));
		return this;
	}
}
