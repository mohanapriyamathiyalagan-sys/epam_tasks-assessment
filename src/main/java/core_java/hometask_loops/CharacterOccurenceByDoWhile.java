package core_java.hometask_loops;

import core_java.hometask_languageConstructs.Main;
import core_java.util.LoggerUtil;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;

public class CharacterOccurenceByDoWhile {
    private static final Logger logger = Logger.getLogger(CharacterOccurenceByDoWhile.class.getName());

    public static void main(String[] args) throws IOException {
        LoggerUtil.setLoggerCapabilities(logger);
        logger.info("Here we are implemented the logic for Character occurence: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine().toLowerCase();

        System.out.println("Enter the character:");
        char ch = sc.next().toLowerCase().charAt(0);
        int i =0;
        int count =0;

        do{
            if(str.charAt(i)==ch) {
                count++;

            }
            i++;

        }while(i<str.length());

        System.out.println(ch+" : "+count);
    }
}
