package co.com.bancolombia.certification.pruebasbanistmo.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.junit.runner.RunWith;

public class PruebasBanistmo {

    @RunWith(CustomCucumberRunner.class)
    @CucumberOptions(
            features = "src/test/resources/features",
            glue = {"co.com.bancolombia.certification.pruebasbanistmo.stepdefinitions"},
            tags = "@feature",
            snippets = SnippetType.CAMELCASE)

    public class Search {

    }
}
