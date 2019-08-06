package com.courses.task_oop_option24.view;

import com.courses.task_oop_option24.model.entity.Letter;

import java.util.Arrays;
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
//        Arrays.stream(option)
//                .count()
//                .forEach()
        for (int i = 1; i <= option.length; i++) {
            System.out.println(i + " " + bundle.getString(option[i-1]));
        }
    }

    public void printLetters(List<Letter> letterLis){
            letterLis.forEach(System.out::println);

    }

    public void printOneLetter(Letter letter){
        System.out.println(letter);
    }

}
