package org.epam.java8_features.streams;

public class ImplMathOperation {
    public static void main(String[] args) {
        MathOperation mathOperation = (a, b) -> a*b;

        System.out.println(mathOperation.operation(5,3));
    }
}
