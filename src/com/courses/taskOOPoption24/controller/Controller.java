package com.courses.taskOOPoption24.controller;

import com.courses.taskOOPoption24.model.Model;
import com.courses.taskOOPoption24.view.View;

import java.util.Scanner;

import static com.courses.taskOOPoption24.view.TextConstant.*;

public class Controller {
    private Model model;
    private static View view;


    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void execute() {
        view.printMessage(START_DATA);
        Scanner scanner = new Scanner(System.in);
        int menuOption;
        view.printMessage(CHOOSE_OPTION);
        view.printMenu(LOOK_LETTER, SORT_LETTERS, FIND_HEAD, EXIT);

        while ((menuOption = chooseStartMenu(scanner, 4)) != 4) {
            if (menuOption == 1) {
                new ShowLetters(model, view, scanner).showMenu();

            }
            if (menuOption == 2) {
                new SortMenu(model, view, scanner).showMenu();
            }

            if (menuOption == 3) {

            }

            view.printMessage(CHOOSE_OPTION);
            view.printMenu(LOOK_LETTER, SORT_LETTERS, FIND_HEAD, EXIT);

        }
    }

    public static int inputIntValueWithScanner(Scanner sc) {
        while (!sc.hasNextInt()) {
            view.printMessage(WARNING);
            sc.next();
        }
        return sc.nextInt();
    }

    public static int chooseStartMenu(Scanner scanner, int options) {
        int chooseMenu;
        while (true) {
            chooseMenu = inputIntValueWithScanner(scanner);
            if (chooseMenu > 0 && chooseMenu <= options) break;
            view.printMessage(WRONG_ENTER);
        }
        return chooseMenu;
    }

}
