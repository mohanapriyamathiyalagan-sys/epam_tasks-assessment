package org.epam.java8_features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalStringFilterWithNotNullValues {
    public static void main(String[] args) {
        List<Optional<String>> optional = Arrays.asList(Optional.of("Jura"),
                Optional.empty(),
                Optional.of("Yira"),
                Optional.empty());

        List<String> list = optional.stream().filter(Optional::isPresent).map(Optional::get)
                .collect(Collectors.toList());

        System.out.println(list);

    }
}
