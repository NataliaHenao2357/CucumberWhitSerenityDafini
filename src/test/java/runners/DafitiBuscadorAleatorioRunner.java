package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/BuscadorDafitiAleatorio.feature",//debe ir el nombre la ruta del feature 
		glue = "stepDefinitions",
		snippets = SnippetType.CAMELCASE) //

public class DafitiBuscadorAleatorioRunner {

}
