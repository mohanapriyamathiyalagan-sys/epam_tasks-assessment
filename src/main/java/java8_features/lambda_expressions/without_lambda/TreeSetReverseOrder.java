package org.epam.java8_features.lambda_expressions.without_lambda;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetReverseOrder {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        set.add(10);
        set.add(30);
        set.add(90);
        set.add(20);

        System.out.println(set);
    }
}
