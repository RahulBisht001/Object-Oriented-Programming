package access;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        A obj = new A(3, "Rahul");

        /**
         * using getter and setter for setting and getting
         * the value of private instance variable "num"
         */
        System.out.println(obj.getSize());

        obj.setSize(69);
        System.out.println(obj.getSize());

        System.out.println(Arrays.toString(obj.arr));

        B bb = new B(35, "RB");
        bb.getSize();


//        System.out.println(bb.size);
    }
}
