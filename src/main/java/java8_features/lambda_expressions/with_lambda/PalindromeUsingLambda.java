package org.epam.java8_features.lambda_expressions.with_lambda;

public class PalindromeUsingLambda {
    public static void main(String[] args) {
        CheckPalindrome cp = (s)->{
            String rev = new
            StringBuilder(s).reverse().toString();
            return s.equals(rev);
        };
        System.out.println(cp.check("madam"));
    }
}
