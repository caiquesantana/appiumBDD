package br.com.rsinet.hub_bdd.appium.suporte;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_bdd.appium.screenObject.CadastroUsuarioScreenPage;

public class PageManager {
	private WebDriver driver;
	private CadastroUsuarioScreenPage formCadastro;

	public PageManager(WebDriver driver) {
		this.driver = driver;
	}

	public CadastroUsuarioScreenPage getFormCadastro() {
		return (formCadastro == null) ? formCadastro = new CadastroUsuarioScreenPage(driver) : formCadastro;

	}

}