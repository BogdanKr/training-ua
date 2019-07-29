package com.courses.taskOOPoption24.controller;

import com.courses.taskOOPoption24.model.Letter;
import com.courses.taskOOPoption24.model.Model;
import com.courses.taskOOPoption24.view.View;

import java.util.Scanner;

import static com.courses.taskOOPoption24.view.TextConstant.*;

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
        view.printMessage(CHOOSE_OPTION);
        view.printMenu(FIND_TITLE,FIND_SENDER,FIND_RECIPIENT);
        int menuOption = Controller.chooseStartMenu(scanner, 3);
        if (menuOption == 1) {
            findTitle();
        }
        if (menuOption == 2) {
            findSender();
        }
        if (menuOption == 3) {
            findRecipient();
        }
    }

    private void findTitle(){
        view.printMessage(FIND_TITLE);
        String findTitle = scanner.next();
        for (Letter letter : model.getLetters()){
            if (letter.gettitle().trim().equalsIgnoreCase(findTitle)) view.printOneLetter(letter);
        }
    }

    private void findSender(){
        view.printMessage(FIND_SENDER);
        String findSender = scanner.next();
        for (Letter letter : model.getLetters()){
            if (letter.getSender().trim().equalsIgnoreCase(findSender)) view.printOneLetter(letter);
        }
    }

    private void findRecipient(){
        view.printMessage(FIND_RECIPIENT);
        String findRecipient = scanner.next();
        for (Letter letter : model.getLetters()){
            if (letter.getRecipient().trim().equalsIgnoreCase(findRecipient)) view.printOneLetter(letter);
        }
    }
}
