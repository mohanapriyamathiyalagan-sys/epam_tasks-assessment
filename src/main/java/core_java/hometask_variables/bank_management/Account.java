package core_java.hometask_variables.bank_management;

abstract class Account {

 int accountNumber;
 double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void bankDeposit(double amount){
        balance = balance+amount;
        System.out.println("Deposited amount: "+balance);
    }
    public void bankWithdraw(double amount){
        if(balance>=amount){
            balance=balance-amount;
            System.out.println("Withdrawal amount: "+balance);
        }else{
            System.out.println("Insufficient balance: ");
        }
    }

    public void checkBalance(){
        System.out.println(balance);
    }

}
