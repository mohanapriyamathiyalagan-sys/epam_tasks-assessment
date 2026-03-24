package org.epam.java8_features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeStreams {
    public static void main(String[] args) {
        List<Employee> employee = Arrays.asList(new Employee("Jura", 6000000.00, "IT", 27),
                new Employee("Yira", 5000000.00, "IT", 28),
                new Employee("Riya", 5000000.00, "CSE", 28));


        List<String> list = employee.stream().filter(d->d.department.equals("IT"))
                .sorted((s1,s2)-> Double.compare(s2.salary,s1.salary))
                .map(a->a.name)
                .collect(Collectors.toList());

        System.out.println(list);
    }
}
