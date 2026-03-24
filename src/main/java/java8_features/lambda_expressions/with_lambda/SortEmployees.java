package org.epam.java8_features.lambda_expressions.with_lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortEmployees {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Jura"));
        list.add(new Employee(2, "Yira"));
        list.add(new Employee(3, "Riya"));


        Collections.sort(list,(e1,e2)->e2.name.compareTo(e1.name));
        for(Employee e : list){
            System.out.println(e);
        }
    }
}
