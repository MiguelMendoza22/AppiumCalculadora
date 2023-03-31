package com.test.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.checkerframework.checker.units.qual.C;

import static com.test.ui.CalculatorOverview.*;

public class MultiplicacionTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_3),
                Click.on(MULTIPLY),
                Click.on(BTN_5),
                Click.on(MULTIPLY),
                Click.on(BTN_1)
        );
    }
    public static MultiplicacionTask operacionMultiplicar(){
        return new MultiplicacionTask();
    }
}
