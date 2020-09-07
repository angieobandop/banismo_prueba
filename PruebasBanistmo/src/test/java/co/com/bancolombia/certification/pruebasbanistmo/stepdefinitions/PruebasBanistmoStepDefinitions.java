package co.com.bancolombia.certification.pruebasbanistmo.stepdefinitions;
import static co.com.bancolombia.certification.pruebasbanistmo.userinterfaces.Components.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

import co.com.bancolombia.certification.pruebasbanistmo.questions.MessageValidation;
import co.com.bancolombia.certification.pruebasbanistmo.userinterfaces.Components;

import co.com.bancolombia.certification.pruebasbanistmo.tasks.OpenTheBrowser;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.fluentlenium.core.search.Search;
import org.junit.Before;

public interface PruebasBanistmoStepDefinitions<angie> {

    private Components Components ;

    @Before
    public static void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }


@Given("^(.*) enter to banistmo page$")
        public void somethingEnterToBanistmoPage(String actor) {
        theActorCalled(name).wasAbleTo(OpenTheBrowser.on(Components));
        }

@When("^ she enter the option card credit and be able to see the contract pdf$")
public void she_enterTheOptionCardCreditAndBeAbleToSeeTheContractPdf()  {
public void sheEnterThePageBanismo()  {
        theActorInTheSpotlight().attemptsTo(Search.the(page));
        }

        }

@Then("^validate that the pdf be successful$")
public void validateThatThePdfBeSuccessful() {
        theActorInTheSpotlight().should(seeThat(MessageValidation.of(VALIDATION),equalTo("exitoso")));

        }

@When("^ she enter the option galeria inmobiliaria and be able to request credit and fill out form$")
public void sheEnterTheOptioGaleriaInmobiliariaAndBeAbleToRequestCreditAndFillOutForm()  {
public void sheEnterThePageBanismo()  {
        theActorInTheSpotlight().attemptsTo();
        }

        }

@Then("^validate that the form be send$")
public void validateThatTheFormBeSend() {
        theActorInTheSpotlight().should(seeThat(MessageValidation.of(VALIDATION),equalTo("exitoso")));


}
}

