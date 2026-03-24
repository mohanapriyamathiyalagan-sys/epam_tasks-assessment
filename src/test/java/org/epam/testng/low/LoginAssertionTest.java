package org.epam.testng.low;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginAssertionTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
    }

    @Test
    public void loginTest() {

        String actualTitle = driver.getTitle();
        String expectedTitle = "The Internet";

        Assert.assertEquals(actualTitle, expectedTitle);
        System.out.println("Title verified");

        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        String message = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("flash"))
        ).getText();

        Assert.assertTrue(message.contains("You logged into a secure area"));
        System.out.println("Login successful");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
