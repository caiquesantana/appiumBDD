package br.com.rsinet.hub_bdd.appium.suporte;

import java.net.MalformedURLException;

public class Context {
	private DriverWeb createDriver;
	private PageManager manager;
	
	public Context() throws MalformedURLException {
		createDriver = new DriverWeb();
		manager = new PageManager(DriverWeb.creatDriver());
	}
	public DriverWeb getDriver() {
		return createDriver;
	}
	public PageManager getManager() {
		return manager;
	}

}
