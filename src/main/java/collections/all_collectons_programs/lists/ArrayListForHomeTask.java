package collections.all_collectons_programs.lists;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListForHomeTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();

        for(int i=0;i<n;i++) {
            list.add(sc.next());
        }
        System.out.println(list);



    }
}
