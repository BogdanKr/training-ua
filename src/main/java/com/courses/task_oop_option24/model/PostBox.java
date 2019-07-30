package com.courses.task_oop_option24.model;

import java.util.ArrayList;
import java.util.List;

public class PostBox {
    List<Letter> letterList;

    {
        letterList = new ArrayList<>();
        for (DBLetter letter : DBLetter.values()) {
            letterList.add(letter.getLetter());
        }
    }

    public List<Letter> getLetterList() {
        return letterList;
    }

    public void setLetterList(List<Letter> letterList) {
        this.letterList = letterList;
    }
}