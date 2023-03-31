package com.test.stepdefinition;

import com.test.question.TheResult;
import com.test.setup.SetUp;
import com.test.task.MultiplyTask;
import com.test.task.PlusTask;
import com.test.task.DivideTask;
import com.test.task.SubtractTask;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Before;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class CalcularSD extends SetUp {


    @Before
    public void before(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("Ingresamos a la calculadora")
    public void ingresamosALaCalculadora() {
        actor.can(BrowseTheWeb.with(theMobileDevice));
    }

    @When("Agregamos los {int}+{int}")
    public void agregamosLosDatosParaSumar(int int1, int int2) {
        actor.attemptsTo(
                PlusTask.plusOperation()
        );
    }

    @When("Agregamos los {int}\\/{int}")
    public void agregamosLosDatosParaDividir(int int1, int int2) {
        actor.attemptsTo(
                DivideTask.divideOperation()
        );
    }

    @When("Agregamos los {int}*{int}")
    public void agregamosLosDatosParaMultiplicar(int int1, int int2) {
        actor.attemptsTo(
                MultiplyTask.multiplyOperation()
        );
    }

    @When("Agregamos los {int}-{int}")
    public void agregamosLosDatosParaRestar(int int1, int int2) {
        actor.attemptsTo(
                SubtractTask.subtractOperation()
        );
    }

    @Then("Obtenemos el {int}")
    public void obtenemosEl(int result) {
        actor.should(
                seeThat(TheResult.isEqualTo(), containsString(String.valueOf(result)))
        );
    }
}
