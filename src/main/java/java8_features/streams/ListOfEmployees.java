package org.epam.java8_features.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfEmployees {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Jura", 5000000.00, "IT", 27),
                new Employee("Yira", 6000000.00, "IT", 28),
                new Employee("Riya", 5000000.00, "CSE", 28));

                 employees.stream()
                .sorted(Comparator.comparing(n->n.name))
                .forEach(n-> System.out.println(n.name));

    }
}
