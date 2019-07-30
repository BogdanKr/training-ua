package com.courses.task_oop_option24.view;

import com.courses.task_oop_option24.model.DBLetter;

import java.util.Locale;
import java.util.ResourceBundle;

public class View {

    public final static ResourceBundle bundle =
            ResourceBundle.getBundle("properties", new Locale("en"));

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

    public void printLetters(DBLetter[] letters){
        for (DBLetter lt : letters){
            System.out.println(lt);
        }
        System.out.println();
    }

    public void printOneLetter(DBLetter letter){
        System.out.println(letter);
    }

}
