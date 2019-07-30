package com.courses.task_oop_option24.view;

import com.courses.task_oop_option24.model.Letter;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class View {

    public final static ResourceBundle bundle =
            ResourceBundle.getBundle("properties", new Locale("en"));

    public void printMessage(String message) {
        System.out.println(bundle.getString(message));
    }

    public void printMenu(String... option) {
        for (int i = 1; i <= option.length; i++) {
            System.out.println(i + " " + bundle.getString(option[i-1]));
        }
    }

    public void printLetters(List<Letter> letterLis){
        for (Letter lt : letterLis){
            System.out.println(lt);
        }
    }

    public void printOneLetter(Letter letter){
        System.out.println(letter);
    }

}
