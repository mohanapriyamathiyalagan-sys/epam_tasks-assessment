package org.epam.java8_features.lambda_expressions.without_lambda;

public class RunnableNThread {
    public static void main(String[] args) {

        Runnable printNumbers = () -> {

            for (int i = 1; i <= 10; i++) {
                System.out.println("Number: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread = new Thread(printNumbers);
        thread.start();

        System.out.println("Main thread continues...");
    }
}
