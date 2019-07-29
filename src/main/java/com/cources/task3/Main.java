package com.cources.task3;

import com.cources.task3.controller.Controller;
import com.cources.task3.model.Model;
import com.cources.task3.view.View;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new Model(), new View());
        controller.execute();
    }
}
