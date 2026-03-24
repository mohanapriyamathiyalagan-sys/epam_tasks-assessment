package object_oriented_concepts.oops_task.transaction_management;

import java.util.ArrayList;
import java.util.List;

public class PaymentProcessing {
    List<String> history = new ArrayList<>();

    void process(PaymentMethod paymentMethod, double amount) throws Exception {
        try {
            if (amount < 10000)
                throw new InsufficientFundsException("InSufficient balance please check!");
            paymentMethod.processPayment(amount);

            String result = paymentMethod.getPaymentDetails();
            history.add(result);
            System.out.println(result);
        } catch (Exception e) {
            history.add(e.getMessage());

            System.out.println(e.getMessage());
        }
    }

        void showHistory(){
            System.out.println("Transaction History: ");
            for(String h : history){
                System.out.println(h);
            }


    }
}
