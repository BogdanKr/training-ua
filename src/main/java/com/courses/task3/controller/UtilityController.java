package com.courses.task3.controller;

import com.courses.task3.view.View;

import java.util.Scanner;

public class UtilityController {
    private Scanner scanner;
    private View view;

    public UtilityController(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    String inputValueWithUtilityController(String message, String regex) {
        String value;
        view.printConcatMessage(message);
        while (!(scanner.hasNext() &&
                (value = scanner.next()).matches(regex))) {
            view.printWrongInput(message);
        }
        return value;
    }
}
