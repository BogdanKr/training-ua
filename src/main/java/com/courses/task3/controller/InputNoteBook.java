package com.courses.task3.controller;


import com.courses.task3.model.CreateNote;
import com.courses.task3.model.NotUnickNoteExc;
import com.courses.task3.model.Note;
import com.courses.task3.model.NoteBook;
import com.courses.task3.view.View;

import java.util.Scanner;

import static com.courses.task3.controller.RegexContainer.*;
import static com.courses.task3.view.TextConstant.*;

public class InputNoteBook {
    private Scanner scanner;
    private View view;
    private NoteBook noteBook;

    private String firstName;
    private String lastName;
    private String middleName;
    private String concatName;
    private String login;

    public InputNoteBook(Scanner scanner, View view, NoteBook noteBook) {
        this.scanner = scanner;
        this.view = view;
        this.noteBook = noteBook;
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
        CreateNote createNote = null;
        while (true) {
            try {
                this.login = utilityController.inputLogin();
                createNote = new CreateNote(firstName, lastName, middleName, login);
                break;
            } catch (NotUnickNoteExc notUnickNoteExc) {
                view.printWrongInput(notUnickNoteExc.getMessage());
            }
        }
        noteBook.getDataBaseNote().add(createNote);
        view.printNoteBook(noteBook.getDataBaseNote());
    }

    void setConcatName() {
        this.concatName = lastName + " " + firstName.substring(0, 1) + ".";
    }

}
