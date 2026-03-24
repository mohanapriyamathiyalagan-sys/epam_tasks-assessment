package object_oriented_concepts.oops_task.transaction_management;

public class Main {
    public static void main(String[] args) throws Exception {
        PaymentProcessing paymentProcessor = new PaymentProcessing();

        PaymentMethod credit =new CreditCardPayment("4111111111111111", "12/25", "123");

        PaymentMethod paypal = new PaypalPayment("user@example.com", "securePassword123");

        PaymentMethod bank = new BankTransfer("1234567890", "Bank of Java");

        paymentProcessor.process(credit, 20000);
        paymentProcessor.process(paypal, 300000);
        paymentProcessor.process(bank, 9000);

        paymentProcessor.showHistory();
    }
}
