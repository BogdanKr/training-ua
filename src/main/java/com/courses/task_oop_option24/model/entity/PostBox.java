package com.courses.task_oop_option24.model.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PostBox {
    List<Letter> letterList;

    {
        letterList = new ArrayList<>();
        Arrays.stream(DBLetter.values())
                .forEach(letter -> letterList.add(letter.getLetter()));
    }

    public List<Letter> getLetterList() {
        return letterList;
    }

    public void setLetterList(List<Letter> letterList) {
        this.letterList = letterList;
    }
}
