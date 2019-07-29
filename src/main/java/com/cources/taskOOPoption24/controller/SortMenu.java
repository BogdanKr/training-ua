package com.cources.taskOOPoption24.controller;

import com.cources.taskOOPoption24.model.Letter;
import com.cources.taskOOPoption24.model.PostBox;
import com.cources.taskOOPoption24.view.View;

import java.util.Date;
import java.util.Scanner;
import java.util.TreeMap;

import static com.cources.taskOOPoption24.view.TextConstant.*;

public class SortMenu {
    private PostBox model;
    private View view;
    private Scanner scanner;

    public SortMenu(PostBox model, View view, Scanner scanner) {
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

    private void sortTitle() {
        TreeMap<String, Letter> letterTreeMap = new TreeMap<>();
        int count = 1;
        for (Letter letter : model.getLetters()) {
            String title = letter.gettitle();
            if (letterTreeMap.containsKey(title)) letterTreeMap.put(title + count++, letter);
            else letterTreeMap.put(title, letter);
        }
        showSortedLetters(letterTreeMap);
    }

    private void sortDateIncome() {
        TreeMap<Date, Letter> letterTreeMap = new TreeMap<>();
        int count = 1;
        for (Letter letter : model.getLetters()) {
            Date date = letter.getSendDate();
            if (letterTreeMap.containsKey(date)) letterTreeMap.put(new Date(date.getTime() + count++), letter);
            else letterTreeMap.put(date, letter);
        }
        for (Letter letter : letterTreeMap.values()) {
            view.printOneLetter(letter);
        }
    }

    private void sortSent() {
        TreeMap<String, Letter> letterTreeMap = new TreeMap<>();
        int count = 1;
        for (Letter letter : model.getLetters()) {
            String sender = letter.getSender();
            if (letterTreeMap.containsKey(sender)) letterTreeMap.put(sender + count++, letter);
            else letterTreeMap.put(sender, letter);
        }
        showSortedLetters(letterTreeMap);
    }

    private void sortRecipient() {
        TreeMap<String, Letter> letterTreeMap = new TreeMap<>();
        int count = 1;
        for (Letter letter : model.getLetters()) {
            String recipient = letter.getRecipient();
            if (letterTreeMap.containsKey(recipient)) letterTreeMap.put(recipient + count++, letter);
            else letterTreeMap.put(recipient, letter);
        }
        showSortedLetters(letterTreeMap);
    }

    private void showSortedLetters(TreeMap<String, Letter> letterTreeMap) {
        for (Letter letter : letterTreeMap.values()) {
            view.printOneLetter(letter);
        }
        System.out.println();
    }
}
