package object_oriented_concepts.oops_task.transaction_management;

public class BankTransfer extends PaymentMethod{

    String accountNumber;
    String bankName;

    public BankTransfer(String accountNumber, String bankName) {
        this.accountNumber = accountNumber;
        this.bankName = bankName;
    }

    @Override
    void processPayment(double amount) throws Exception {
        if(!validatePaymentDetails()){
            throw new InvalidPaymentDetailsException("Invalid bank account number");
        }

        status = "Successfully completed the transaction from Bank Transfer!: "+amount;

    }

    @Override
    boolean validatePaymentDetails() {
        return accountNumber.length()==10;
    }
}
