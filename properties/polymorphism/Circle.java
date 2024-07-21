package properties.polymorphism;

public class Circle extends Shapes {

    /**
     * This will run when the object of circle class
     * is created, hence it is overriding the parent
     * method
     * <p>
     * e.g.: Shapes circle = new Circle();
     */

//    @Override
    // this is called Annotation
    void area() {
        System.out.println("Area is pi* r * r");
    }
}
