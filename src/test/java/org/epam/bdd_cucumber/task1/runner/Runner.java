package org.epam.bdd_cucumber.task1.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "org.epam.bdd_cucumber.task1.stepdefinitions",
        monochrome = true,
        plugin = {"pretty"}
)

public class Runner extends AbstractTestNGCucumberTests{
}
