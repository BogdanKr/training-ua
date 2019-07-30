package com.courses.task_oop_option24.controller;

import com.courses.task_oop_option24.model.DBLetter;
import com.courses.task_oop_option24.model.PostBox;
import com.courses.task_oop_option24.view.View;

import java.util.Scanner;

import static com.courses.task_oop_option24.view.TextConstant.*;

public class FindMenu {
    private PostBox model;
    private View view;
    private Scanner scanner;

    public FindMenu(PostBox model, View view, Scanner scanner) {
        this.model = model;
        this.view = view;
        this.scanner = scanner;
    }

    public void find() {
        view.printMessage(CHOOSE_OPTION);
        view.printMenu(FIND_TITLE, FIND_SENDER, FIND_RECIPIENT);
        int menuOption = Controller.chooseStartMenu(scanner, 3);
        switch (menuOption) {
            case 1: {
                findTitle();
                break;
            }
            case 2: {
                findSender();
                break;
            }
            case 3: {
                findRecipient();
                break;
            }
        }
    }

    private void findTitle() {
        view.printMessage(FIND_TITLE);
        String findTitle = scanner.next();
        for (DBLetter letter : model.getLetters()) {
            if (letter.gettitle().trim().equalsIgnoreCase(findTitle)) view.printOneLetter(letter);
        }
    }

    private void findSender() {
        view.printMessage(FIND_SENDER);
        String findSender = scanner.next();
        for (DBLetter letter : model.getLetters()) {
            if (letter.getSender().trim().equalsIgnoreCase(findSender)) view.printOneLetter(letter);
        }
    }

    private void findRecipient() {
        view.printMessage(FIND_RECIPIENT);
        String findRecipient = scanner.next();
        for (DBLetter letter : model.getLetters()) {
            if (letter.getRecipient().trim().equalsIgnoreCase(findRecipient)) view.printOneLetter(letter);
        }
    }
}
