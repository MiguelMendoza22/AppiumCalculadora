package com.test.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.test.ui.CalculatorOverview.*;

public class DivisionTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_6),
                Click.on(BTN_0),
                Click.on(DIV),
                Click.on(BTN_2),
                Click.on(DIV),
                Click.on(BTN_2)
        );
    }
    public static DivisionTask operacionDivision(){
        return new DivisionTask();
    }
}
