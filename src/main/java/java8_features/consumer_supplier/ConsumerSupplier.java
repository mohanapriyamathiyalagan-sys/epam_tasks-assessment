package org.epam.java8_features.consumer_supplier;
import org.epam.java8_features.predicates.Product;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

//consumer = takes input -> performs operation -> returns nothing - is a functional Interface that accepts an input
//and performs an operation without returning any result.
//supplier = takes no input -> returns a value

public class ConsumerSupplier {
    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
                new Product("laptop", 1500, "Electronics", "A"),
                new Product("Mobile", 800, "Electronics", "B"),
                new Product("TV", 10000, "Electronics", "C")
        );

        //task1 - print all the products
        Consumer<Product> priceProducts = p-> System.out.println(p);
        products.forEach(priceProducts);

        //task2 - price >1000, grade should be update as premium

        Consumer<Product> gradeUpgrade = p->{
            if(p.price>1000){
                p.grade="Premium";
            }
        };

        products.forEach(gradeUpgrade);
        System.out.println("\n Premium as grade for price greater than 1000 products");
        products.forEach(priceProducts);

        //task3 - price>3000, mark the name as *
        Consumer<Product> addPremiumSymbol = p->{
            if(p.price>3000){
                p.name = p.name+"*";
            }
        };

        products.forEach(addPremiumSymbol);
        System.out.println("\n Add premium symbol for the products which is greater than 3000");
        products.forEach(priceProducts);


        //task4 - print with * and premium products
        System.out.println("\n Print all the products");
        products.stream().filter(p->p.grade.equals("Premium")&& p.name.contains("*"))
                .forEach(priceProducts);


        //task1 - random product from supplier

        Supplier<Product> randomProduct = ()-> new Product
                ("Random product", 500, "Electronics", "B");

        System.out.println("\n Random products: "+randomProduct.get());

        //task2 - random OTP
        Supplier<Integer> randomOTP = ()-> new Random().nextInt(9000)+1000;

        System.out.println("\n Random OTP: "+randomOTP.get());



    }
}
