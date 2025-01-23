package abstractDemo.prep;

public class Main {
    public static void main(String[] args) {
        System.out.println("Rahul , you are selected");

//        Shape s = new Square();
//        s.area();
//        s.draw();

        Shape.info();
        Square.info();

        Square c = new Square();

        c.draw();
        c.area();


    }
}
