package com.courses.taskOOPoption24;


import com.courses.taskOOPoption24.controller.Controller;
import com.courses.taskOOPoption24.model.Model;
import com.courses.taskOOPoption24.view.View;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new Model(), new View());
        controller.execute();

    }
}
