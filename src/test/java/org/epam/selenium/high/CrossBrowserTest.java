package org.epam.selenium.high;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class CrossBrowserTest {

    WebDriver driver;

    @Parameters("browser")
    @BeforeMethod
    public void setUp(String browser) {

        System.out.println("Launching: " + browser);

        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();

        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        }

        driver.manage().window().maximize();
    }

    @Test
    public void loginTest() {

        driver.get("https://the-internet.herokuapp.com/login");

        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        String msg = driver.findElement(By.id("flash")).getText();
        System.out.println("Login message: " + msg);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
        System.out.println("Browser closed");
    }
}