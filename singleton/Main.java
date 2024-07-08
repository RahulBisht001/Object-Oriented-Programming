package singleton;

public class Main {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();

        // here all three reference variables are pointing to the
        // same object in the heap.

        System.out.println(obj1.nationality);

    }
}
