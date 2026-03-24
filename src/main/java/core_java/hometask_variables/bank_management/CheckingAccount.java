package core_java.hometask_variables.bank_management;

public class CheckingAccount extends Account {

    public CheckingAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public void transactionLimit(){
        System.out.println("Transaction limit 5 per day ");
    }
}
