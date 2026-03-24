package org.epam.bdd_cucumber.task1.pom;

public class ATM {
    private Account account;
    private int dispensedAmount;

    public ATM(Account account) {
        this.account = account;
    }

    public void withdraw(int amount) {

        if (account.getBalance() >= amount) {
            account.deduct(amount);
            dispensedAmount = amount;
        } else {
            dispensedAmount = 0;
        }
    }

    public int getDispensedAmount() {
        return dispensedAmount;
    }
}
