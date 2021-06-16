package Tasks;

import interacciones.ClicProductoAleatorio;
import interacciones.DespliegueMenu;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import userInterface.DafitiUserInterface;
import variablesGlobales.VariablesGlobales;

public class BuscarPtoAleatorioDafiti implements Task{
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				
				DespliegueMenu.on(DafitiUserInterface.BTN_CATEGORIA_DAFITI),
				Click.on(DafitiUserInterface.BTN_SUBCATEGORIA_DAFITI),
				ClicProductoAleatorio.on()
				
				);	
		
		VariablesGlobales.nombreProductoAleatorio = DafitiUserInterface.LBL_PRODUCTO_ALEATORIO_DAFITI.resolveFor(actor).getText();
	   
	}

	
	public static BuscarPtoAleatorioDafiti on() {
		return Instrumented.instanceOf(BuscarPtoAleatorioDafiti.class).withProperties();
	}

}
