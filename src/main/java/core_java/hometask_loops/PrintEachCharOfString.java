package core_java.hometask_loops;

import core_java.util.LoggerUtil;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;

public class PrintEachCharOfString {
    private static final Logger logger = Logger.getLogger(PrintEachCharOfString.class.getName());

    public static void main(String[] args) throws IOException {
        LoggerUtil.setLoggerCapabilities(logger);
        logger.info("Here we are implemented the logic to print each character of string: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");

        String str = sc.next();
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }
}
