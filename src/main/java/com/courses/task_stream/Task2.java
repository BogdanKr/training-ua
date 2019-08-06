package com.courses.task_stream;

import java.util.*;
import java.util.stream.IntStream;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 2, 1, 5, 7);
        Integer min = numbers.stream()
                .reduce(Integer.MAX_VALUE, (value1, value2) -> value1 > value2 ? value2 : value1);
        Integer min2 = numbers.stream()
                .reduce(Integer.MAX_VALUE, Integer::min);
        System.out.println(min);
        System.out.println(min2);

        System.out.println(IntStream.range(0, numbers.size())
                .mapToObj(i -> new AbstractMap.SimpleEntry<>(i, numbers.get(i)))
                .min(Comparator.comparingInt(AbstractMap.SimpleEntry::getValue))
//                .map(AbstractMap.SimpleEntry::getValue));
//                .map(AbstractMap.SimpleEntry::getKey));
                .get());

    }
}
