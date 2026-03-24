package org.epam.java8_features.functional_interface;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionalInterface {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", 1500, "Electronics", "A"),
                new Product("Mobile", 800, "Electronics", "B"),
                new Product("Tv", 10000, "Electronics", "C"),
                new Product("Chair", 90, "Furniture", "D")
        );

// Functional Interface - having only one abstract method.
        //task1 - calculate the cost of all the products
        Function<List<Product>, Integer> totalCost = list->list.stream()
                .mapToInt(p->p.price).sum();

        System.out.println("Total cost of products: "+totalCost.apply(products));


        //task2 - products > 1000
        Function<List<Product>, Integer> greaterPrice = list->list.stream()
                .filter(p->p.price>1000).mapToInt(p->p.price).sum();

        System.out.println("Products greater than 1000: "+greaterPrice.apply(products));


        //task3 - cost of electronics products
        Function<List<Product>, Integer> electronicProducts = list->list.stream()
                .filter(p->p.category.equals("Electronics")).mapToInt(p->p.price)
                .sum();

        System.out.println("Cost of electronics products "+electronicProducts.apply(products));


        //task4 - price >1000 and category equals to Electronic
        Function<List<Product>, List<Product>> filterProducts = list->list.stream()
                .filter(p->p.price>1000 && p.category.equals("Electronics"))
                        .collect(Collectors.toList());

        System.out.println("Price >1000 and category equals to Electronic: ");
        filterProducts.apply(products).forEach(System.out::println);

    }
}
