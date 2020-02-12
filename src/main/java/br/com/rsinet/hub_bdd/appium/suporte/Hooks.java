//package br.com.rsinet.hub_bdd.appium.suporte;
//
//import java.net.MalformedURLException;
//
//import cucumber.api.java.After;
//import cucumber.api.java.Before;
//
//public class Hooks {
//	private Context context;
//	
//	public Hooks(Context getContext) {
//		context = getContext;
//	}
//	
//	@Before
//	public void iniciaApp() throws MalformedURLException {
//		context.getDriver();
//		DriverWeb.creatDriver();
//	}
//	@After(order = 0)
//	public void finalizaApp() {
//		context.getDriver().fecharDriver();
//	}
//}
