package core_java.hometask_arrays_strings;

import core_java.util.LoggerUtil;

import java.util.Scanner;
import java.util.logging.Logger;

public class NumberPyramidPattern {
    private static final Logger logger = Logger.getLogger(NumberPyramidPattern.class.getName());

    public static void main(String[] args){

        try {
            LoggerUtil.setLoggerCapabilities(logger);

            Scanner sc = new Scanner(System.in);

            logger.info("Enter the number");
            int num = sc.nextInt();

            logger.fine("Input received successfully");

            for (int i = 1; i <= num; i++) {
                if (i < 0) {
                    logger.warning("Value of i should not be less than 0");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }

        } catch (Exception e) {
            logger.severe("Error during operation: "+e.getMessage());
        }

    }
}
