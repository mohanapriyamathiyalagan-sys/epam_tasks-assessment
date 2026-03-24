package object_oriented_concepts.oops_task.boutique_management;

import java.util.ArrayList;
import java.util.List;

public class Boutique {
    List<String> flowers = new ArrayList<>();

    void addFlowers(String flower){
        flowers.add(flower);
    }

    int calculateCost(){
        int cost =0;

        for(String f:flowers){
            if(f.equals("Rose")){
                cost+=1;
            }else if(f.equals("Jasmine")){
                cost+=2;
            }else if(f.equals("Lily")){
                cost+=3;
            }
        }

         return cost;
    }

    public static void main(String[] args) {
        Boutique boutique = new Boutique();
        boutique.addFlowers("Rose");
        boutique.addFlowers("Jasmine");
        boutique.addFlowers("Lily");
        System.out.println("Total cost of flowers : "+"$"+boutique.calculateCost());
    }


}
