package singleton;

public class Singleton {
    /**
     * This singleton class is used when we want to create just
     * one instance of the class.
     * <p>
     * basically, now with singleton class you are restricted to creating only
     * one object of that class
     * <p>
     * How we can achieve it.
     * you see how a new object of a class is created?
     * it is simple -> when we call the constructor of class,
     * so what if we restrict user it to call the constructor.
     */


    public String nationality;

    private Singleton() {
        this.nationality = "Indian";
    }

    private static Singleton instance;

    public static Singleton getInstance() {
        // check whether 1 an object is created or not
        if (instance == null)
            instance = new Singleton();

        return instance;
    }
}
