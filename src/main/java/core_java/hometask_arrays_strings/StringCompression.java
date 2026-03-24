package core_java.hometask_arrays_strings;

import core_java.util.LoggerUtil;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;

public class StringCompression {
    private static final Logger logger = Logger.getLogger(StringCompression.class.getName());
    public static void main(String[] args) throws IOException {
        LoggerUtil.setLoggerCapabilities(logger);
        logger.info("Here we are implemented String Compression: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine().toLowerCase();
        int count = 1;
        String result ="";

        for(int i=1;i<str.length();i++){

            if(str.charAt(i)==str.charAt(i-1)){
                count++;
            }else{
                result = result+str.charAt(i-1)+count;
                count=1;
            }
        }
        result = result+str.charAt(str.length()-1)+count;
        System.out.println(result);
    }
}
