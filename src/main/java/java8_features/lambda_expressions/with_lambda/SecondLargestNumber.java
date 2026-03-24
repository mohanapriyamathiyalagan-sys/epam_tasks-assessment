package org.epam.java8_features.lambda_expressions.with_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondLargestNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 40, 90, 80, 50);

        list.sort((a,b)->b-a);
        System.out.println(list.get(1));
    }
}
