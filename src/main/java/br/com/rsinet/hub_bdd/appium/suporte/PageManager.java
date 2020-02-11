package br.com.rsinet.hub_bdd.appium.suporte;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_bdd.appium.screenObject.BuscaLupaScreenObject;
import br.com.rsinet.hub_bdd.appium.screenObject.BuscaPaginaInicialScreenObject;
import br.com.rsinet.hub_bdd.appium.screenObject.CadastroUsuarioScreenObject;

public class PageManager {
	private WebDriver driver;
	private CadastroUsuarioScreenObject formCadastro;
	private BuscaPaginaInicialScreenObject buscaHome;
	private BuscaLupaScreenObject lupa;
	
	public PageManager(WebDriver driver) {
		this.driver = driver;
	}

	public CadastroUsuarioScreenObject getFormCadastro() {
		return (formCadastro == null) ? formCadastro = new CadastroUsuarioScreenObject(driver) : formCadastro;
	}
	public BuscaPaginaInicialScreenObject getBuscaHome() {
		return (buscaHome == null) ? buscaHome = new BuscaPaginaInicialScreenObject(driver) : buscaHome;
	}

	public BuscaLupaScreenObject getLupa() {
		return (lupa == null) ? lupa = new BuscaLupaScreenObject(driver) : lupa;
	}
}