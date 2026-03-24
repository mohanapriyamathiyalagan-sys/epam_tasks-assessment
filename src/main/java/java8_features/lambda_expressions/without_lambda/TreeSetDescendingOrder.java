package org.epam.java8_features.lambda_expressions.without_lambda;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class TreeSetDescendingOrder {
    public static void main(String[] args) {

        TreeMap<Integer,String> map = new TreeMap<>(Collections.reverseOrder());
        map.put(1, "A");
        map.put(2,"C");
        map.put(3, "B");

        System.out.println(map);
    }



}
