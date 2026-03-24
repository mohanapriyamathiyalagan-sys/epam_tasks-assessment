package org.epam.java8_features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TransactionOperationsUsingCollectors {
    public static void main(String[] args) {
        List<Transactions> transactionsList = Arrays.asList(
                new Transactions(100, "USD", "Completed"),
                new Transactions(200, "INR", "Completed"),
                new Transactions(300, "USD", "Completed"),
                new Transactions(400, "INR", "Pending")
        );

      Map<String, Double> result = transactionsList.stream()
              .filter(s->s.status.equals("Completed"))
              .collect(Collectors.groupingBy(t->t.currency,
                      Collectors.summingDouble(t->t.amount)));

        System.out.println(result);
    }
}
