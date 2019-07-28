package com.courses.taskOOPoption24.controller;

import com.courses.taskOOPoption24.model.Model;
import com.courses.taskOOPoption24.view.View;

import static com.courses.taskOOPoption24.view.TextConstant.START_DATA;

public class Controller {
    private Model model;
    private View view;


    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void execute() {
        view.printMessage(START_DATA);
    }
}
