package intoduction;

public class WrapperExample {
    public static void main(String[] args) {

        Integer a = 3;
        Integer b = 4;

        swap(a, b);
    }

    public static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }
}
