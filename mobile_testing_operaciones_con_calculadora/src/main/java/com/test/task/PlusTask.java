package com.test.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.test.ui.CalculatorOverview.BTN_5;
import static com.test.ui.CalculatorOverview.PLUS;

public class PlusTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(BTN_5),
                Click.on(PLUS),
                Click.on(BTN_5)

        );
    }

    public static PlusTask plusOperation() {return new PlusTask();}

}
