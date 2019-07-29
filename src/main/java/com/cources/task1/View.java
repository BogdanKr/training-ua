package com.cources.task1;

public class View {
    private static final String WRONG_MESSAGE = "Wrong input, repeat please!";
    private static final String START_MESSAGE = "Please enter first \"Hello\" after \"World!\"";
    private static final String PROGRESS_MESSAGE = "Please enter second word";


    public void printStartMessage() {
        System.out.println(START_MESSAGE);
    }

    public void printWrongMessage() {
        System.out.println(WRONG_MESSAGE);
    }

    public void printFinalMessage(String first, String second) {
        System.out.println(first + " " + second);
    }

    public void printProgress(){
        System.out.println(PROGRESS_MESSAGE);
    }
}
