package com.courses.task3.controller;

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
        InputNoteBook inputNoteBook = new InputNoteBook(scanner, view, noteBook);
        inputNoteBook.inputNote();
    }
}
