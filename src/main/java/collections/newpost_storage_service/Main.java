package collections.newpost_storage_service;

import java.math.BigDecimal;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        NewPostOfficeStorage storage = new NewPostOfficeStorageImpl();

        Box b1 = new Box("A", "B", 5, 10, new BigDecimal("100"), "Chennai", 1);
        Box b2 = new Box("C", "D", 2, 5, new BigDecimal("200"), "Mumbai", 2);
        Box b3 = new Box("E", "F", 8, 15, new BigDecimal("300"), "Delhi", 3);

        storage.acceptBox(b1);
        storage.acceptBox(b2);
        storage.acceptBox(b3);

        System.out.println("Weight < 6:");
        System.out.println(storage.getAllWeightLessThan(6));

        System.out.println("Cost > 150:");
        System.out.println(storage.getAllCostGreaterThan(new BigDecimal("150")));

        Predicate<Box> heavy = new Predicate<Box>() {
            public boolean test(Box b) {
                return b.getWeight() > 5;
            }
        };

        System.out.println("Removed:");
        System.out.println(storage.carryOutBoxes(heavy));
    }

}
