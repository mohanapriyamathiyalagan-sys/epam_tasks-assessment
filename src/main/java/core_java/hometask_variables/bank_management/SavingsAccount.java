package core_java.hometask_variables.bank_management;

public class SavingsAccount extends Account {


    public SavingsAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }



    public void interestCalculations(){
        balance= balance*0.08;
        System.out.println(balance);
    }
}
