package core_java.hometask_variables.bank_management;

import core_java.hometask_loops_arrays.CodingBatTasks;
import core_java.util.LoggerUtil;

import java.io.IOException;
import java.util.logging.Logger;

public class MainBank {
    private static final Logger logger = Logger.getLogger(MainBank.class.getName());

    public static void main(String[] args) throws IOException {
        LoggerUtil.setLoggerCapabilities(logger);
        logger.info("Here we are implemented the logic for bank Management: ");
        SavingsAccount s = new SavingsAccount(2997, 500000.00);
        s.bankDeposit(200000.00);
        s.bankWithdraw(300000.00);
        s.checkBalance();
        s.interestCalculations();

        CheckingAccount c = new CheckingAccount(0424, 500000.00);
        c.bankDeposit(30000);
        c.bankWithdraw(20000);
        c.checkBalance();
        c.transactionLimit();

    }
}
