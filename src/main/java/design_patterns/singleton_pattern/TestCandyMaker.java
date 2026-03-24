package org.epam.design_patterns.singleton_pattern;

public class TestCandyMaker {
    public static void main(String[] args) {
        CandyMaker cm1 = CandyMaker.getInstance();
        CandyMaker cm2 = CandyMaker.getInstance();

        System.out.println(cm1==cm2);
        cm1.fill();
        cm1.boil();
        cm1.drain();
    }
}
