package br.com.rsinet.hub_bdd.appium.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				 features = "C:\\Users\\caique.oliveira\\eclipse-workspace\\AppiumBDD\\Feature"
				 ,glue="br.com.rsinet.hub_bdd.appium.stepDefinition"
				 ,tags= {"@CadastroSucesso"}
				 
				 )
		
public class CadastroUsuarioRunner {
	

}
