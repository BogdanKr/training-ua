package com.courses.task2;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void execute() {
        view.printMessage(View.START_MESSAGE);
        Scanner sc = new Scanner(System.in);
        model.setMinValue(inputIntValueWithScanner(sc));
        model.setMaxValue(inputIntValueWithScanner(sc));
        model.setNeededValue();
        view.printMessageAndRange(View.INPUT_NUMBER, model.getMinValue(), model.getMaxValue());

        while (true) {
            int value = model.startGuess(inputIntValueWithScanner(sc));
            if (value == 1) view.printMessageAndRange(View.WRONG_ENTER, model.getMinValue(), model.getMaxValue());
            if (value == 2) view.printMessageAndRange(View.NEED_LESS, model.getMinValue(), model.getMaxValue());
            if (value == 3) view.printMessageAndRange(View.NEED_BIGGER, model.getMinValue(), model.getMaxValue());
            if (value == 0) break;

        }
        view.printMessage(View.CONGRATULATION);
        view.printFinalMessage(model.getPlayerInputs().size());
        for (int i = 0; i < model.getPlayerInputs().size(); i++) {
            view.printNumbers(model.getPlayerInputs().get(i));
        }
    }

    public int inputIntValueWithScanner(Scanner sc) {
        while (!sc.hasNextInt()) {
            view.printMessage(View.WARNING);
            sc.next();
        }
        return sc.nextInt();
    }
}
