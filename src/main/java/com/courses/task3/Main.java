package com.courses.task3;

import com.courses.task3.controller.Controller;
import com.courses.task3.model.NoteBook;
import com.courses.task3.view.View;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new NoteBook(), new View());
        controller.execute();
    }
}
