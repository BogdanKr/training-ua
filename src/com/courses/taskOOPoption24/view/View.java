package com.courses.taskOOPoption24.view;

import java.util.Locale;
import java.util.ResourceBundle;

public class View {

    public final static ResourceBundle bundle =
            ResourceBundle.getBundle("com.courses.taskOOPoption24.properties", new Locale("ru"));

    public void printMessage(String message){
        System.out.println(bundle.getString(message));
    }
}
