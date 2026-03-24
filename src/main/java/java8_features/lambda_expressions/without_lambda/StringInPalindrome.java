package org.epam.java8_features.lambda_expressions.without_lambda;

public class StringInPalindrome {
    public static void main(String[] args) {
        String str = "Madam";
        String reverse = "";

        for(int i=str.length()-1;i>=0;i--){
            reverse+=str.charAt(i);
        }
        if(str.equalsIgnoreCase(reverse)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not palindrome");
        }
    }
}
