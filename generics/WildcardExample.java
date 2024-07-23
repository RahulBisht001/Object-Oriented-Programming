package generics;

import access.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildcardExample<T extends Number> {

    private Object[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;

    public WildcardExample() {
        this.data = new Object[DEFAULT_SIZE];
    }

    @Override
    public String toString() {
        return "Custom ArrayList is " + Arrays.toString(data);
    }

    public void add(T num) {
        if (this.isFull())
            resize();

        data[size++] = num;
    }

    /**
     * // Method that accepts a list of any type that extends Number
     * public void printList(List<? extends Number> list) {
     * for (Number number : list) {
     * System.out.println(number);
     * }
     * }
     */

    public int size() {
        return size;
    }

    public T remove() {
        T removed = (T) (data[--size]);
        return removed;
    }

    public void set(int idx, T value) {
        data[idx] = value;
    }

    public T get(int idx) {
        return (T) data[idx];
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        for (int i = 0; i < data.length; ++i)
            temp[i] = data[i];

        data = temp;
    }

    /**
     * // Method that accepts a list of any type that extends Number
     * public void printList(List<? extends Number> list) {
     * for (Number number : list) {
     * System.out.println(number);
     * }
     * }
     */

    public void getList(List<? extends Number> list) {
        // do something

        //List<? extends Number>
        // here if you don't pass <? extends Number> and only have <Number>
        // than you can only access Number class, not it's subclasses like Float
        // Integer etc.

    }


    public static void main(String[] args) {

        WildcardExample<Integer> list = new WildcardExample<>();
        list.add(34);

        /**
         * here   WildcardExample<String>list3 is giving error
         * It's because we have restricted out WildcardExample class
         * for a Number class type and its subclasses
         */
//        WildcardExample<String>list3 = new WildcardExample<>();
//        list3.add("Rahul");
//        list3.add("Nikku");
//
//        System.out.println(list3.get(1));

        WildcardExample<Number> list2 = new WildcardExample<>();
        list2.add(2);
        list2.add(23.3);
        list2.add(2.9f);

        System.out.println(list2.toString());
        ArrayList<Number> arr = new ArrayList<>();
        list2.add(45);
        list2.add(83.3);
        list2.add(6.32f);


    }

}
