package collections.all_collectons_programs.sets;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetForHomeTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashSet<String> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(sc.next());
        }
        System.out.println(set);
    }
}
