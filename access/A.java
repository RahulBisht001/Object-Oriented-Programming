package access;

public class A {
    private int size;
    String name;
    int[] arr;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public A(int size, String name) {
        this.size = size;
        this.name = name;
        this.arr = new int[size];
    }
}
