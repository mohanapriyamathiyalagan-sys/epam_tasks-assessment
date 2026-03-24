package org.epam.java8_features.predicates;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicatesFeature {

    public static void main(String[] args) {
        List<Product> listOfProducts = Arrays.asList(
                new Product("Laptop", 1500, "Electronics", "A"),
        new Product("Mobile", 800, "Electronics", "B"),
        new Product("TV", 10000, "Electronics", "C"),
        new Product("HeadPhones", 70, "Electronics", "D"),
                new Product("Chair", 90, "Furniture", "E"));


        List<Response> listOfResponses = Arrays.asList(
                new Response("Success", 200, "JSON"),
                new Response("Fail", 400, "JSON"),
                new Response("Error", 500, "XML"),
                new Response("Bad Request", 400, "XML"));

        // predicate - Functional Interface used to check the condition and return true or false.
        //task 1 - filter price>1000
        Predicate<Product> priceGreater = p -> p.price>1000;
        System.out.println("Products greaterthan 1000: ");
        listOfProducts.stream().filter(priceGreater).forEach(System.out::println);

        //task 2 - filter electronics items
        Predicate<Product> electronics = e->e.category.equals("Electronics");
        System.out.println("\nElectronics: ");
        listOfProducts.stream().filter(electronics).forEach(System.out::println);

        //task 3 - print price>100 and electronics items
        System.out.println("\n Price>100 and electronics items ");
        listOfProducts.stream().filter(items->items.price>100 && items.category.equals("Electronics"))
                .forEach(System.out::println);

        //task 4 - print price>100 or electronics items
        System.out.println("\n Price>100 or electronics items");
        listOfProducts.stream().filter(items->items.price>100 || items.category.equals("Electronics"))
                .forEach(System.out::println);

        //task 5 - print price<100 and electronics items
        System.out.println("\n Print price<100 and electronics items");
        listOfProducts.stream().filter(items->items.price<100 && items.category.equals("Electronics"))
                .forEach(System.out::println);


        //task6 - Check the status code 400
        Predicate<Response> statusCode = r -> r.statusCode==400;
        System.out.println("Status code 400: ");
        listOfResponses.stream().filter(statusCode).forEach(System.out::println);

        //task7 - Check the ResponseType
        Predicate<Response> responseType = r->r.responseType.equals("JSON");
        System.out.println("Response Type: ");
        listOfResponses.stream().filter(responseType).forEach(System.out::println);

        //task8 - status code 400 and response type JSON
        System.out.println("\n Status code 400 and response type JSON");
        listOfResponses.stream().filter(response ->response.statusCode==400 && response.responseType.equals("JSON"))
                .forEach(System.out::println);

        //task9 - status code 400 or response type JSON
        System.out.println("\n Status code 400 or response type JSON");
        listOfResponses.stream().filter(response ->response.statusCode==400 || response.responseType.equals("JSON"))
                .forEach(System.out::println);


        //task10 - status code 400 not response type JSON
        System.out.println("\n Status code 400 not response type JSON");
        listOfResponses.stream().filter(response ->response.statusCode!=400 && response.responseType.equals("JSON"))
                .forEach(System.out::println);







    }
}
