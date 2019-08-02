package com.courses.task_oop_option24.model.entity;

import java.time.LocalDate;

public enum DBLetter {
    LETTER1(new TextLetter("Hi         ", "Mam  ", "Me   ", LocalDate.of(2019, 05, 22), Category.INCOME, "some message...")),
    LETTER2(new TextLetter("How are you", "Dad   ", "Me   ", LocalDate.of(2019, 05, 21), Category.INCOME, "some message...")),
    LETTER3(new TextLetter("Work       ", "Me    ", "Kiril", LocalDate.of(2019, 02, 13), Category.SEND, "some message...")),
    LETTER4(new VideoLetter("Holiday    ", "Me    ", "Max  ", LocalDate.of(2019, 05, 2), Category.SEND, "fileName1", 11)),
    LETTER5(new TextLetter("Work       ", "Kiril ", "Me   ", LocalDate.of(2019, 02, 11), Category.DELETED, "some message...")),
    LETTER6(new VideoLetter("TV         ", "LG-shop", "Me  ", LocalDate.of(2019, 05, 12), Category.SPAM, "fileName2", 55)),
    LETTER7(new VideoLetter("IT         ", "ITschool", "Me ", LocalDate.of(2019, 05, 20), Category.DELETED, "fileName3", 34)),
    LETTER8(new TextLetter("Hi         ", "Kiril  ", "Me  ", LocalDate.of(2019, 05, 19), Category.INCOME, "some message...")),
    LETTER9(new VideoLetter("TV         ", "LG-shop", "Me  ", LocalDate.of(2019, 04, 25), Category.SPAM, "fileName5", 20)),
    LETTER10(new TextLetter("Work2      ", "Me     ", "Max ", LocalDate.of(2019, 06, 01), Category.DELETED, "some message...")),
    LETTER11(new TextLetter("Work2      ", "Me     ", "Max ", LocalDate.of(2019, 06, 02), Category.DELETED, "some message...")),
    LETTER12(new TextLetter("Work2      ", "Me     ", "Max ", LocalDate.of(2019, 06, 03), Category.DELETED, "some message...")),
    LETTER13(new VideoLetter("Hi       ", "Mam  ", "Me   ", LocalDate.of(2019, 05, 22), Category.INCOME, "fileName4", 33)),
    LETTER14(new VideoLetter("Hi       ", "Mam  ", "Me   ", LocalDate.of(2019, 05, 22), Category.INCOME, "fileName7", 34));

    private Letter letter;

    DBLetter(Letter letter) {
        this.letter = letter;
    }

    public Letter getLetter() {
        return letter;
    }
}
