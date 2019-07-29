package com.cources.task3.model;

import static com.cources.task3.view.TextConstant.NOT_UNICK_LOGIN;

public enum NoteBook {
    NOTE_1("Bogdan", "Krasun", "Vitalievich", "bogdan123"),
    NOTE_2("Max", "Gorbachev", "Maaaxxxx", "max555"),
    NOTE_3("Vova", "Putin", "Vladimirovich", "vovan_123"),
    NOTE_4("Alex", "Timoshenko", "Petrovich", "timohaa"),
    NOTE_5("Petya", "Poroshenko", "Alekseevich", "poroh2019"),
    ;
    private String firstName;
    private String lastName;
    private String middleName;
    private String login;

     NoteBook(String firstName, String lastName, String middleName, String login) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        checkLogin(login);
        this.login = login;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLogin() {
        return login;
    }

    private void checkLogin(String login)  {
        try {
            for (NoteBook note : NoteBook.values()){
                if (login.equals(note.getLogin())) throw new NotUnickNoteExc(NOT_UNICK_LOGIN);
            }
        } catch (NotUnickNoteExc notUnickNoteExc) {

        }
    }
}
