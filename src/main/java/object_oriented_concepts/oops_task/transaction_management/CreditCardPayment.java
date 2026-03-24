package object_oriented_concepts.oops_task.transaction_management;

public class CreditCardPayment extends PaymentMethod{
    String cardNumber;
    String expiryDate;
    String cvv;

    public CreditCardPayment(String cardNumber, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    @Override
    void processPayment(double amount) throws Exception {
        if(!validatePaymentDetails()){
            throw new InvalidPaymentDetailsException("Entered invalid credit card details");
        }

        status = "Successfully completed with credit card payment!: "+amount;
    }

    @Override
    boolean validatePaymentDetails() {
        return cardNumber.length() ==16 && cvv.length()==3;
    }
}
