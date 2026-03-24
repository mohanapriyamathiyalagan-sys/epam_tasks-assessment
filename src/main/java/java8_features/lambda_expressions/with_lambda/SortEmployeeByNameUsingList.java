package org.epam.java8_features.lambda_expressions.with_lambda;

import java.util.ArrayList;
import java.util.List;

public class SortEmployeeByNameUsingList {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Jura"));
        list.add(new Employee(2, "Yira"));
        list.add(new Employee(3, "Riya"));

        list.sort((e1,e2)->e1.name.compareTo(e2.name));

        for(Employee e : list){
            System.out.println(e);
        }
    }
}
