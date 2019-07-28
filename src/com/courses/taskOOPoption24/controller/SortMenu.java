package com.courses.taskOOPoption24.controller;

import com.courses.taskOOPoption24.model.Letter;
import com.courses.taskOOPoption24.model.Model;
import com.courses.taskOOPoption24.view.View;

import java.util.Date;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import static com.courses.taskOOPoption24.view.TextConstant.*;
import static com.courses.taskOOPoption24.view.TextConstant.LOOK_DELETE;

public class SortMenu {
    private Model model;
    private View view;
    private Scanner scanner;

    public SortMenu(Model model, View view, Scanner scanner) {
        this.model = model;
        this.view = view;
        this.scanner = scanner;
    }

    void showMenu() {
        view.printMessage(CHOOSE_OPTION);
        view.printMenu(SORT_TITLE, SORT_DATE_INCOME, SORT_SENT, SORT_RECIPIENT);
        int menuOption = Controller.chooseStartMenu(scanner, 4);
        if (menuOption == 1) {
            sortTitle();
        }
        if (menuOption == 2) {
            sortDateIncome();
        }
        if (menuOption == 3) {
            sortSent();
        }
        if (menuOption == 4) {
            sortRecipient();
        }
    }

    private void sortTitle(){
        TreeMap<String, Letter> letterTreeMap = new TreeMap<>();
        for (Letter letter : model.getLetters()){
            String title = letter.gettitle();
            letterTreeMap.put(title, letter);
        }
        showSortedLetters(letterTreeMap);
    }

    private void sortDateIncome(){
        TreeMap<Date, Letter> letterTreeMap = new TreeMap<>();
        for (Letter letter : model.getLetters()){
            Date date = letter.getReceive();
            letterTreeMap.put(date, letter);
        }
        for (Letter letter : letterTreeMap.values()){
            view.printOneLetter(letter);
        }
    }

    private void sortSent(){
        TreeMap<String, Letter> letterTreeMap = new TreeMap<>();
        for (Letter letter : model.getLetters()){
            String sender = letter.getSender();
            letterTreeMap.put(sender, letter);
        }
        showSortedLetters(letterTreeMap);
    }

    private void sortRecipient(){
        TreeMap<String, Letter> letterTreeMap = new TreeMap<>();
        for (Letter letter : model.getLetters()){
            String recipient = letter.getRecipient();
            letterTreeMap.put(recipient, letter);
        }
        showSortedLetters(letterTreeMap);
    }
    private void showSortedLetters(TreeMap<String, Letter> letterTreeMap){
        for (Letter letter : letterTreeMap.values()){
            view.printOneLetter(letter);
        }
        System.out.println();
    }
}
