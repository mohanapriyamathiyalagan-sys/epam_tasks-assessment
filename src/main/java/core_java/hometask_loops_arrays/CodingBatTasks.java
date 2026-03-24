package core_java.hometask_loops_arrays;

import core_java.hometask_loops.ReverseString;
import core_java.util.LoggerUtil;

import java.io.IOException;
import java.util.logging.Logger;

public class CodingBatTasks {

    public static int makeChocolate(int big, int small, int goal){

        int bigUsed = Math.min(big, goal/5);
        int remaining = goal - (bigUsed*5);

        if(remaining<=small){
            return remaining;
        }else {
            return -1;
        }
    }
    public static boolean checkEqualspace(int a, int b, int c){
        int small = Math.min(a, Math.min(b,c));
        int large = Math.max(a, Math.max(b,c));

        int medium = a+b+c-small-large;
        return (medium-small) == (large-medium);


    }

    public static int blackJack(int a, int b) {
        if (a > 21 && b > 21) {
            return 0;
        }
        if (a > 21) {
            return b;
        }
        if (b > 21) {
            return a;
        }
        return Math.max(a, b);
    }

    public static boolean closeFar(int a, int b, int c){
        boolean bClose = Math.abs(a-b)<=1;
        boolean cClose = Math.abs(b-c)<=1;
        boolean bFar = Math.abs(a-b)>=2 && Math.abs(b-c)>=2;
        boolean cFar = Math.abs(a-c)>=2 && Math.abs(b-c)>=2;

        return (bClose && cFar)||(cClose && bFar);
    }


    public static int roundSum(int a, int b, int c){
        return round10(a) +round10(b) +round10(c);
    }

    public static int round10(int num){
        int remainder = num%10;
        if(remainder>=5){
            return num+(10-remainder);
        }else{
            return num - remainder;
        }

    }

    private static final Logger logger = Logger.getLogger(CodingBatTasks.class.getName());

    public static void main(String[] args) throws IOException {
        LoggerUtil.setLoggerCapabilities(logger);
        logger.info("Here we are implemented the logic for Coding bat tasks: ");
        System.out.println(makeChocolate(4,1,9));
        System.out.println(checkEqualspace(2,4,6));
        System.out.println(blackJack(19,21));
        System.out.println(closeFar(1,2,10));
        System.out.println(roundSum(16,17,18));
    }


}
