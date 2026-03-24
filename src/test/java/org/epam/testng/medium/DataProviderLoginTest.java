package org.epam.testng.medium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class DataProviderLoginTest {
    ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    ThreadLocal<WebDriverWait> wait = new ThreadLocal<>();

    @BeforeMethod
    public void setup() {
        WebDriver wd = new ChromeDriver();
        driver.set(wd);

        wd.manage().window().maximize();
        wd.get("https://the-internet.herokuapp.com/login");

        wait.set(new WebDriverWait(wd, Duration.ofSeconds(10)));
    }

    @Test(dataProvider = "loginData")
    public void loginTest(String username, String password, String expectedResult) {

        driver.get().findElement(By.id("username")).sendKeys(username);
        driver.get().findElement(By.id("password")).sendKeys(password);
        driver.get().findElement(By.cssSelector("button[type='submit']")).click();

        String message = wait.get()
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("flash")))
                .getText();

        if (expectedResult.equalsIgnoreCase("valid")) {
            Assert.assertTrue(message.contains("You logged into a secure area!"));
        } else {
            Assert.assertTrue(message.contains("Your username is invalid!"));
        }
    }

    @DataProvider(name = "loginData", parallel = true)
    public Object[][] getData() {
        return new Object[][]{
                {"tomsmith", "SuperSecretPassword!", "valid"},
                {"wronguser", "wrongpass", "invalid"}
        };
    }

    @AfterMethod
    public void tearDown() {
        driver.get().quit();
    }
}
