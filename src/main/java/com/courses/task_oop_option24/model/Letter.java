package com.courses.task_oop_option24.model;

import java.time.LocalDate;

public abstract class Letter {
    private String title;
    private String sender;
    private String recipient;
    private LocalDate sendDate;
    private Category category;

    public Letter(String title, String sender, String recipient, LocalDate sendDate, Category category) {
        this.title = title;
        this.sender = sender;
        this.recipient = recipient;
        this.sendDate = sendDate;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public LocalDate getSendDate() {
        return sendDate;
    }

    public void setSendDate(LocalDate sendDate) {
        this.sendDate = sendDate;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
