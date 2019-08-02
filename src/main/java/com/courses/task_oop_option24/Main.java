package com.courses.task_oop_option24;


import com.courses.task_oop_option24.controller.Controller;
import com.courses.task_oop_option24.model.entity.PostBox;
import com.courses.task_oop_option24.view.View;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new PostBox(), new View());
        controller.execute();

    }
}
