package collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GetPhoneNumberUsingNameByMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Map<String, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            String name = sc.next();
            int phoneNumber = sc.nextInt();
            map.put(name, phoneNumber);
        }
        while(sc.hasNext()){
            String query = sc.next();
            if(map.containsKey(query)){
                System.out.println(query+" = "+map.get(query));
            }else{
                System.out.println("Not Found");
            }
        }
    }
}
