package com.courses.task_oop_option24.model;

import java.time.LocalDate;

public class TextLetter extends Letter {
    String message;


    public TextLetter(String title, String sender, String recipient, LocalDate sendDate, Category category, String message) {
        super(title, sender, recipient, sendDate, category);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "TextLetter{title='" + title + '\'' +
                ", sender='" + sender + '\'' +
                ", recipient='" + recipient + '\'' +
                ", sendDate=" + sendDate +
                ", category=" + category +
                " message='" + message + '\'' +
                '}';
    }
}
