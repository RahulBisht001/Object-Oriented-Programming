package interfaces;

public class Car implements Brake {

    final static int a = 23;

    @Override
    public void brake() {
        System.out.println("It brakes like a normal car");
    }


}
