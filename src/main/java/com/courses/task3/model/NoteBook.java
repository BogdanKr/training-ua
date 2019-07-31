package com.courses.task3.model;

import java.util.Arrays;
import java.util.List;

public class NoteBook {
    List<Note> dataBaseNote = Arrays.asList(DBNote.values());

    public List<Note> getDataBaseNote() {
        return dataBaseNote;
    }

    public void setDataBaseNote(List<Note> dataBaseNote) {
        this.dataBaseNote = dataBaseNote;
    }
}
