package org.epam.java8_features.streams;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateAPI {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate newYear = LocalDate.of(today.getYear()+1,1,1 );

        long days = ChronoUnit.DAYS.between(today, newYear);
        System.out.println(days);
    }
}
