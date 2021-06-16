package interacciones;


import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;


public class DespliegueMenu implements Interaction {
	
	private Target target;
	
	public DespliegueMenu(Target target) {
		super();
		this.target = target;
	}


	@Override
	public <T extends Actor> void performAs(T actor) {
		
			as(actor).moveToElement(target.resolveFor(actor)).build().perform();//mouse posicione encima sin dar click		
				
	}
	
	public static DespliegueMenu on(Target target) {
		
		return Tasks.instrumented(DespliegueMenu.class,target);//estamos haciendo uso del quinto principio solido que es 
	
	}
	
	private Actions as(Actor actor) {
		
		return new Actions(BrowseTheWeb.as(actor).getDriver());//metodo para utilizar el navegador
	}
		
	}

	


