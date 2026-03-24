package org.epam.bdd_cucumber.task2.stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.epam.bdd_cucumber.task2.pom.LoginPage;
import org.epam.bdd_cucumber.task2.testContext.TestContext;

public class LoginSteps {

    TestContext context;
    LoginPage loginPage;

    public LoginSteps(TestContext context){
        this.context = context;
        loginPage = new LoginPage(context.driver);
    }

    @Given("user is on login page")
    public void open_login_page() {
        loginPage.openSite();
        loginPage.goToLogin();
    }

    @When("user enters valid credentials")
    public void enter_valid() {
        loginPage.login();
    }

    @Then("user should be logged in")
    public void verify_login() {
        System.out.println("Login executed");
    }

    @Given("user is logged in")
    public void already_logged_in() {
        open_login_page();
        enter_valid();
    }

    @When("user clicks logout")
    public void logout() {
        loginPage.logout(); // now safe
    }

    @Then("user should be logged out")
    public void verify_logout() {
        System.out.println("Logout executed");
    }
}
