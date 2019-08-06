package com.courses.task_oop_option24.model.entity;

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

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public LocalDate getSendDate() {
        return sendDate;
    }

    public Category getCategory() {
        return category;
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
