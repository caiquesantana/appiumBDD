package br.com.rsinet.hub_bdd.appium.runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				 features = "Feature/PesquisaPaginaInicial.feature"
				 ,glue="br.com.rsinet.hub_bdd.appium.stepDefinition"
				 ,plugin = {"com.cucumber.listener.ExtentCucumberFormatter:C:\\Users\\caique.oliveira\\Pictures\\Appium\\BuscaPaginaInicial.html"}
				 ,tags= {"@BuscaHomeSucesso, @BuscaHomeFalha"}
				 )


public class BuscaPaginaInicialRunner {
	@AfterClass
	public static void report() {
    Reporter.loadXMLConfig(new File("C:\\Users\\caique.oliveira\\eclipse-workspace\\AppiumBDD\\reports.html"));

}

}