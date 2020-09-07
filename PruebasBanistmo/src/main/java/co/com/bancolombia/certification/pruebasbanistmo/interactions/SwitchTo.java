package co.com.bancolombia.certification.pruebasbanistmo.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class SwitchTo implements Interaction {

    private WebDriver browser;
    private int tab;

	public SwitchTo(WebDriver browser , int tab) {
		this.browser = browser;
		this.tab = tab;

}
	@Override
	public <T extends Actor> void performAs(T Actor) {
		
		ArrayList<String> tabs = new ArrayList<String>(browser.getWindowHandles());
		browser.switchTo().window(tabs.get(tab)); 
	}
	
	public static SwitchTo Windows(WebDriver browser, int tab) {
	
		return Tasks.instrumented(SwitchTo.class, browser, tab);
	}
}
