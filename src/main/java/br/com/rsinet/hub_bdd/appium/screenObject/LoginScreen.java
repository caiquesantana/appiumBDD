package br.com.rsinet.hub_bdd.appium.screenObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginScreen {
	private WebDriver driver;

	public LoginScreen(WebDriver driver) {
		this.driver = driver;
	}
	public LoginScreen homePage () {
		driver.findElement(By.id("com.Advantage.aShopping:id/imageViewMenu")).click();
		driver.findElement(By.id("com.Advantage.aShopping:id/textViewMenuUser")).click();
		return this;
	}
	public LoginScreen usuario (String login) {
		WebElement Usuario = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[3]/android.widget.EditText"));
		Usuario.sendKeys(login);
		return this;
	}
	public LoginScreen password (String senha) {
		WebElement Senha = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[4]/android.widget.EditText"));
		Senha.sendKeys(senha);
		return this;
	}
	public LoginScreen entrar () { 
	WebElement Submit = driver.findElement(By.id("com.Advantage.aShopping:id/buttonLogin"));
	Submit.click();
	return this;
	}
	
}
