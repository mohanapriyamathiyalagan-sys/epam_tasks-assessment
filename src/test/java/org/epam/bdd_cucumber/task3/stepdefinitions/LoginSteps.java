package org.epam.bdd_cucumber.task3.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.epam.bdd_cucumber.task3.pom.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {
    WebDriver driver;
    LoginPage loginPage;

    @Given("user is on login page")
    public void open_login_page() {

        driver = new ChromeDriver();

        loginPage = new LoginPage(driver);

        loginPage.openSite();
        loginPage.goToLoginPage();
    }

    @When("user enters valid email and password")
    public void valid_login() {

        loginPage.enterCredentials("valid@gmail.com", "valid123");
        loginPage.clickLogin();
    }

    @Then("user should be logged in")
    public void verify_login() {

        System.out.println("Login step executed successfully");

        driver.quit();
    }

    @When("user enters invalid email and password")
    public void invalid_login() {

        loginPage.enterCredentials("wrong@gmail.com", "wrong123");
        loginPage.clickLogin();
    }

    @Then("error message should be displayed")
    public void verify_error() {

        if(loginPage.isErrorDisplayed()){
            System.out.println("Error message displayed - PASS");
        } else {
            System.out.println("Error message NOT displayed - FAIL");
        }

        driver.quit();
    }
}
