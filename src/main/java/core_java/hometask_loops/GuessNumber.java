package core_java.hometask_loops;

import core_java.util.LoggerUtil;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Logger;

public class GuessNumber {
    private static final Logger logger = Logger.getLogger(GuessNumber.class.getName());

    public static void main(String[] args) throws IOException {
        LoggerUtil.setLoggerCapabilities(logger);
        logger.info("Here we are implemented the logic for Guess the Number: ");
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int number = r.nextInt(100)+1;
        int guess = 0;
        int tries = 5;
        int count =0;

        do{
            System.out.println("Enter the guess number: ");
             guess = sc.nextInt();
            if(guess>number){
                System.out.println("Too High");
            }else if(guess<number){
                System.out.println("Too Low");
            }else{
                System.out.println("Correct number!");
                break;

            }

        }while(count<tries);

        while(guess!=number){
            System.out.println("Game over. Number was "+number);
        }

    }
}
