package org.epam.java8_features.lambda_expressions.without_lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ReverseSortWithComparator {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(90,40,10,80);

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        System.out.println(list);

    }

}
