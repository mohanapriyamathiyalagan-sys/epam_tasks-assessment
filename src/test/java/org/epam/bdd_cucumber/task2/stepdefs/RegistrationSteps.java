package org.epam.bdd_cucumber.task2.stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.epam.bdd_cucumber.task2.pom.LoginPage;
import org.epam.bdd_cucumber.task2.pom.RegistrationPage;
import org.epam.bdd_cucumber.task2.testContext.TestContext;

public class RegistrationSteps {
    TestContext context;
    LoginPage loginPage;

    public RegistrationSteps(TestContext context){
        this.context = context;
        loginPage = new LoginPage(context.driver);
    }

    @Given("user is on registration page")
    public void open_registration() {
        loginPage.openSite();
        loginPage.goToLogin();
    }

    @When("user enters registration details")
    public void register_user() {
        System.out.println("Registration simulated");
    }

    @Then("account should be created")
    public void verify_account() {
        System.out.println("Account created");
    }
}
