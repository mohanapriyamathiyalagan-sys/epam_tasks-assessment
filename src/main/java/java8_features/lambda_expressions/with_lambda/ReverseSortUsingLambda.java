package org.epam.java8_features.lambda_expressions.with_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseSortUsingLambda {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 50, 90, 20, 30,40);

        list.sort((a,b)->b-a);
        System.out.println(list);
    }
}
