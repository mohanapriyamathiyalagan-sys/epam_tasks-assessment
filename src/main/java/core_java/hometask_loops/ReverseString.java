package core_java.hometask_loops;

import core_java.util.LoggerUtil;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;

public class ReverseString {
    private static final Logger logger = Logger.getLogger(ReverseString.class.getName());

    public static void main(String[] args) throws IOException {
        LoggerUtil.setLoggerCapabilities(logger);
        logger.info("Here we are implemented the logic for reverse string: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.next();
        String rev = "";

        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        System.out.println(rev);
    }
}

