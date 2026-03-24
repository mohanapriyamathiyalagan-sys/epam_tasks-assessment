package org.epam.testng.medium;

import org.testng.annotations.Test;

public class TestNGGroups {
    @Test(groups = {"Smoke", "Regression", "Functional"})
    public void testCase1() {
        System.out.println("Test Case 1 - Smoke, Regression, Functional");
    }

    @Test(groups = {"Smoke", "Regression"})
    public void testCase2() {
        System.out.println("Test Case 2 - Smoke, Regression");
    }

    @Test(groups = {"Smoke", "Functional"})
    public void testCase3() {
        System.out.println("Test Case 3 - Smoke, Functional");
    }

    @Test(groups = {"Regression", "Functional"})
    public void testCase4() {
        System.out.println("Test Case 4 - Regression, Functional");
    }

    @Test(groups = {"Smoke"})
    public void testCase5() {
        System.out.println("Test Case 5 - Smoke");
    }

    @Test(groups = {"Regression"})
    public void testCase6() {
        System.out.println("Test Case 6 - Regression");
    }

    @Test(groups = {"Functional"})
    public void testCase7() {
        System.out.println("Test Case 7 - Functional");
    }
}
