package org.epam.java8_features.constructor_reference;

public class ConstructorReference {
    public static void main(String[] args) {
        EmployeeFactory factory = Employee::new;

        Employee emp = factory.create("Priya", "HDFC", 50000.00);
        emp.display();
    }
}
