package com.courses.task3.controller;

import com.courses.task3.model.Model;
import com.courses.task3.view.View;

import java.util.Scanner;

import static com.courses.task3.controller.RegexContainer.*;
import static com.courses.task3.view.TextConstant.FIRST_NAME;
import static com.courses.task3.view.TextConstant.LOGIN_DATA;

public class InputNoteBook {
    private Scanner scanner;
    private View view;

    private String firstName;
    private String login;

    public InputNoteBook(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    public void inputNote() {
        RegexController regexController = new RegexController(scanner, view);
        String regexName =
                (String.valueOf(View.bundle.getLocale()).equals("ua"))
                        ? REGEX_NAME_UA : REGEX_NAME_LAT;

        this.firstName = regexController.inputValueWithRegexController(FIRST_NAME, regexName);
        this.login = regexController.inputValueWithRegexController(LOGIN_DATA, REGEX_LOGIN);

    }

}
