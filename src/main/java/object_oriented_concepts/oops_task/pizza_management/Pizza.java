package object_oriented_concepts.oops_task.pizza_management;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    String base;
    List<String> toppings = new ArrayList<>();

    public Pizza(String base) {
        this.base = base;
    }

    void addToppings(String topping){
        toppings.add(topping);
    }
    int calculateCost(){
        int cost =0;

        if(base.equals("Standard")){
            cost+=100;
        }else if(base.equals("Soft")){
            cost+=200;
        }

        for(String t: toppings){
            if(t.equals("Tomato")){
                cost+=20;
            }
            else if(t.equals("Corn")){
                cost+=25;
            }
            else if(t.equals("Mushroom")){
                cost+=35;
            }

        }
        return cost;
    }
}
