package org.epam.java8_features.lambda_expressions.without_lambda;

public class StringRotation {
    public static void main(String[] args) {
        String s1 = "RAJU";
        String s2 = "JURA";

        String temp = s1+s1;
        if(temp.contains(s2)){
            System.out.println("Rotational String");
        }else{
            System.out.println("Not rotational");
        }
    }
}
