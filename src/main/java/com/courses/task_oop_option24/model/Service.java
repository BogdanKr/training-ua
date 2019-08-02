package com.courses.task_oop_option24.model;

import com.courses.task_oop_option24.model.entity.Category;
import com.courses.task_oop_option24.model.entity.Letter;
import com.courses.task_oop_option24.model.entity.PostBox;
import com.courses.task_oop_option24.model.entity.TextLetter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
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

    public List<Letter> sortWithComparator(PostBox postBox, String sortType) {
        letterList = postBox.getLetterList();
        switch (sortType){
            case SORT_TITLE : {
                Comparator<Letter> compareByTitle = new Comparator<Letter>() {
                    @Override
                    public int compare(Letter o1, Letter o2) {
                        return o1.getTitle().compareTo(o2.getTitle());
                    }
                };
                letterList.sort(compareByTitle);
                break;
            }

            case SORT_DATE_INCOME : {
                Comparator<Letter> compareByDate = new Comparator<Letter>() {
                    @Override
                    public int compare(Letter o1, Letter o2) {
                        return o1.getSendDate().compareTo(o2.getSendDate());
                    }
                };
                letterList.sort(compareByDate);
                break;
            }

            case SORT_SENT : {
                Comparator<Letter> compareBySent = new Comparator<Letter>() {
                    @Override
                    public int compare(Letter o1, Letter o2) {
                        return o1.getSender().compareTo(o2.getSender());
                    }
                };
                letterList.sort(compareBySent);
                break;
            }

            case SORT_RECIPIENT : {
                Comparator<Letter> compareByRecipient = new Comparator<Letter>() {
                    @Override
                    public int compare(Letter o1, Letter o2) {
                        return o1.getRecipient().compareTo(o2.getRecipient());
                    }
                };
                letterList.sort(compareByRecipient);
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
