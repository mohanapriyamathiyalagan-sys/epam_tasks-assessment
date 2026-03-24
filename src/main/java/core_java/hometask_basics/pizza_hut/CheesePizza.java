package core_java.hometask_basics.pizza_hut;

public class CheesePizza extends Pizza{
    public CheesePizza(String size, String base) {
        super(size, base);
    }

    void toppings(){
        System.out.println("Toppings: extra cheese");
    }
}
