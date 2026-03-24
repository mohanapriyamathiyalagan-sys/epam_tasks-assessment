package org.epam.design_patterns.builder_pattern;

public class Test {
    public static void main(String[] args) {
        Bicycle bicycle = new BicycleBuilder().setGears(true)
                .setDoubleStand(true)
                .setDoubleSeats(false)
                .setCarrier(true)
                .build();

        bicycle.showDetails();
    }
}
