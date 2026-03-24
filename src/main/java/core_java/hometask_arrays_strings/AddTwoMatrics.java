package core_java.hometask_arrays_strings;

import core_java.util.LoggerUtil;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;

public class AddTwoMatrics {

    private static final Logger logger = Logger.getLogger(AddTwoMatrics.class.getName());

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        int[][] sum = new int[2][2];
        LoggerUtil.setLoggerCapabilities(logger);


        logger.info("Here we are implemented the Add Two Matrics");


        System.out.println("Enter the first matrix: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = sc.nextInt();
                logger.fine("Checking value at [" + i + "][" + j + "]");

                if (a[i][j] < 0) {
                    logger.warning("Negative value detected: " + a[i][j]);
                }

            }
        }
        System.out.println("Enter the second matrix: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                b[i][j] = sc.nextInt();
                logger.fine("Checking value at [" + i + "][" + j + "]");

                if (b[i][j] < 0) {
                    logger.warning("Negative value detected: " + b[i][j]);
                }
            }
        }

        try {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    sum[i][j] = a[i][j] + b[i][j];
                    System.out.print(sum[i][j] + " ");

                }
                System.out.println();
            }
        } catch (Exception e) {

            logger.severe("Error occurred during matrix addition: " + e.getMessage());

        }
    }
}
