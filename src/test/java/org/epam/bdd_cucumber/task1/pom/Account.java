package org.epam.bdd_cucumber.task1.pom;

public class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void deduct(int amount) {
        this.balance -= amount;
    }
}
