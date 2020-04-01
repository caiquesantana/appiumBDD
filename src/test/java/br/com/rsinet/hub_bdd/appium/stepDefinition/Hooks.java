package br.com.rsinet.hub_bdd.appium.stepDefinition;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import br.com.rsinet.hub_bdd.appium.suporte.Context;
import br.com.rsinet.hub_bdd.appium.suporte.DriverWeb;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
private Context context;
	
	public Hooks(Context getContext) {
		context = getContext;
	}
	@Before
	public void abreBrowser() {
		context.getDriver();
	}
	@After
	public void fechaBrowser(Scenario scenario) {
		String screenshotName = scenario.getName().replaceAll(" ", "_");
		try {
			context.getDriver();
			File sourcePath = ((TakesScreenshot) DriverWeb.creatDriver())
					.getScreenshotAs(OutputType.FILE);

			File destinationPath = new File(
					"C:\\Users\\caique.oliveira\\eclipse-workspace\\compraBDD\\Report\\"
							+ screenshotName + ".png");

			Files.copy(sourcePath, destinationPath);

			Reporter.addScreenCaptureFromPath(destinationPath.toString());
		} catch (IOException e) {
			System.out.println("Erro" + e.getMessage());
		}
		context.getDriver();
		DriverWeb.fecharDriver();
	}
}