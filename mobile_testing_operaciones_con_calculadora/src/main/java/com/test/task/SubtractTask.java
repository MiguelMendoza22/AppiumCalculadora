package com.test.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.test.ui.CalculatorOverview.*;

public class SubtractTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(BTN_5),
                Click.on(SUBTRACT),
                Click.on(BTN_2)

        );
    }

    public static SubtractTask subtractOperation() {return new SubtractTask();}

}
