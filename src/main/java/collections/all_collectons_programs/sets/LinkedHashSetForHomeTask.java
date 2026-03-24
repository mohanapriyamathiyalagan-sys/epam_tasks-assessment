package collections.all_collectons_programs.sets;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class LinkedHashSetForHomeTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        LinkedHashSet<String> set = new LinkedHashSet<>();
        for(int i=0;i<n;i++){
            set.add(sc.next());
        }

        System.out.println(set);
    }
}
