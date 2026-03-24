package org.epam.bdd_cucumber.task3.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/task3",
        glue = "org.epam.bdd_cucumber.task3.stepdefinitions",
        plugin = {"pretty"},
        tags = ""
)
public class TestRunner extends AbstractTestNGCucumberTests{
}
