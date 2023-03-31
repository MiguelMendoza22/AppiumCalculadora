package com.test.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.test.ui.CalculatorOverview.*;

public class DivideTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(BTN_6),
                Click.on(DIV),
                Click.on(BTN_3)

        );
    }

    public static DivideTask divideOperation() {return new DivideTask();}
}
