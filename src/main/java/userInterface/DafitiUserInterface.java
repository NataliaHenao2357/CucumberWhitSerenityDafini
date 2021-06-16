package userInterface;


import net.serenitybdd.screenplay.targets.Target;

public class DafitiUserInterface {
	
	 public static final Target TXT_BUSCADOR_DAFITI = Target.the("El campo de busqueda").locatedBy("//input[@id='searchInput']");
	 public static final Target BTN_BUSCADOR_DAFITI = Target.the("La lupa donde se le da click").locatedBy("//button[@class='icon-magnifier searchButton sel-search-button']");
	 public static final Target LBL_RESULTADO_DAFITI = Target.the("Valida resultado de la busqueda").locatedBy("//h3[contains(text(),'{0}')]");
	 public static final Target BTN_BUSCADOR_PTO = Target.the("La imagen que aparece tras la busqueda").locatedBy("//p[contains(text(),'{0}')]");
	 public static final Target LBL_RESULTADO_PTO = Target.the("Muestra el nombre del producto para validacion").locatedBy("//h3[contains(text(),'{0}')]");
	 public static final Target BTN_CATEGORIA_DAFITI = Target.the("Se para sobre la categoria").locatedBy("//child::li/a[contains(text(),'Belleza y Cuidado')]");
	 public static final Target BTN_SUBCATEGORIA_DAFITI = Target.the("da click en la categoria escogida").locatedBy("//a[contains(text(),'Cejas')]");
	 public static final Target BTN_PRODUCTO_ALEATORIO_DAFITI = Target.the("da click sobre cualquier producto").locatedBy("//div[@class='itm-product-main-info']");
	 public static final Target LBL_PRODUCTO_ALEATORIO_DAFITI = Target.the("").locatedBy("//h3[@class='prd-title']");
	 
}
