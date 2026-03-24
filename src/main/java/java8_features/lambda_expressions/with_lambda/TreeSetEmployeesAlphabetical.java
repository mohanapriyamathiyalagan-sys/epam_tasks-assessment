package org.epam.java8_features.lambda_expressions.with_lambda;

import java.util.TreeSet;

public class TreeSetEmployeesAlphabetical {
    public static void main(String[] args) {
        TreeSet<Employee> set = new TreeSet<>(

        (e1,e2)->e1.name.compareTo(e2.name));

        set.add(new Employee(1, "Jura"));
        set.add(new Employee(2, "Aryi"));

        for(Employee e : set){
            System.out.println(e);
        }
    }
}
