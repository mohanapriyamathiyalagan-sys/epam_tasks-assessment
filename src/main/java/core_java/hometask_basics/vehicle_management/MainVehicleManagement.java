package core_java.hometask_basics.vehicle_management;

import core_java.hometask_basics.pizza_hut.MainPizzaHut;
import core_java.util.LoggerUtil;

import java.io.IOException;
import java.util.logging.Logger;

public class MainVehicleManagement {
    private static final Logger logger = Logger.getLogger(MainVehicleManagement.class.getName());

    public static void main(String[] args) throws IOException {
        LoggerUtil.setLoggerCapabilities(logger);
        logger.info("Here we are implemented the logic for Vehicle Management: ");
        Vehicle v1 = new Car();
        Vehicle v2 = new Truck();
        Vehicle v3 = new MotorCycle();

        v1.start();
        v1.service();
        v1.stop();

        v2.start();
        v2.service();
        v2.stop();

        v3.start();
        v3.service();
        v3.stop();
    }
}
