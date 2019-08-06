package com.courses.task_stream;

import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 2, 1, 5, 7, 0, 4, 0);
        long count = numbers.stream()
                .filter(i -> i == 0)
                .count();
        System.out.println(count);
    }
}
