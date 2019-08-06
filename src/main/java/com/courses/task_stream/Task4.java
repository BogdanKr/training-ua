package com.courses.task_stream;

import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 2, 1, 5, 7, -1);
        long count = numbers.stream()
                .filter(integer -> integer > 0)
                .count();
        System.out.println(count);
    }
}
