package object_oriented_concepts.oops_task.transaction_management;

abstract class PaymentMethod {
    String status = "Pending";
    abstract void processPayment(double amount) throws Exception;
    abstract boolean validatePaymentDetails();
    String getPaymentDetails(){
        return status;
    }
}
