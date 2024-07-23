package generics;

import java.util.Arrays;

public class GenericArrayList<T> {
    private Object[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;

    public GenericArrayList() {
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
}
