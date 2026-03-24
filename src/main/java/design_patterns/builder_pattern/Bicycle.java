package org.epam.design_patterns.builder_pattern;

public class Bicycle {
    private final boolean gears;
    private final boolean doubleStand;
    private final boolean doubleSeats;
    private final boolean carrier;


    public Bicycle(BicycleBuilder  builder) {
        this.gears = builder.gears;
        this.doubleStand = builder.doubleStand;
        this.doubleSeats = builder.doubleSeats;
        this.carrier = builder.carrier;
    }

    public void showDetails(){
        System.out.println("Bicycle Configuration: ");
        System.out.println("Gears: "+gears);
        System.out.println("Double stand: "+doubleStand);
        System.out.println("Double seats: "+doubleSeats);
        System.out.println("Carrier: "+carrier);
    }
}
