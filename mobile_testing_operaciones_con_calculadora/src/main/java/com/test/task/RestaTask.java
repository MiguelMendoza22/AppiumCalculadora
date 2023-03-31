package com.test.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.test.ui.CalculatorOverview.*;

public class RestaTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_4),
                Click.on(BTN_0),
                Click.on(SUBTRACT),
                Click.on(BTN_2),
                Click.on(BTN_0),
                Click.on(SUBTRACT),
                Click.on(BTN_5)
        );
    }
    public static RestaTask operacionRestar() {
        return new RestaTask();
    }
}
