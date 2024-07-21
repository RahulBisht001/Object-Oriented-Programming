package properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Square square = new Square();
        square.area();

//        shape.area();
//        circle.area();
//        triangle.area();
//        square.area();

//        Shapes sq1 = new Square();
//        sq1.area();

//        Shapes cr1 = new Circle();
//        cr1.area();

        Volume v1 = new Cube();
        Cube.volume();

    }
}
