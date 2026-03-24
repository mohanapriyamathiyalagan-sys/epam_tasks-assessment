package org.epam.testng.low;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://google.com");
    }

    @Test
    public void verifyTitle() {
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Google"));
        System.out.println("Title verified");
    }

    @Test
    public void verifyPageLoaded() {
        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains("google"));
        System.out.println("Page loaded successfully");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
