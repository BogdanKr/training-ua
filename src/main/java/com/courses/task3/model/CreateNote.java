package com.courses.task3.model;

import static com.courses.task3.view.TextConstant.NOT_UNICK_LOGIN;

public class CreateNote implements Note {
    private String firstName;
    private String lastName;
    private String middleName;
    private String login;

    public CreateNote(String firstName, String lastName, String middleName, String login) throws NotUnickNoteExc {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        checkLogin(login);
        this.login = login;
    }

    private void checkLogin(String login) throws NotUnickNoteExc {
            for (DBNote note : DBNote.values()){
                if (login.equals(note.getLogin())) {
                    throw new NotUnickNoteExc(NOT_UNICK_LOGIN);
                }
            }
    }

    @Override
    public String toString() {
        return "CreateNote{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", login='" + login + '\'' +
                '}';
    }
}
