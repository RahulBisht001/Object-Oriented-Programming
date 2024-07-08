package staticExample;

import java.util.Arrays;

// Note => The Outer classes can never be static.
public class InnerClass {
    class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Rahul's toString() method";
        }
    }

    public static void main(String[] args) {

        // Test A = new Test("Rahul"); // gives error
        // It is giving me error as this "Test" class itself
        // is dependent on the outer class.

        InnerClass obj = new InnerClass();
        Test A = obj.new Test("Rahul");


        System.out.println(A);

        // what is System.out.println
        /**
         * System is a final class in the java.lang package
         *
         * out is a static variable of System class [ print stream]
         * It is an instance of PrintStream, a class in the java.io
         * package that provides methods to print various data
         * types to an output stream.
         *
         * println is a method of PrintStream class
         */

    }
}
