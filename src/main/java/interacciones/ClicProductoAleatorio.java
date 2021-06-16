package interacciones;

import java.util.List;
import java.util.Random;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import userInterface.DafitiUserInterface;
import variablesGlobales.VariablesGlobales;

public class ClicProductoAleatorio implements Interaction{// 
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		Random random = new Random();
		List<WebElementFacade> listaBotonesProductos = DafitiUserInterface.BTN_PRODUCTO_ALEATORIO_DAFITI.resolveAllFor(actor);
		List<WebElementFacade> listaNombresProductos = DafitiUserInterface.BTN_PRODUCTO_ALEATORIO_DAFITI.resolveAllFor(actor);		
		int numeroAleatorio = random.nextInt(listaBotonesProductos.size()+1); //indice comienza en 1
		VariablesGlobales.nombreProductoAleatorio = listaNombresProductos.get(numeroAleatorio).getText();
		listaBotonesProductos.get(numeroAleatorio).click();		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Performable on() { //metodo recursivo 
		return Instrumented.instanceOf(ClicProductoAleatorio.class).withProperties();
	}

}
