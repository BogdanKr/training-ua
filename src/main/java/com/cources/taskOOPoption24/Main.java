package com.cources.taskOOPoption24;


import com.cources.taskOOPoption24.controller.Controller;
import com.cources.taskOOPoption24.model.PostBox;
import com.cources.taskOOPoption24.view.View;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new PostBox(), new View());
        controller.execute();

    }
}
