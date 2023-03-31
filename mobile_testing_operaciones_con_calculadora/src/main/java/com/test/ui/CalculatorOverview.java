package com.test.ui;

import net.serenitybdd.screenplay.targets.Target;

import static io.appium.java_client.AppiumBy.id;
import static org.openqa.selenium.By.xpath;

public class CalculatorOverview {

    public static final Target BTN_5 = Target
            .the("5")
            .located(id("com.android2.calculator3:id/digit_5"));

    public static final Target BTN_6 = Target
            .the("6")
            .located(id("com.android2.calculator3:id/digit_6"));

    public static final Target BTN_3 = Target
            .the("3")
            .located(id("com.android2.calculator3:id/digit_3"));

    public static final Target BTN_4 = Target
            .the("4")
            .located(id("com.android2.calculator3:id/digit_4"));

    public static final Target BTN_2 = Target
            .the("2")
            .located(id("com.android2.calculator3:id/digit_2"));

    public static final Target BTN_1 = Target
            .the("1")
            .located(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
                    "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android." +
                    "widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.Button[7]"));

    public static final Target BTN_0 = Target
            .the("0")
            .located(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
                    "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android." +
                    "widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.Button[11]"));

    public static final Target PLUS = Target
            .the("plus")
            .located(id("com.android2.calculator3:id/op_add"));

    public static final Target DIV = Target
            .the("divide")
            .located(id("com.android2.calculator3:id/op_div"));

    public static final Target MULTIPLY = Target
            .the("multiply")
            .located(id("com.android2.calculator3:id/op_mul"));

    public static final Target SUBTRACT = Target
            .the("subtract")
            .located(id("com.android2.calculator3:id/op_sub"));

    private CalculatorOverview() {
    }
}

