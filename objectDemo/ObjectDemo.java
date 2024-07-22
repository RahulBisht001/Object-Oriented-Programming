package objectDemo;

public class ObjectDemo extends Object {
    public ObjectDemo() {
        super();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    // Overridden toString() method
    @Override
    public String toString() {
        return getClass().getName() + "@" + "RahulB";
    }

    public static void main(String[] args) {

        /**
         * Nice Course on Object-Oriented Programming
         */


        ObjectDemo obj = new ObjectDemo();

        System.out.println(obj);
        System.out.println(obj instanceof ObjectDemo);

    }
}
