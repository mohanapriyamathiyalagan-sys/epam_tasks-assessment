package collections.all_collectons_programs.maps;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapForHomeTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.next();

        TreeMap<Character, Integer> map = new TreeMap<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
