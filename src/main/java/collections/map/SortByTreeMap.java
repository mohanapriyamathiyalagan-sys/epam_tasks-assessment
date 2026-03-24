package collections.map;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SortByTreeMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t--> 0){
            int q = sc.nextInt();
            TreeMap<Integer, Integer> map = new TreeMap<>();
            for(int i=0;i<q;i++){
                char ch = sc.next().charAt(0);
                if(ch == 'a'){
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    map.put(x,y);
                }else if(ch == 'b'){
                    int x = sc.nextInt();
                    if(map.containsKey(x)){
                        System.out.print(map.get(x)+" ");
                    }else{
                        System.out.print("-1");
                    }
                }else if(ch =='c'){
                    System.out.print(map.size()+" ");
                }else if(ch == 'd'){
                    int x = sc.nextInt();
                    System.out.println(map.remove(x));
                }else if(ch=='e'){
                    for(Map.Entry<Integer, Integer> entry:map.entrySet()){
                        System.out.println(entry.getKey()+ " "+ entry.getValue());
                    }
                }
            }
            System.out.println();
        }
    }
}
