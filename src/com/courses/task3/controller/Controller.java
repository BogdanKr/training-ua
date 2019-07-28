package com.courses.task3.controller;

import com.courses.task3.model.Model;
import com.courses.task3.view.View;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        InputNoteBook inputNoteBook = new InputNoteBook(scanner, view);
        inputNoteBook.inputNote();
    }
}