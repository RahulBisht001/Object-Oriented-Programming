package interfaces;

public class ElectricEngine implements Engine {

    @Override
    public void start() {
        System.out.println("It starts electric engine");
    }

    @Override
    public void stop() {
        System.out.println("It stops electric engine");
    }

    @Override
    public void acc() {
        System.out.println("It accelerate electric engine");
    }
}
