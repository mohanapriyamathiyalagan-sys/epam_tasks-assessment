package org.epam.java8_features.lambda_expressions.without_lambda;

import java.util.Collections;
import java.util.TreeMap;

public class TreeMapEmployeesDescendingOrder {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>(Collections.reverseOrder());
        map.put("Jura", 1);
        map.put("Yira", 2);
        map.put("Riya", 3);

        System.out.println(map);
    }
}
