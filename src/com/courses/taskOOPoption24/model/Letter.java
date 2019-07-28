package com.courses.taskOOPoption24.model;

import java.util.Date;

public enum Letter {
    LETTER1("Hi", "Mama", "Me", new Date("12.06.2019"), new Date("12.06.2019"), Category.INCOME),

    LETTER2("How are you", "Dad", "Me", new Date("10.06.2019"), new Date("10.06.2019"), Category.INCOME),
    LETTER3("Work", "Me", "Kiril", new Date("12.06.2019"), new Date("12.06.2019"), Category.SEND),
    LETTER4("holiday", "Me", "Max", new Date("12.05.2019"), new Date("13.05.2019"), Category.SEND),
    LETTER5("Work", "Kiril", "Me", new Date("11.03.2018"), new Date("11.03.2018"), Category.DELETED),
    LETTER6("TV", "LG-shop", "Me", new Date("12.06.2019"), new Date("12.06.2019"), Category.SPAM),
    LETTER7("schoolIT", "ITschool", "Me", new Date("20.06.2019"), new Date("20.06.2019"), Category.DELETED),
    LETTER8("Hi", "Kiril", "Me", new Date("12.06.2019"), new Date("12.06.2019"), Category.INCOME),
    LETTER9("TV", "LG-shop", "Me", new Date("25.04.2019"), new Date("25.04.2019"), Category.SPAM),
    LETTER10("Work2", "Me", "Max", new Date("02.07.2019"), new Date("02.07.2019"), Category.DELETED)
    ;

    private String head;
    private String sender;
    private String recipient;
    private Date send;
    private Date receive;
    private Category category;

    private Letter(String head, String sender, String recipient, Date send, Date receive, Category category) {
        this.head = head;
        this.sender = sender;
        this.recipient = recipient;
        this.send = send;
        this.receive = receive;
        this.category = category;
    }

    public String getHead() {
        return head;
    }

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public Date getSend() {
        return send;
    }

    public Date getReceive() {
        return receive;
    }

    public Category getCategory() {
        return category;
    }
}
