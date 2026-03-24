package org.epam.testng.high;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTest {

    int attempt = 0;

    @Test
    public void test1_pass() {
        System.out.println("Test 1 Passed");
        Assert.assertTrue(true);
    }

    @Test
    public void test2_fail() {
        System.out.println("Test 2 Failed");
        Assert.assertTrue(false);
    }

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void test3_passOnRetry() {

        attempt++;
        System.out.println("Test 3 Attempt: " + attempt);

        if (attempt == 1) {
            Assert.fail("Failing first time");
        }

        Assert.assertTrue(true);
    }
}
