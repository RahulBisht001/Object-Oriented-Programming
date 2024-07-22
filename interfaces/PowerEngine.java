package interfaces;

public class PowerEngine implements Engine {
    @Override
    public void start() {
        System.out.println("It starts power engine");
    }

    @Override
    public void stop() {
        System.out.println("It stops power engine");
    }

    @Override
    public void acc() {
        System.out.println("It accelerate power engine");
    }
}
