package org.epam.java8_features.constructor_reference;

public class Employee {
    String name;
    String account;
    double salary;

    public Employee(String name, String account, double salary) {
        this.name = name;
        this.account = account;
        this.salary = salary;
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Account: "+account);
        System.out.println("Salary: "+salary);
    }
}
