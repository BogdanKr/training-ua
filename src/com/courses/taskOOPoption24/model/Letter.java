package com.courses.taskOOPoption24.model;

import java.util.Date;

public enum Letter {
    LETTER1("Hi         ", "Mama  ", "Me   ", new Date(119,05,22), new Date(119,05,22), Category.INCOME),
    LETTER2("How are you", "Dad   ", "Me   ", new Date(119,05,21), new Date(119,05,21), Category.INCOME),
    LETTER3("Work       ", "Me    ", "Kiril", new Date(119,2,13), new Date(119,2,13), Category.SEND),
    LETTER4("Holiday    ", "Me    ", "Max  ", new Date(119,05,1), new Date(119,05,1), Category.SEND),
    LETTER5("Work       ", "Kiril ", "Me   ", new Date(119,02,11), new Date(119,3,11), Category.DELETED),
    LETTER6("TV         ", "LG-shop", "Me  ", new Date(119,05,12), new Date(119,05,12), Category.SPAM),
    LETTER7("IT         ", "ITschool", "Me ", new Date(119,05,20), new Date(119,05,20), Category.DELETED),
    LETTER8("Hi         ", "Kiril  ", "Me  ", new Date(119,05,19), new Date(119,05,19), Category.INCOME),
    LETTER9("TV         ", "LG-shop", "Me  ", new Date(119,04,25), new Date(119,04,25), Category.SPAM),
    LETTER10("Work2      ", "Me     ", "Max", new Date(119,06,02), new Date(119,06,02), Category.DELETED)
    ;

    private String title;
    private String sender;
    private String recipient;
    private Date send;
    private Date receive;
    private Category category;

    private Letter(String title, String sender, String recipient, Date send, Date receive, Category category) {
        this.title = title;
        this.sender = sender;
        this.recipient = recipient;
        this.send = send;
        this.receive = receive;
        this.category = category;
    }

    public String gettitle() {
        return title;
    }

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public Date getSendDate() {
        return send;
    }

    public Date getReceive() {
        return receive;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Letter " +
                "title= '" + title + '\'' +
                ", sender= '" + sender + '\'' +
                ", recipient= '" + recipient + '\'' +
                ", send= " + send +
                ", receive= " + receive +
                ", category= " + category ;
    }
}
