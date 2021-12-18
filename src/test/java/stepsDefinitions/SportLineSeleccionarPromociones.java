package stepsDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import drivers.GoogleChromeDriver;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import tasks.SeleccionarPromociones;
import uip.SportLinePromociones;

public class SportLineSeleccionarPromociones {

    @Given("^Dado que me encuentro en la pagina$")
    public void dadoQueMeEncuentroEnLaPagina() {
        OnStage.theActorCalled("Cliente").can(BrowseTheWeb.with(GoogleChromeDriver.chromeHisBrowserWeb().on("https://sportline.com.co/")));
    }

    @When("^seleccione la seccion promociones de la pagina SportLine$")
    public void seleccioneLaSeccionPromocionesDeLaPaginaSportLine() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarPromociones.enSportLine());

    }

    @Then("^vemos los productos en promocion$")
    public void vemosLosProductosEnPromocion() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(SportLinePromociones.TXT_PROMOCION), WebElementStateMatchers.containsText("% menos en carrito".replace("  "," "))));

    }

    @When("^selecciono uno de los productos aleatorios que aparece$")
    public void seleccionoUnoDeLosProductosAleatoriosQueAparece() {

    }

    @Then("^visualizo las caracteristicas del producto seleccionado$")
    public void visualizoLasCaracteristicasDelProductoSeleccionado() {
    }


}
