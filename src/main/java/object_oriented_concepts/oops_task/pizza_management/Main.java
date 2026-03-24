package object_oriented_concepts.oops_task.pizza_management;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("Standard");
        pizza.addToppings("Tomato");
        pizza.addToppings("Corn");

        System.out.println("Total Cost: "+pizza.calculateCost());
    }
}
