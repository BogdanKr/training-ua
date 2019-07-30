package com.courses.task_oop_option24.controller;

import com.courses.task_oop_option24.model.Category;
import com.courses.task_oop_option24.model.PostBox;
import com.courses.task_oop_option24.model.Service;
import com.courses.task_oop_option24.view.View;

import java.util.Scanner;

import static com.courses.task_oop_option24.view.TextConstant.*;

public class Controller {
    private PostBox postBox;
    private static View view;


    public Controller(PostBox postBox, View view) {
        this.postBox = postBox;
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
                    showMenu(postBox, view, scanner);
                    break;
                }
                case 2: {
                    sortMenu(postBox, view, scanner);
                    break;
                }

                case 3: {
                    findMenu(postBox, view, scanner);
                    break;
                }
            }
            view.printMessage(CHOOSE_OPTION);
            view.printMenu(LOOK_LETTER, SORT_LETTERS, FIND_HEAD, EXIT);
        }
    }


    private void showMenu(PostBox postBox, View view, Scanner scanner) {
        Service service = new Service();
        view.printMessage(CHOOSE_OPTION);
        view.printMenu(LOOK_LETTER, LOOK_INCOME, LOOK_SEND, LOOK_SPAM, LOOK_DELETE);
        int menuOption = chooseStartMenu(scanner, 5);
        switch (menuOption) {
            case 1: {
                view.printLetters(postBox.getLetterList());
                break;
            }
            case 2: {
                view.printLetters(service.showNeedCategory(postBox, Category.INCOME));
                break;
            }
            case 3: {
                view.printLetters(service.showNeedCategory(postBox, Category.SEND));
                break;
            }
            case 4: {
                view.printLetters(service.showNeedCategory(postBox, Category.SPAM));
                break;
            }
            case 5: {
                view.printLetters(service.showNeedCategory(postBox, Category.DELETED));
                break;
            }
        }
    }

    private void sortMenu(PostBox postBox, View view, Scanner scanner) {

    }

    private void findMenu(PostBox postBox, View view, Scanner scanner) {
        Service service = new Service();
        view.printMessage(CHOOSE_OPTION);
        view.printMenu(FIND_TITLE, FIND_SENDER, FIND_RECIPIENT);
        int menuOption = chooseStartMenu(scanner, 3);
        switch (menuOption) {
            case 1: {
                view.printMessage(FIND_TITLE);
                String searchText = scanner.next();
                view.printLetters(service.findInNeedCategoty(postBox, searchText, FIND_TITLE));
                break;
            }
            case 2: {
                view.printMessage(FIND_SENDER);
                String searchText = scanner.next();
                view.printLetters(service.findInNeedCategoty(postBox, searchText, FIND_SENDER));
                break;
            }
            case 3: {
                view.printMessage(FIND_RECIPIENT);
                String searchText = scanner.next();
                view.printLetters(service.findInNeedCategoty(postBox, searchText, FIND_RECIPIENT));
                break;
            }
        }
    }



    private int inputIntValueWithScanner(Scanner sc) {
        while (!sc.hasNextInt()) {
            view.printMessage(WARNING);
            sc.next();
        }
        return sc.nextInt();
    }

    private int chooseStartMenu(Scanner scanner, int options) {
        int chooseMenu;
        while (true) {
            chooseMenu = inputIntValueWithScanner(scanner);
            if (chooseMenu > 0 && chooseMenu <= options) break;
            view.printMessage(WRONG_ENTER);
        }
        return chooseMenu;
    }

}
