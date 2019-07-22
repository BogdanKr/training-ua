package com.courses.task3.view;

import java.util.Locale;
import java.util.ResourceBundle;

import static com.courses.task3.view.TextConstant.INPUT_STRING_DATA;
import static com.courses.task3.view.TextConstant.WRONG_INPUT;

public class View {
    static String MESSAGE_BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(MESSAGE_BUNDLE_NAME,
                    //new Locale("en"));
                    new Locale("ua", "UA"));

    public void printMessage (String message){
        System.out.println(message);
    }

    public String concatenatioMessage (String... message){
        StringBuilder concat = new StringBuilder();
        for (String msg : message){
            concat = concat.append(msg);
        }
        return new String(concat);
    }

    public void printStringMessage (String message){
        printMessage( concatenatioMessage(
                bundle.getString(INPUT_STRING_DATA),
                bundle.getString(message)
        ));
    }

    public void printWrongInput (String message){
        printMessage( concatenatioMessage(
                bundle.getString(WRONG_INPUT),
                bundle.getString(INPUT_STRING_DATA),
                bundle.getString(message)
        ));
    }
}
