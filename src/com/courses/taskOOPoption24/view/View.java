package com.courses.taskOOPoption24.view;

import com.courses.taskOOPoption24.model.Letter;

import java.util.Locale;
import java.util.ResourceBundle;

public class View {

    public final static ResourceBundle bundle =
            ResourceBundle.getBundle("com.courses.taskOOPoption24.properties", new Locale("ru"));

    public void printMessage(String message) {
        System.out.println(bundle.getString(message));
    }

    public void printMenu(String... option) {
        System.out.println();
        for (int i = 1; i <= option.length; i++) {
            System.out.println(i + " " + bundle.getString(option[i-1]));
        }
        System.out.println();
    }

    public void printLetters(Letter[] letters){
        for (Letter lt : letters){
            System.out.println(lt);
        }
        System.out.println();
    }

    public void printOneLetter(Letter letter){
        System.out.println(letter);
    }

}
