package com.courses.task_oop_option24.controller;

import com.courses.task_oop_option24.view.View;

import java.util.Scanner;

import static com.courses.task_oop_option24.view.TextConstant.WARNING;
import static com.courses.task_oop_option24.view.TextConstant.WRONG_ENTER;

class UtilityController {
    private Scanner sc = new Scanner(System.in);
    private View view;

    UtilityController(View view) {
        this.view = view;
    }

    private int inputIntValueWithScanner() {
        while (!sc.hasNextInt()) {
            view.printMessage(WARNING);
            sc.next();
        }
        return sc.nextInt();
    }

    int chooseStartMenu(int options) {
        int chooseMenu;
        while (true) {
            chooseMenu = inputIntValueWithScanner();
            if (chooseMenu > 0 && chooseMenu <= options) break;
            view.printMessage(WRONG_ENTER);
        }
        return chooseMenu;
    }

    String inputText() {
        sc.nextLine();
        return sc.nextLine();
    }
}
