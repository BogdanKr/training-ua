package com.cources.task2;

import java.util.ArrayList;

public class Model {
    private int maxValue;
    private int minValue;
    private int enteredValue;
    private int neededValue;
    private ArrayList<Integer> playerInputs = new ArrayList<>();

    public ArrayList<Integer> getPlayerInputs() {
        return playerInputs;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public int getMinValue() {
        return minValue;
    }

    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }

    public int setNeededValue() {
        this.neededValue = minValue + (int) (Math.random() * maxValue);
        return neededValue;
    }

    public int startGuess(int enteredValue) {
        this.enteredValue = enteredValue;
        playerInputs.add(enteredValue);

        if (enteredValue < minValue || enteredValue > maxValue) return 1;
        else if (enteredValue > neededValue) {
            maxValue = enteredValue;
            return 2;
        } else if (enteredValue < neededValue) {
            minValue = enteredValue;
            return 3;
        } else return 0;
    }
}
