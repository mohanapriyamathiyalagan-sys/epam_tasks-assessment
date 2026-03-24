package org.epam.bdd_cucumber.task2.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/task2",
        glue = {
                "org.epam.bdd_cucumber.task2.stepdefs",
                "org.epam.bdd_cucumber.task2.hooks"
        },
        plugin = {"pretty"},
        monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
