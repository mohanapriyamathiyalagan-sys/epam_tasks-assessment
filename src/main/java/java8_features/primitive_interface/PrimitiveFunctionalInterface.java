package org.epam.java8_features.primitive_interface;
import org.epam.java8_features.biFunction.Product;

import java.util.Random;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;


public class PrimitiveFunctionalInterface {
    public static void main(String[] args) {

        //task1 - find prime using predicate

        IntPredicate intPredicate = num->{
            if(num<=1) return false;
            for(int i =2;i<num;i++){
                if(num%i==0) return false;
            }
            return true;
        };

        System.out.println("isPrime?: "+intPredicate.test(7));

        //task2 - square the number using consumer
        IntConsumer intConsumer = num -> System.out.println("Square value: "+(num*num));
        intConsumer.accept(5);

        //task3 - print random num below 5000 using supplier
        IntSupplier intSupplier = ()-> new Random().nextInt(5000);
        System.out.println("Random number below 5000: "+intSupplier.getAsInt());


    }
}
