package com.courses.task3.controller;

import com.courses.task3.view.View;

import java.util.Scanner;

public class RegexController {
    private Scanner scanner;
    private View view;

    public RegexController(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    String inputValueWithRegexController(String message, String regex) {
        String value;
        view.printConcatMessage(message);
        while (!(scanner.hasNext() &&
                (value = scanner.next()).matches(regex))) {
            view.printWrongInput(message);
        }
        return value;
    }
}
