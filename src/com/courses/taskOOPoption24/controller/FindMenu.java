package com.courses.taskOOPoption24.controller;

import com.courses.taskOOPoption24.model.Letter;
import com.courses.taskOOPoption24.model.Model;
import com.courses.taskOOPoption24.view.View;

import java.util.Scanner;

import static com.courses.taskOOPoption24.view.TextConstant.FIND_TITLE;

public class FindMenu {
    private Model model;
    private View view;
    private Scanner scanner;

    public FindMenu(Model model, View view, Scanner scanner) {
        this.model = model;
        this.view = view;
        this.scanner = scanner;
    }

    public void find(){
        view.printMessage(FIND_TITLE);
        String findTitle = scanner.next();
        for (Letter letter : model.getLetters()){
            if (letter.gettitle().trim().equalsIgnoreCase(findTitle)) view.printOneLetter(letter);
        }
    }
}
