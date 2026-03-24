package core_java.hometask_basics.vehicle_management;

public class MotorCycle implements Vehicle{
    @Override
    public void start() {
        System.out.println("Motorcycle Started");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle Stopped");
    }

    @Override
    public void service() {
        System.out.println("Motorcycle Serviced");
    }
}
