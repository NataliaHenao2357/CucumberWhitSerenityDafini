package stepDefinitions;

import java.io.IOException;

import Tasks.BuscarPtoDafiti;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.SeleniumWebDriver;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import userInterface.DafitiUserInterface;


public class DafitiBuscadorStepDefinitions {

//estamos instanciando nuestro Actor 
@Before
public void before() throws IOException {
	OnStage.setTheStage(new OnlineCast()); 
	
}
@Given("^El usuario ingresa a la pagina de Dafiti (.*)$")
public void elUsuarioIngresaALaPaginaDeDafiti(String url) {
	OnStage.theActorCalled("Natalia").can(BrowseTheWeb.with(SeleniumWebDriver.ChromeWebDriver().on(url)));
 
}

@When("^Cuando busco el producto (.*) en el buscador$")
public void cuandoBuscoElProductoEnElBuscador(String producto) {
	OnStage.theActorInTheSpotlight().attemptsTo(BuscarPtoDafiti.on(producto));
   
}

@Then("^podre ver la informacion del producto (.*) En Pantalla$")
public void podreVerLaInformacionDelProductoEnPantalla(String producto) {
	OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(DafitiUserInterface.LBL_RESULTADO_PTO.of(producto)), 
			WebElementStateMatchers.containsText(producto)));
}




}

