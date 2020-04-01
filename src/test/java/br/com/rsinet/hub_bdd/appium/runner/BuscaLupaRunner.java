package br.com.rsinet.hub_bdd.appium.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				 features = "Feature/BuscaProdutoLupa.feature"
				 ,glue= {"br.com.rsinet.hub_bdd.appium.stepDefinition","br.com.rsinet.hub_bdd.appium.suporte"}
				 ,tags= {"@PesquisaLupaSucesso"}
				 )

public class BuscaLupaRunner {

}
