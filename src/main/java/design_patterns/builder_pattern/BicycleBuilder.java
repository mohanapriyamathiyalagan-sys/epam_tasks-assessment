package org.epam.design_patterns.builder_pattern;

public class BicycleBuilder {
    boolean gears;
    boolean doubleStand;
    boolean doubleSeats;
    boolean carrier;

    public BicycleBuilder setGears(boolean gears) {
        this.gears = gears;
        return this;
    }

    public BicycleBuilder setDoubleStand(boolean doubleStand) {
        this.doubleStand = doubleStand;
        return this;
    }

    public BicycleBuilder setDoubleSeats(boolean doubleSeats) {
        this.doubleSeats = doubleSeats;
        return this;
    }

    public BicycleBuilder setCarrier(boolean carrier) {
        this.carrier = carrier;
        return this;
    }

    public Bicycle build(){
        return new Bicycle(this);
    }
}
