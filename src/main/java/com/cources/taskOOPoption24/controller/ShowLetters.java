package com.cources.taskOOPoption24.controller;

import com.cources.taskOOPoption24.model.Category;
import com.cources.taskOOPoption24.model.Letter;
import com.cources.taskOOPoption24.model.PostBox;
import com.cources.taskOOPoption24.view.View;

import java.util.Scanner;

import static com.cources.taskOOPoption24.view.TextConstant.*;

public class ShowLetters {
    private PostBox model;
    private View view;
    private Scanner scanner;

    public ShowLetters(PostBox model, View view, Scanner scanner) {
        this.model = model;
        this.view = view;
        this.scanner = scanner;
    }

    void showMenu() {
        view.printMessage(CHOOSE_OPTION);
        view.printMenu(LOOK_LETTER, LOOK_INCOME, LOOK_SEND, LOOK_SPAM, LOOK_DELETE);
        int menuOption = Controller.chooseStartMenu(scanner, 5);
        if (menuOption == 1) {
            view.printLetters(model.getLetters());
        }
        if (menuOption == 2) {
            showIncome();
        }
        if (menuOption == 3) {
            showSent();
        }
        if (menuOption == 4) {
            showSpam();
        }

        if (menuOption == 5) {
            showDelete();
        }
    }

    private void showIncome() {
        for (Letter letter : model.getLetters()) {
            if (letter.getCategory()== Category.INCOME) view.printOneLetter(letter);
        }
    }

    private void showSent() {
        for (Letter letter : model.getLetters()) {
            if (letter.getCategory()== Category.SEND) view.printOneLetter(letter);
        }
    }

    private void showSpam() {
        for (Letter letter : model.getLetters()) {
            if (letter.getCategory()== Category.SPAM) view.printOneLetter(letter);
        }
    }

    private void showDelete() {
        for (Letter letter : model.getLetters()) {
            if (letter.getCategory()== Category.DELETED) view.printOneLetter(letter);
        }
    }
}
