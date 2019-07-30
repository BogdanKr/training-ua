package com.courses.task_oop_option24.controller;

import com.courses.task_oop_option24.model.PostBox;
import com.courses.task_oop_option24.view.View;

import java.util.Scanner;

import static com.courses.task_oop_option24.view.TextConstant.*;

public class Controller {
    private PostBox model;
    private static View view;


    public Controller(PostBox model, View view) {
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
            switch (menuOption) {
                case 1: {
                    new ShowLetters(model, view, scanner).showMenu();
                    break;
                }
                case 2: {
                    new SortMenu(model, view, scanner).showMenu();
                    break;
                }

                case 3: {
                    new FindMenu(model, view, scanner).find();
                    break;
                }
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
