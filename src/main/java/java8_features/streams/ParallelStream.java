package org.epam.java8_features.streams;

import java.util.Arrays;
import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);

        list.parallelStream().forEach(System.out::println);
        //parallel stream - run tasks using multiple cpu cores
    }
}
