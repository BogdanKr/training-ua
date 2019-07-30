package com.courses.task_oop_option24.model;

import java.time.LocalDate;

public abstract class Letter {
    protected String title;
    protected String sender;
    protected String recipient;
    protected LocalDate sendDate;
    protected Category category;

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

    @Override
    public String toString() {
        return "Letter{" +
                "title='" + title + '\'' +
                ", sender='" + sender + '\'' +
                ", recipient='" + recipient + '\'' +
                ", sendDate=" + sendDate +
                ", category=" + category +
                '}';
    }

}
