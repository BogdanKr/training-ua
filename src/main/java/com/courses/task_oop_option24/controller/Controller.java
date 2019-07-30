package com.courses.task_oop_option24.controller;

import com.courses.task_oop_option24.model.Category;
import com.courses.task_oop_option24.model.Letter;
import com.courses.task_oop_option24.model.PostBox;
import com.courses.task_oop_option24.model.Service;
import com.courses.task_oop_option24.view.View;

import java.util.Comparator;

import static com.courses.task_oop_option24.view.TextConstant.*;

public class Controller {
    private PostBox postBox;
    private View view;
    private UtilityController utilityController;


    public Controller(PostBox postBox, View view) {
        this.postBox = postBox;
        this.view = view;
    }

    public void execute() {
        utilityController = new UtilityController(view);
        view.printMessage(START_DATA);
        int menuOption;
        view.printMessage(CHOOSE_OPTION);
        view.printMenu(LOOK_LETTER, SORT_LETTERS, FIND_HEAD, CREATE_TEXT_MESSAGE, EXIT);

        while ((menuOption = utilityController.chooseStartMenu(5)) != 5) {
            switch (menuOption) {
                case 1: {
                    showMenu();
                    break;
                }
                case 2: {
                    sortMenu();
                    break;
                }

                case 3: {
                    findMenu();
                    break;
                }
                case 4: {
                    createTextMessage();
                    break;
                }
            }
            view.printMessage(CHOOSE_OPTION);
            view.printMenu(LOOK_LETTER, SORT_LETTERS, FIND_HEAD, CREATE_TEXT_MESSAGE, EXIT);
        }
    }


    private void showMenu() {
        Service service = new Service();
        view.printMessage(CHOOSE_OPTION);
        view.printMenu(LOOK_LETTER, LOOK_INCOME, LOOK_SEND, LOOK_SPAM, LOOK_DELETE);
        int menuOption = utilityController.chooseStartMenu(5);
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

    private void sortMenu() {
        Service service = new Service();
        view.printMessage(CHOOSE_OPTION);
        view.printMenu(SORT_TITLE, SORT_DATE_INCOME, SORT_SENT, SORT_RECIPIENT);
        int menuOption = utilityController.chooseStartMenu(4);
        switch (menuOption) {
            case 1: {
                view.printLetters(service.sortWithComparator(postBox, SORT_TITLE));
                break;
            }
            case 2: {
                view.printLetters(service.sortWithComparator(postBox, SORT_DATE_INCOME));
                break;
            }
            case 3: {
                view.printLetters(service.sortWithComparator(postBox, SORT_SENT));
                break;
            }
            case 4: {
                view.printLetters(service.sortWithComparator(postBox, SORT_RECIPIENT));
                break;
            }
        }
    }

    private void findMenu() {
        Service service = new Service();
        view.printMessage(CHOOSE_OPTION);
        view.printMenu(FIND_TITLE, FIND_SENDER, FIND_RECIPIENT);
        int menuOption = utilityController.chooseStartMenu(3);
        switch (menuOption) {
            case 1: {
                view.printMessage(FIND_TITLE);
                String searchText = utilityController.inputText();
                view.printLetters(service.findInNeedCategoty(postBox, searchText, FIND_TITLE));
                break;
            }
            case 2: {
                view.printMessage(FIND_SENDER);
                String searchText = utilityController.inputText();
                view.printLetters(service.findInNeedCategoty(postBox, searchText, FIND_SENDER));
                break;
            }
            case 3: {
                view.printMessage(FIND_RECIPIENT);
                String searchText = utilityController.inputText();
                view.printLetters(service.findInNeedCategoty(postBox, searchText, FIND_RECIPIENT));
                break;
            }
        }
    }

    private void createTextMessage() {
        view.printMessage(INPUT_TEXT);
        String message = utilityController.inputText();
        Service service = new Service();
        Letter letter = service.createTextLetter(message);
        view.printMessage(LETTER_WAS_SENT);
        postBox.getLetterList().add(letter);
    }
}
