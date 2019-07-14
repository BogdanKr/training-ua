package com.courses.task1;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void progress(){
        Scanner sc = new Scanner(System.in);
        view.printStartMessage();
        if (checkInput(sc)) view.printFinalMessage(model.getFirstWord(), model.getSecondWord());

    }

    private boolean checkInput(Scanner sc){
        while (true){
            String word = sc.nextLine();
            if (word.equals(model.getFirstWord())) break;
            else view.printWrongMessage();
        }
        view.printProgress();
        while (true){
            String word = sc.nextLine();
            if (word.equals(model.getSecondWord())) break;
            else view.printWrongMessage();
        }
        return true;
    }
}
