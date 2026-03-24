package core_java.hometask_arrays_strings;

import core_java.util.LoggerUtil;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;

public class VowelsAndConsonants {
    private static final Logger logger = Logger.getLogger(VowelsAndConsonants.class.getName());

    public static void main(String[] args) throws IOException {
        LoggerUtil.setLoggerCapabilities(logger);
        logger.info("Here we are implemented the logic for filtering Vowels and Consonants: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine().toLowerCase();

        int vowels =0;
        int consnants =0;

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z'){
                if(ch=='a'||ch=='e'||ch=='o'||ch=='u'||ch=='e'){
                    vowels++;
                }else{
                    consnants++;
                }
            }
        }
        System.out.println("Vowels: "+vowels);
        System.out.println("Consonants: "+consnants);

    }
}
