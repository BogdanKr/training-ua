package com.courses.task_oop_option24.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static com.courses.task_oop_option24.view.TextConstant.*;

public class Service {
    private List<Letter> letterList;

    public List<Letter> showAll(PostBox postBox) {
        return postBox.getLetterList();
    }

    public List<Letter> showNeedCategory(PostBox postBox, Category category) {
        letterList = new ArrayList<>();
        for (Letter letter : postBox.getLetterList()) {
            if (letter.getCategory().equals(category)) letterList.add(letter);
        }
        return letterList;
    }

    public List<Letter> findInNeedCategoty(PostBox postBox, String searchText, String needCategory) {
        letterList = new ArrayList<>();
        switch (needCategory) {
            case (FIND_TITLE): {
                for (Letter letter : postBox.getLetterList()) {
                    if (letter.getTitle().trim().equalsIgnoreCase(searchText)) letterList.add(letter);
                }
                break;
            }
            case (FIND_SENDER): {
                for (Letter letter : postBox.getLetterList()) {
                    if (letter.getSender().trim().equalsIgnoreCase(searchText)) letterList.add(letter);
                }
                break;
            }
            case (FIND_RECIPIENT): {
                for (Letter letter : postBox.getLetterList()) {
                    if (letter.getRecipient().trim().equalsIgnoreCase(searchText)) letterList.add(letter);
                }
                break;
            }
        }
        return letterList;
    }

    public Letter createTextLetter(String message) {
        Letter letter = new TextLetter("New", "Me", "Somebody",
                LocalDate.now(), Category.SEND, message);
        return letter;
    }
}
