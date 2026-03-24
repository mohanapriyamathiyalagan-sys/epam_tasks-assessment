package org.epam.java8_features.date_time;

import java.time.*;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DateAndTime {
    public static void main(String[] args) {
        //task1 - check yesterday
        Predicate<LocalDate> checkYesterday = d->d.equals(LocalDate.now()
                .minusDays(1));
        System.out.println(LocalDate.now().minusDays(1));

        //task2 - next thursday
        Supplier<LocalDate> nextThursday =
                ()->LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
        System.out.println(nextThursday.get());

        //task3 - zonetime
        Supplier<ZonedDateTime> estTime=
                ()->ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(estTime.get());

        //task4
        Function<LocalDate, Integer> localDate =
                d-> Period.between(d, LocalDate.now()).getYears();
        System.out.println(localDate.apply(LocalDate.of(1997,9,29)));

    }
}
