package co.com.bancolombia.certification.pruebasbanistmo.tasks;

import co.com.bancolombia.certification.pruebasbanistmo.models.SearchPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.bancolombia.certification.pruebasbanistmo.userinterfaces.Components.*;

public class Search implements Task{
	
	private SearchPage searchPage ;
    String page;
    
    public Search(String page) {
    	this.page=page;
    }

	@Override
	
	public <T extends Actor> void performAs(T actor) {

		searchPage =new SearchPage(page);
		
		actor.attemptsTo(Click.on(PRODUCTS_SERVICES),(Click.on(CARD_CREDIT)));
	}

	public static Search the(String page) {
	
		return Tasks.instrumented(Search.class, page);
	}

}



