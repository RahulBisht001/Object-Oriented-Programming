package generics.lambdaFunctions;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(35);
        list.add(325);
        list.add(23);
        list.add(857);

//        for (Integer item : list) {
//            System.out.println(item);
//        }

//        list.forEach((item)->{
//            System.out.println(item);
//        });

        Consumer<Integer> fun = (item) -> System.out.println(item);

        list.forEach(fun);

        Operation sum = (a, b) -> a + b;

    }

    public static int sum(int a, int b) {
        return a + b;
    }
}

interface Operation {
    int sum(int a, int b);
}
