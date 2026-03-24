package org.epam.selenium.low;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/login");

        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        String successMsg = driver.findElement(By.id("flash")).getText();
        System.out.println("Valid Login Message: " + successMsg);

        if (successMsg.contains("You logged into a secure area!")) {
            System.out.println("Login Successful");
        }


        driver.findElement(By.linkText("Logout")).click();

        driver.findElement(By.id("username")).sendKeys("wrong");
        driver.findElement(By.id("password")).sendKeys("wrong");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        String errorMsg = driver.findElement(By.id("flash")).getText();
        System.out.println("Invalid Login Message: " + errorMsg);

        if (errorMsg.contains("Your username is invalid!")) {
            System.out.println("Invalid Login Verified");
        }

        driver.quit();
    }
}