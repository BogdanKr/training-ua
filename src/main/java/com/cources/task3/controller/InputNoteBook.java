package com.cources.task3.controller;

import com.cources.task3.model.Model;
import com.cources.task3.view.View;

import java.util.Scanner;

import static com.cources.task3.controller.RegexContainer.*;
import static com.cources.task3.view.TextConstant.*;

public class InputNoteBook {
    private Scanner scanner;
    private View view;
    private Model model;

    private String firstName;
    private String lastName;
    private String middleName;
    private String concatName;
    private String login;

    public InputNoteBook(Scanner scanner, View view, Model model) {
        this.scanner = scanner;
        this.view = view;
        this.model = model;
    }

    public void inputNote() {
        UtilityController utilityController = new UtilityController(scanner, view);
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
        this.login = utilityController.inputLogin();

        //model.getDataBaseNote().add(new NoteBook(firstName, lastName, middleName, login));

    }

    void setConcatName() {
        this.concatName = lastName + " " + firstName.substring(0, 1) + ".";
    }

}
