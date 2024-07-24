package clonning;

public class Human implements Cloneable {
    int age;
    String name;
    // added later to explain shallow and deep copy
    int[] arr;

//    public Human(int age, String name) {
//        this.age = age;
//        this.name = name;
//    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{3, 4, 6, 8, 3};
    }

    public Human(Human other) {
        this.age = other.age;
        this.name = other.name;
    }

    // Shallow Copy
//    @Override
//    public Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    // Deep Copy
    @Override
    public Object clone() throws CloneNotSupportedException {
        Human twin = (Human) super.clone(); // this is shallow

        // make a deep copy
        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }

        return twin;
    }
}
