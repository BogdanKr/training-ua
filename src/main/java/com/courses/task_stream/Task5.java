package com.courses.task_stream;

import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 2, 1, 5, 7);
        numbers.stream()
                .map(i -> i * 2)
                .forEach(System.out::println);
    }
}
