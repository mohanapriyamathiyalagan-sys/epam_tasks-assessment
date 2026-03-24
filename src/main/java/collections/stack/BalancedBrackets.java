package collections.stack;

import org.checkerframework.checker.units.qual.C;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            boolean balance = true;
            String s = sc.next();
            Stack<Character> stack = new Stack<>();
            for(char ch : s.toCharArray()){
                if(ch=='('||ch=='{'||ch=='['){
                    stack.push(ch);
                }else{
                    if(stack.isEmpty()){
                        balance = false;
                        break;
                    }

                    char top = stack.pop();
                    if((ch==')'&& top!='(')||(ch==']'&& top!='[')||(ch=='{'&& top!='}')){
                        balance=false;
                        break;
                    }
                }
            }
            if(!stack.isEmpty())
                balance=false;
            System.out.println(balance);

        }
    }
}
