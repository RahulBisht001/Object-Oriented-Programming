package interfaces;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//
//        car.start();
//        int num = car.a;

//        Engine car2 = new Car();
//        System.out.println(car2.PRICE);
//
//        Media carMedia = new Car();
//        carMedia.start();

        Media.working();

        Media car_M =  new Car();

        NiceCar nc = new NiceCar();
        nc.start();
    }
}

