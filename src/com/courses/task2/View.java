package com.courses.task2;

public class View {
    public static final String WRONG_ENTER = "Wrong input! Please enter in  ";
    public static final String NEED_BIGGER = "Didn't guess, need number is bigger, ";
    public static final String NEED_LESS = "Didn't guess, need number is less, ";
    public static final String CONGRATULATION = "Congratulation, you won!!";
    public static final String WARNING = "Sorry it's not a number, please try again!";
    public static final String START_MESSAGE = "Enter please game range (min and max) ";
    public static final String INPUT_NUMBER = "Thank you, enter please number, ";


    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printMessageAndRange(String message, int min, int max) {
        System.out.println(message +"range is " + min + " - " + max);
    }

    public void printFinalMessage(int attempt){
        System.out.println("You guessed from " + attempt + " attempts,\n " +
                "You entered such numbers:");
    }
    public void printNumbers(int number){
        System.out.println(number);
    }
}
