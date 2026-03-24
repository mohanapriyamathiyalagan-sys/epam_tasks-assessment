package org.epam.java8_features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbersUsingStreams {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(19,20,30,39,50);

        List<Integer> list = numbers.stream().filter(n->n%2==0)
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
