package object_oriented_concepts.oops_task.transaction_management;

public class InvalidPaymentDetailsException extends Exception {
    public InvalidPaymentDetailsException(String message) {
        super(message);
    }
}
