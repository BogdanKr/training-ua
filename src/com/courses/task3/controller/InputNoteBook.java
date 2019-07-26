package com.courses.task3.controller;

import com.courses.task3.model.Model;
import com.courses.task3.view.View;

import java.util.Scanner;

import static com.courses.task3.controller.RegexContainer.*;
import static com.courses.task3.view.TextConstant.*;

public class InputNoteBook {
    private Scanner scanner;
    private View view;

    private String firstName;
    private String lastName;
    private String middleName;
    private String concatName;
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

        String regexLastName =
                (String.valueOf(View.bundle.getLocale()).equals("ua"))
                        ? REGEX_LAST_NAME_UA : REGEX_LAST_NAME_LAT;

        String regexMiddleName =
                (String.valueOf(View.bundle.getLocale()).equals("ua"))
                        ? REGEX_MIDDLE_NAME_UA : REGEX_MIDDLE_NAME_LAT;

        this.firstName = regexController.inputValueWithRegexController(FIRST_NAME, regexName);
        this.lastName = regexController.inputValueWithRegexController(LAST_NAME, regexLastName);
        setConcatName();
        view.printMessage(concatName);
        this.middleName = regexController.inputValueWithRegexController(MIDDLE_NAME, regexMiddleName);
        this.login = regexController.inputValueWithRegexController(LOGIN_DATA, REGEX_LOGIN);

    }

    void setConcatName(){
        this.concatName=lastName+" "+firstName.substring(0,1)+".";
    }

}
