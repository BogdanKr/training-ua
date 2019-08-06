package com.courses.task_oop_option24.model;

import com.courses.task_oop_option24.model.entity.Category;
import com.courses.task_oop_option24.model.entity.Letter;
import com.courses.task_oop_option24.model.entity.PostBox;
import com.courses.task_oop_option24.model.entity.TextLetter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static com.courses.task_oop_option24.view.TextConstant.*;

public class Service {
    private List<Letter> letterList;

    public List<Letter> showAll(PostBox postBox) {
        return postBox.getLetterList();
    }

    public List<Letter> showNeedCategory(PostBox postBox, Category category) {
        letterList = new ArrayList<>();
        postBox.getLetterList().stream()
                .filter(letter -> letter.getCategory().equals(category))
                //   .forEach(letter -> letterList.add(letter));
                .forEach(letterList::add);
        return letterList;
    }

    public List<Letter> findInNeedCategoty(PostBox postBox, String searchText, String needCategory) {
        letterList = new ArrayList<>();
        switch (needCategory) {
            case (FIND_TITLE): {
//                postBox.getLetterList().stream()
//                        .filter(letter -> letter.getTitle().trim().equalsIgnoreCase(searchText))
//                        .forEach(letterList::add);
                letterList = postBox.getLetterList().stream()
                        .filter(letter -> letter.getTitle().trim().equalsIgnoreCase(searchText))
                        .collect(Collectors.toList());
                break;
            }
            case (FIND_SENDER): {
                postBox.getLetterList().stream()
                        .filter(letter -> letter.getSender().trim().equalsIgnoreCase(searchText))
                        .forEach(letterList::add);
//                for (Letter letter : postBox.getLetterList()) {
//                    if (letter.getSender().trim().equalsIgnoreCase(searchText)) letterList.add(letter);
//                }
                break;
            }
            case (FIND_RECIPIENT): {
                postBox.getLetterList().stream()
                        .filter(letter -> letter.getRecipient().trim().equalsIgnoreCase(searchText))
                        .forEach(letterList::add);
//                for (Letter letter : postBox.getLetterList()) {
//                    if (letter.getRecipient().trim().equalsIgnoreCase(searchText)) letterList.add(letter);
//                }
                break;
            }
        }
        return letterList;
    }

    public List<Letter> sortWithComparator(PostBox postBox, String sortType) {
        letterList = postBox.getLetterList();
        switch (sortType) {
            case SORT_TITLE: {
                //Comparator<Letter> compareByTitle = (o1, o2) -> o1.getTitle().compareTo(o2.getTitle());
                letterList.sort((o1, o2) -> o1.getTitle().compareTo(o2.getTitle()));
                break;
            }

            case SORT_DATE_INCOME: {
                Comparator<Letter> compareByDate = (o1, o2) -> o1.getSendDate().compareTo(o2.getSendDate());
                letterList.sort(compareByDate);
                break;
            }

            case SORT_SENT: {
                //Comparator<Letter> compareBySent = Comparator.comparing(Letter::getSender);
                letterList.sort(Comparator.comparing(Letter::getSender));
                break;
            }

            case SORT_RECIPIENT: {
                Comparator<Letter> compareByRecipient = (o1, o2) -> o1.getRecipient().compareTo(o2.getRecipient());
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
