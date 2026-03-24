package collections.all_collectons_programs.sets;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetForHomeTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0;i<n;i++){
            set.add(sc.nextInt());
        }
        System.out.println(set);
    }
}
