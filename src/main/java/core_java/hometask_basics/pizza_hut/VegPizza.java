package core_java.hometask_basics.pizza_hut;

public class VegPizza extends Pizza{

    public VegPizza(String size, String base) {
        super(size, base);
    }

    void toppings(){
        System.out.println("Toppings: corn, onion, maynoise, capsicum");
    }
}
