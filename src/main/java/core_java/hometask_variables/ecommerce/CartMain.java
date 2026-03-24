package core_java.hometask_variables.ecommerce;

import core_java.hometask_basics.pizza_hut.MainPizzaHut;
import core_java.util.LoggerUtil;

import java.io.IOException;
import java.util.logging.Logger;

public class CartMain {
    private static final Logger logger = Logger.getLogger(CartMain.class.getName());

    public static void main(String[] args) throws IOException {
        LoggerUtil.setLoggerCapabilities(logger);
        logger.info("Here we are implemented the logic for ecommerce: ");
        Product p1 = new Product(10, 500, 1);
        Product p2 = new Product(12, 1000, 2);

        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.calculateTotal();
        cart.removeProduct(1);
        cart.calculateTotal();
    }
}
