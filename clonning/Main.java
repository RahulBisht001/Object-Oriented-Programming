package clonning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Human rahul = new Human(22, "Rahul");
//        Human twin = new Human(rahul);

        System.out.println(Arrays.toString(rahul.arr));

        /**
         * for creating a clone of object
         * 1. we need to implement Cloneable interface
         * 2. override clone method
         * 3. add throws CloneNotSupportedException
         */
        Human twin = (Human) (rahul.clone());
        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100;
        System.out.println(Arrays.toString(rahul.arr));
        System.out.println(Arrays.toString(twin.arr));


        /**
         * there are two types of copies
         * 1. shallow copy
         * 2. deep copy
         */
    }
}
