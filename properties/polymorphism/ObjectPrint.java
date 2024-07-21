package properties.polymorphism;

import java.util.Scanner;

public class ObjectPrint {
    int num;

    public ObjectPrint(int num) {
        this.num = num;
    }

    @Override
    public String toString() {

        return getClass().getName() + "@" + "RahulB001";
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(69);

//        System.out.println(obj.getClass());
        System.out.println(obj);

    }

}
