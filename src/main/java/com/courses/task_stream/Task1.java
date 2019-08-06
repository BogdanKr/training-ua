package com.courses.task_stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 2, 1, 5, 7);
        OptionalDouble i = numbers.stream().mapToDouble(Integer::intValue).average();
        System.out.println(i);

        List<Double> numbers2 = Arrays.asList(3.0, 2.0, 1.0, 5.0, 7.0);
        System.out.println(numbers2.stream().mapToDouble(Double::doubleValue).average().getAsDouble());

        double sum = numbers2.stream().reduce(0.0, Double::sum);
        System.out.println(sum);
    }
}
