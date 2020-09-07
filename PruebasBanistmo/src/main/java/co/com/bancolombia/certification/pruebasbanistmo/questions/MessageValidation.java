package co.com.bancolombia.certification.pruebasbanistmo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.bancolombia.certification.pruebasbanistmo.userinterfaces.Components.VALIDATION;

public class MessageValidation implements Question<String>{
 
	private Target target;
	
	public MessageValidation(Target target) {
			this.target = target;
	
		}
	public static MessageValidation of(Target target) {
		return new MessageValidation(target);
	}
	@Override
	public String answeredBy(Actor actor) {
		
		
		return Text.of(VALIDATION).viewedBy(actor).asString();
	}

}
