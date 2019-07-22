package com.courses.task3.controller;

public interface RegexContainer {
    String REGEX_NAME_LAT = "^[A-Z][a-z]{1,20}$";
    String REGEX_NAME_UA = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$";
    String REGEX_LOGIN = "^[A-Za-z0-9_-]{6,20}$";
}
