package access;

public class B {
    private int size;
    String name;
    int[] arr;

    protected int getSize() {
        return size;
    }

    void setSize(int size) {
        this.size = size;
    }

    public B(int size, String name) {
        this.size = size;
        this.name = name;
        this.arr = new int[size];
    }

    void info() {
        System.out.println("I am in info");
        System.out.println(size);
    }
}
