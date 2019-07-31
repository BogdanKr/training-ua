package com.courses.task3.controller;

import com.courses.task3.model.DBNote;
import com.courses.task3.model.NotUnickNoteExc;
import com.courses.task3.view.View;

import java.util.Scanner;

import static com.courses.task3.controller.RegexContainer.REGEX_LOGIN;
import static com.courses.task3.view.TextConstant.LOGIN_DATA;
import static com.courses.task3.view.TextConstant.NOT_UNICK_LOGIN;

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

    String inputLogin() {
        String login = inputValueWithUtilityController(LOGIN_DATA, REGEX_LOGIN);
        return login;
    }

    private boolean checkLogin(String login)  {
        try {
            for (DBNote note : DBNote.values()){
                if (login.equals(note.getLogin())) {
                    throw new NotUnickNoteExc(NOT_UNICK_LOGIN);
                }
            }
        } catch (NotUnickNoteExc notUnickNoteExc) {
            System.out.println(notUnickNoteExc.getMessage());
            return true;
        }
        return false;
    }
}
