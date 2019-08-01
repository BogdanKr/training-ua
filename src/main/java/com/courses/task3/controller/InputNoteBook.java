package com.courses.task3.controller;

import com.courses.task3.view.View;

import java.util.Scanner;

import static com.courses.task3.controller.RegexContainer.*;
import static com.courses.task3.view.TextConstant.*;

public class InputNoteBook {
    private Scanner scanner;
    private View view;
    private UtilityController utilityController;

    private String firstName;
    private String lastName;
    private String middleName;
    private String concatName;
    private String login;

    public InputNoteBook(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    void inputNote() {
        utilityController = new UtilityController(scanner, view);
        String regexName =
                (String.valueOf(View.bundle.getLocale()).equals("ua"))
                        ? REGEX_NAME_UA : REGEX_NAME_LAT;

        String regexLastName =
                (String.valueOf(View.bundle.getLocale()).equals("ua"))
                        ? REGEX_LAST_NAME_UA : REGEX_LAST_NAME_LAT;

        String regexMiddleName =
                (String.valueOf(View.bundle.getLocale()).equals("ua"))
                        ? REGEX_MIDDLE_NAME_UA : REGEX_MIDDLE_NAME_LAT;

        this.firstName = utilityController.inputValueWithUtilityController(FIRST_NAME, regexName);
        this.lastName = utilityController.inputValueWithUtilityController(LAST_NAME, regexLastName);
        setConcatName();
        view.printMessage(concatName);
        this.middleName = utilityController.inputValueWithUtilityController(MIDDLE_NAME, regexMiddleName);
        inputLogin();

    }

    private void setConcatName() {
        this.concatName = lastName + " " + firstName.substring(0, 1) + ".";
    }

    public void inputLogin() {
        this.login = utilityController.inputValueWithUtilityController(LOGIN_DATA, REGEX_LOGIN);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getConcatName() {
        return concatName;
    }

    public String getLogin() {
        return login;
    }
}
