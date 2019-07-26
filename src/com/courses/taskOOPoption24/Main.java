package com.courses.taskOOPoption24;

import com.courses.task3.controller.Controller;
import com.courses.task3.model.Model;
import com.courses.task3.view.View;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new Model(), new View());
        controller.execute();

    }
}
