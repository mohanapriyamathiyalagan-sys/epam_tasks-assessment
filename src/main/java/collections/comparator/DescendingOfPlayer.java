package collections.comparator;

import java.util.Arrays;
import java.util.Scanner;

public class DescendingOfPlayer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of players: ");
        int n = sc.nextInt();

        Player[] players = new Player[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the name and score: ");
            String name = sc.next();
            int score = sc.nextInt();

            players[i]= new Player(name, score);
        }
        Arrays.sort(players, new CheckerUsingComparator());
        System.out.println("\n Sorted Players: ");
        for(Player p : players){
            System.out.println(p.name+" : "+p.score);
        }

    }
}
