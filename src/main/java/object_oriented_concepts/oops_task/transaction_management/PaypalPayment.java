package object_oriented_concepts.oops_task.transaction_management;

public class PaypalPayment extends PaymentMethod{
   String email;
   String password;

    public PaypalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    void processPayment(double amount) throws Exception {
        if(!validatePaymentDetails()){
            throw new InvalidPaymentDetailsException("Entered invalid email address.");
        }

        status = "Successful Transaction from Paypal Payment!: " +amount;

    }

    @Override
    boolean validatePaymentDetails() {
        return email.contains("@");
    }
}
