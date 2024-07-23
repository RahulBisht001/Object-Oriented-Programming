package generics.comparing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Student rahul = new Student(51, 98.3f);
        Student nikku = new Student(34, 98.6f);
        Student abhinav = new Student(53, 98.3f);
        Student vijay = new Student(56, 99.6f);
        Student ujjwal = new Student(45, 78.3f);
        Student nitesh = new Student(23, 58.6f);

        Student[] list = {rahul, nikku, abhinav, vijay, ujjwal, nitesh};

        // first way
//        if (rahul.marks > nikku.marks)
//            System.out.println("Rahul has more marks");
//        else
//            System.out.println("Nikku has more marks");

        // Second way
        // Using Comparable

//        if (rahul.compareTo(nikku) < 0) {
//            System.out.println("Rahul");
//        } else System.out.println("Nikku");


        System.out.println(Arrays.toString(list));

        // First way: Simple one
        Arrays.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.marks < o2.marks ? -1 : o1.marks == o2.marks ? 0 : 1;
            }
        });

        // Second way: Lambda Expression
        Arrays.sort(list, (o1, o2) ->
                o1.marks < o2.marks
                        ? -1
                        : o1.marks == o2.marks ? 0 : 1);

        System.out.println(Arrays.toString(list));


    }

}
