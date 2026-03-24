package core_java.hometask_basics.vehicle_management;

public class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }

    @Override
    public void service() {
        System.out.println("Car serviced");
    }
}
