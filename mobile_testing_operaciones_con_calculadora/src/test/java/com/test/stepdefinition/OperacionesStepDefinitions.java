package com.test.stepdefinition;

import com.test.question.TheResult;
import com.test.setup.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.apache.log4j.Logger;
import org.assertj.core.api.Assertions;
import org.junit.Before;

import static com.test.task.DivisionTask.operacionDivision;
import static com.test.task.MultiplicacionTask.operacionMultiplicar;
import static com.test.task.RestaTask.operacionRestar;
import static com.test.task.SumaTask.operacionSumar;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class OperacionesStepDefinitions extends SetUp {
    public static Logger LOGGER = Logger.getLogger(OperacionesStepDefinitions.class);

    @Before
    public void before(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("que el usuario ingreso a la calculadora")
    public void queElUsuarioIngresoALaCalculadora() {
        try {
            LOGGER.info("INICIA LA AUTOMATIZACION");
            actor.can(BrowseTheWeb.with(theMobileDevice));

        }catch (Exception exception){
            LOGGER.info(" fallo la configuracion inicial");
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.warn(exception.getMessage(), exception);

        }
    }

    @When("el unsuario realiza la operacion\"suma\" de los numeros {int}, {int} y {int}")
    public void elUnsuarioRealizaLaOperacionSumaDeLosNumerosY(Integer int1, Integer int2, Integer int3) {
        try {
            actor.attemptsTo(
                    operacionSumar()
            );

        }catch (Exception exception){
            LOGGER.info(" fallo en la operación de suma");
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.warn(exception.getMessage(), exception);

        }
    }
    @When("el unsuario realiza la operacion\"Resta\" de los numeros {int}, {int} y {int}")
    public void elUnsuarioRealizaLaOperacionRestaDeLosNumerosY(Integer int1, Integer int2, Integer int3) {
        try {
            actor.attemptsTo(
                    operacionRestar()
            );

        }catch (Exception exception){
            LOGGER.info(" fallo en la operación de resta");
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.warn(exception.getMessage(), exception);

        }
    }

    @When("el unsuario realiza la operacion\"multiplicacion\" de los numeros {int}, {int} y {int}")
    public void elUnsuarioRealizaLaOperacionMultiplicacionDeLosNumerosY(Integer int1, Integer int2, Integer int3) {
        try {
            actor.attemptsTo(
                    operacionMultiplicar()
            );

        }catch (Exception exception){
            LOGGER.info(" fallo en la operación de multiplicación");
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.warn(exception.getMessage(), exception);

        }

    }
    @When("el unsuario realiza la operacion\"division\" de los numeros {int}, {int} y {int}")
    public void elUnsuarioRealizaLaOperacionDivisionDeLosNumerosY(Integer int1, Integer int2, Integer int3) {
        try {
            actor.attemptsTo(
                    operacionDivision()
            );

        }catch (Exception exception){
            LOGGER.info(" fallo en la operación de división");
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.warn(exception.getMessage(), exception);

        }
    }

    @Then("el usuario debera ver el {int}")
    public void elUsuarioDeberaVerEl(Integer resultado) {
        try {
            actor.should(
                    seeThat(TheResult.isEqualTo(), containsString(String.valueOf(resultado)))
            );
            LOGGER.info("CUMPLE");
        }catch (Exception exception){
            LOGGER.info("Error al realizar la comparacion");
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.warn(exception.getMessage(), exception);

        }
    }

}
