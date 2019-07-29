package com.cources.task3.controller;

public interface RegexContainer {
    String REGEX_NAME_LAT = "^[A-Z][a-z]{1,20}$";
    String REGEX_LAST_NAME_LAT = "^[A-Z][a-z]{1,20}$";
    String REGEX_MIDDLE_NAME_LAT = "^[A-Z][a-z]{1,20}$";


    String REGEX_NAME_UA = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$";
    String REGEX_LAST_NAME_UA = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$";
    String REGEX_MIDDLE_NAME_UA = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$";
    String REGEX_LOGIN = "^[A-Za-z0-9_-]{6,20}$";
}
