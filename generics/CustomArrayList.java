package generics;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Creating a custom ArrayList of my own
 * try to use all the previous concepts
 */

public class CustomArrayList {

    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    @Override
    public String toString() {
        return "Custom ArrayList is " + Arrays.toString(data);
    }

    public void add(int num) {
        if (this.isFull())
            resize();

        data[size++] = num;
    }

    public int size() {
        return size;
    }

    public int remove() {
        int removed = data[--size];
        return removed;
    }

    public void set(int idx, int value) {
        data[idx] = value;
    }

    public int get(int idx) {
        return data[idx];
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];

        for (int i = 0; i < data.length; ++i)
            temp[i] = data[i];

        data = temp;
    }
}
