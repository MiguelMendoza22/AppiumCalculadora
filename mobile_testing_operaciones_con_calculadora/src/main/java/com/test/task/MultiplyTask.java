package com.test.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.test.ui.CalculatorOverview.*;

public class MultiplyTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(BTN_2),
                Click.on(MULTIPLY),
                Click.on(BTN_4)

        );
    }

    public static MultiplyTask multiplyOperation() {return new MultiplyTask();}
}
