package generics;

import access.A;

public class Main {
    public static void main(String[] args) {

//        CustomArrayList list = new CustomArrayList();
//        list.add(23);
//        System.out.println(list.toString());
//        list.remove();


        GenericArrayList<Integer> list2 = new GenericArrayList<>();
        list2.add(3);
        list2.add(45);

        System.out.println(list2.toString());
        System.out.println(list2.get(0));
        list2.set(0, 12);
        System.out.println(list2.get(0));
        System.out.println(list2.size());

        /**
         * this below code is commented because
         * we have java wildcards where we restrict this
         * T type of out genericArrayList as
         * Number (Integer,Float,Double,Short,Long) etc.
         *
         *
         * check the WildCardExample and its main
         */

//        GenericArrayList<String> list3 = new GenericArrayList<>();
//        list3.add("Rahul");
//        list3.add("Nikku");
//
//        System.out.println(list3.get(1));

    }
}
