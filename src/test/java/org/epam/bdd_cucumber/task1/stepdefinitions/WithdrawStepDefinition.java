package org.epam.bdd_cucumber.task1.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.epam.bdd_cucumber.task1.pom.ATM;
import org.epam.bdd_cucumber.task1.pom.Account;
import org.testng.Assert;

public class WithdrawStepDefinition {

    Account account;
    ATM atm;

    @Given("I have a balance of {int} in my account")
    public void i_have_balance(int balance) {
        account = new Account(balance);
        atm = new ATM(account);
    }

    @When("I request {int}")
    public void i_request(int amount) {
        atm.withdraw(amount);
    }

    @Then("{int} should be dispensed")
    public void should_be_dispensed(int expected) {
        Assert.assertEquals(atm.getDispensedAmount(), expected);
    }
}
