package com.courses.task3.model;

public enum DBNote implements Note {
    NOTE_1("Bogdan", "Krasun", "Vitalievich", "bogdan123"),
    NOTE_2("Max", "Gorbachev", "Maaaxxxx", "max555"),
    NOTE_3("Vova", "Putin", "Vladimirovich", "vovan_123"),
    NOTE_4("Petya", "Poroshenko", "Alekseevich", "poroh2019"),
    ;
    private String firstName;
    private String lastName;
    private String middleName;
    private String login;

     DBNote(String firstName, String lastName, String middleName, String login) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.login = login;
     }

    public String getLogin() {
        return login;
    }

    @Override
    public String toString() {
        return "DBNote{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", login='" + login + '\'' +
                '}';
    }
}
