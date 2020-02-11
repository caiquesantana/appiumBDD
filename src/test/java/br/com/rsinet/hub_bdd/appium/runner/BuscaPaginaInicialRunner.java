package br.com.rsinet.hub_bdd.appium.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				 features = "Feature/PesquisaPaginaInicial.feature"
				 ,glue="br.com.rsinet.hub_bdd.appium.stepDefinition"
				 ,tags= {"@BuscaHomeSucesso, @BuscaHomeFalha"}
				 )

public class BuscaPaginaInicialRunner {

}
