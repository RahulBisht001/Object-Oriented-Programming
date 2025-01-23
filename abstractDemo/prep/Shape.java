package abstractDemo.prep;

public abstract class Shape {

    Shape(){
        System.out.println("Shape constructor called");
    }

    abstract void area();
    abstract void draw();

    final static void info(){
        System.out.println("This is info method in Shape abstract class");
    }
}
