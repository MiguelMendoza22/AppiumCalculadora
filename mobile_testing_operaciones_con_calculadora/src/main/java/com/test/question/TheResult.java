package com.test.question;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.serenitybdd.screenplay.targets.Target;

import static io.appium.java_client.AppiumBy.id;


public class TheResult {

    public static final Target RESULT = Target
            .the("Result")
            .located(id("com.android2.calculator3:id/result"));

    public static Question<String> isEqualTo(){
        return TheTarget.textOf(RESULT);
    }

    private TheResult() {
    }

}
