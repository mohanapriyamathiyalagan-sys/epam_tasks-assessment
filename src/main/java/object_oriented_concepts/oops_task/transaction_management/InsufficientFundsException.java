package object_oriented_concepts.oops_task.transaction_management;

public class InsufficientFundsException extends Exception{

    public InsufficientFundsException(String message) {
        super(message);
    }
}
