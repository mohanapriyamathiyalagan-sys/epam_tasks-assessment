package org.epam.bdd_cucumber.task2.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.epam.bdd_cucumber.task2.driverFactory.DriverFactory;
import org.epam.bdd_cucumber.task2.testContext.TestContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Hooks {
    TestContext context;

    public Hooks(TestContext context){
        this.context = context;
    }

    @Before
    public void setup(){
        context.driver = new ChromeDriver();
        context.driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        if(context.driver != null){
            context.driver.quit();   // safe close
        }
    }
}
