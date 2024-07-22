package abstractDemo;

public abstract class Parent {
    long wealth;

    abstract void career(String name);

    abstract void partner(String name, int age);

    final static void hello() {
        System.out.println("Greeting from Abstract Parent Class");
    }

    void info() {
        System.out.println("This is a Concrete information method");
    }
}
