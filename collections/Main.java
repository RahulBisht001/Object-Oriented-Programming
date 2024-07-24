package collections;


import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(45);
        list.add(23);
        list.add(254);

        Collections.sort(list);
        System.out.println(list);

        /**
         * in java Collection and Collections are two separate things
         *
         * "Collection" is a root interface in java.util package,
         * and it contains subInterfaces like List, Stack, Deque etc.
         *
         * it has method like add, remove, etc.
         * List internally Extends the Collection interface.
         *
         * java
         *   |_ java.util
         *        |_ Collection
         *             |_ List , Stack , Deque etc.
         */

        Collection<String> collection = new ArrayList<>();
        collection.add("Element1");
        collection.add("Element2");
        System.out.println("Collection: " + collection);



        Vector<Integer>vc = new Vector<>();



    }
}
