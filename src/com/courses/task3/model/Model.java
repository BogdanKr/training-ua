package com.courses.task3.model;

import java.util.List;

public class Model {
    private List<NoteBook> dataBaseNote = DBNote.dataBaseNote;

    public List<NoteBook> getDataBaseNote() {
        return dataBaseNote;
    }

    public void setDataBaseNote(List<NoteBook> dataBaseNote) {
        this.dataBaseNote = dataBaseNote;
    }
}
