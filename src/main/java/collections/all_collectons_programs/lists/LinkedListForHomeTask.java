package collections.all_collectons_programs.lists;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListForHomeTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();

        for(int i =0;i<n;i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);
    }
}
