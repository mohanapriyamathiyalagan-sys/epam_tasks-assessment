package org.epam.java8_features.biFunction;

import java.util.function.BiFunction;

public class BiFunctionInterface {
    public static void main(String[] args) {

//Bifunction - 2 input , 1 output
        //task1 - write a name and price using biFunctional interface
        BiFunction<String, Double, Product> products = (name, price)
                ->new Product(name, price, "Electronics", "B");

        Product product = products.apply("Laptop", 50000.00);
        System.out.println("Product created: "+product.name+" "+product.price);

        //task2 = total cost based on quantity of product
        BiFunction<Product, Integer, Double> calculateCost = (product1, qunatity)->
                product1.price*qunatity;

        double cost = calculateCost.apply(product,2);

        System.out.println("Total cost: "+cost);
    }
}
