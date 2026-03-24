package core_java.hometask_basics.pizza_hut;

import core_java.hometask_arrays_strings.VowelsAndConsonants;
import core_java.util.LoggerUtil;

import java.io.IOException;
import java.util.logging.Logger;

public class MainPizzaHut {
    private static final Logger logger = Logger.getLogger(MainPizzaHut.class.getName());

    public static void main(String[] args) throws IOException {
        LoggerUtil.setLoggerCapabilities(logger);
        logger.info("Here we are implemented the logic for PizzaHut: ");
        VegPizza vegPizza = new VegPizza("Medium", "Thin Curst");
        vegPizza.showPizza();
        vegPizza.toppings();

        CheesePizza cheesePizza = new CheesePizza("Large", "Cheese Burst");
        cheesePizza.showPizza();
        cheesePizza.toppings();
    }
}
