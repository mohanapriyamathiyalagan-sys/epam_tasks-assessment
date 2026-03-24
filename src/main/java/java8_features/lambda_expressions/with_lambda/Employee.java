package org.epam.java8_features.lambda_expressions.with_lambda;

public class Employee {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
