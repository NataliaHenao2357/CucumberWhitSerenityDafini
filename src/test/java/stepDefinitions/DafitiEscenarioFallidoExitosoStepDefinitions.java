package stepDefinitions;


import java.util.List;
import Tasks.BuscarPtoDafiti;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.SeleniumWebDriver;
import modelos.Producto;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import userInterface.DafitiUserInterface;
import variablesGlobales.VariablesGlobales;


public class DafitiEscenarioFallidoExitosoStepDefinitions {
	
	@Given("^El cliente inicializa la pagina de Dafiti https://www.dafiti.com.co$")
	public void elClienteInicializaLaPaginaDeDafitiHttpsWwwDafitiComCo() {
		OnStage.theActorCalled("Natalia").can(BrowseTheWeb.with(SeleniumWebDriver.ChromeWebDriver().on("https://www.dafiti.com.co")));	  
	}

	@When("^Se realiza busqueda de un producto$")
	public void seRealizaBusquedaDeUnProducto(List<Producto> productos) {
		OnStage.theActorInTheSpotlight().attemptsTo(BuscarPtoDafiti.on(productos.get(0).getNombreProducto()));
	}

	@Then("^Puedo validar el articulo en la pantalla$")
	public void puedoValidarElArticuloEnLaPantalla() {
		OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(DafitiUserInterface.LBL_RESULTADO_DAFITI.of(VariablesGlobales.nombreProducto)),
				WebElementStateMatchers.containsText(VariablesGlobales.nombreProducto)));
	}
	




}

