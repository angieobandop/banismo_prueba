package co.com.bancolombia.certification.pruebasbanistmo.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.banistmo.com/wps/portal/banistmo/personas/")
public class Components extends PageObject{
	
	public static final Target PRODUCTS_SERVICES = Target.the("productos y servicios").located(By.xpath("//a[@class='btn-group toggle-submenu over'"));
	public static final Target CARD_CREDIT = Target.the("tarjeta de credito").located(By.xpath("[@id='productosYserviciosPersonas']/div/div[1]/div[1]/div/div[5]/div/a']"));
	public static final Target VALIDATION = Target.the("validacion").located(By.xpath("//a[@class='btn btn-primary']"));

}
