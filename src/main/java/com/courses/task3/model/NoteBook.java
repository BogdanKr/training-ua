package com.courses.task3.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NoteBook {
    List<Note> dataBaseNote = new ArrayList<>(Arrays.asList(DBNote.values()));

    public List<Note> getDataBaseNote() {
        return dataBaseNote;
    }
}
