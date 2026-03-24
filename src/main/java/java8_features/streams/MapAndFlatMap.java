package org.epam.java8_features.streams;

import java.util.Arrays;
import java.util.List;

public class MapAndFlatMap {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "python");
        list.stream().map(String::toUpperCase)
                .forEach(System.out::println);
//map - transform one element to another

        List<List<String>> list1 = Arrays.asList(
                Arrays.asList("A", "B"),
                Arrays.asList("C", "D"));

        list1.stream().flatMap(x->x.stream()).forEach(System.out::println);

        //flatmap - flattens multiple lists into one stream
    }
}
