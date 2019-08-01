package com.courses.task3.controller;

import com.courses.task3.model.CreateNote;
import com.courses.task3.model.NotUnickNoteExc;
import com.courses.task3.model.NoteBook;
import com.courses.task3.view.View;

import java.util.Scanner;

public class Controller {
    private NoteBook noteBook;
    private View view;

    public Controller(NoteBook noteBook, View view) {
        this.noteBook = noteBook;
        this.view = view;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        view.printNoteBook(noteBook.getDataBaseNote());
        InputNoteBook inputNoteBook = new InputNoteBook(scanner, view);
        inputNoteBook.inputNote();

        CreateNote createNote = null;

        while (true) {
            try {
                createNote = new CreateNote(inputNoteBook.getFirstName(), inputNoteBook.getLastName(),
                        inputNoteBook.getMiddleName(), inputNoteBook.getLogin());
                break;
            } catch (NotUnickNoteExc notUnickNoteExc) {
                view.printWrongInput(notUnickNoteExc.getMessage());
                inputNoteBook.inputLogin();
            }
        }
        noteBook.getDataBaseNote().add(createNote);
        view.printNoteBook(noteBook.getDataBaseNote());
    }
}
