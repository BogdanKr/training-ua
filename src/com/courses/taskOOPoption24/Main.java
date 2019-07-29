package com.courses.taskOOPoption24;


import com.courses.taskOOPoption24.controller.Controller;
import com.courses.taskOOPoption24.model.PostBox;
import com.courses.taskOOPoption24.view.View;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new PostBox(), new View());
        controller.execute();

    }
}
