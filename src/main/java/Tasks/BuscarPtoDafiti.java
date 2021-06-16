package Tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userInterface.DafitiUserInterface;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import variablesGlobales.VariablesGlobales;

public class BuscarPtoDafiti implements Task{ //se implementa la interface 
	
	private String producto;
	
	public BuscarPtoDafiti(String producto) {
		this.producto = producto;
}

	@Override
	public <T extends Actor> void performAs(T actor) { 
				actor.attemptsTo(
				Enter.theValue(producto).into(DafitiUserInterface.TXT_BUSCADOR_DAFITI),
				Click.on(DafitiUserInterface.BTN_BUSCADOR_DAFITI),	
				Click.on(DafitiUserInterface.BTN_BUSCADOR_PTO.of(producto))
				);// el actor puede realizar
		
			VariablesGlobales.nombreProducto = DafitiUserInterface.LBL_RESULTADO_DAFITI.of(producto).resolveFor(actor).getText();
	}
	
		public static BuscarPtoDafiti on(String producto) { //estamos inicializando las propiedades
		return Instrumented.instanceOf(BuscarPtoDafiti.class).withProperties(producto);
		
	}

}
