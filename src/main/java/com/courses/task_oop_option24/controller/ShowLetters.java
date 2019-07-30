package com.courses.task_oop_option24.controller;

import com.courses.task_oop_option24.model.Category;
import com.courses.task_oop_option24.model.DBLetter;
import com.courses.task_oop_option24.model.PostBox;
import com.courses.task_oop_option24.view.View;

import java.util.Scanner;

import static com.courses.task_oop_option24.view.TextConstant.*;

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
        switch (menuOption) {
            case 1: {
                view.printLetters(model.getLetters());
                break;
            }
            case 2: {
                showIncome();
                break;
            }
            case 3: {
                showSent();
                break;
            }
            case 4: {
                showSpam();
                break;
            }

            case 5: {
                showDelete();
                break;
            }
        }
    }

    private void showIncome() {
        for (DBLetter letter : model.getLetters()) {
            if (letter.getCategory() == Category.INCOME) view.printOneLetter(letter);
        }
    }

    private void showSent() {
        for (DBLetter letter : model.getLetters()) {
            if (letter.getCategory() == Category.SEND) view.printOneLetter(letter);
        }
    }

    private void showSpam() {
        for (DBLetter letter : model.getLetters()) {
            if (letter.getCategory() == Category.SPAM) view.printOneLetter(letter);
        }
    }

    private void showDelete() {
        for (DBLetter letter : model.getLetters()) {
            if (letter.getCategory() == Category.DELETED) view.printOneLetter(letter);
        }
    }
}
