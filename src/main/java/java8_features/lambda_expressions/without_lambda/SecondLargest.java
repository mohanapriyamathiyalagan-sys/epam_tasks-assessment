package org.epam.java8_features.lambda_expressions.without_lambda;

import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(60, 30, 40, 10, 50, 20);
        Collections.sort(list);

        System.out.println("Second Largest: "+list.get(list.size()-2));
    }
}
