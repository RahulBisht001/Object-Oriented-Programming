package intoduction;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Student S1 = new Student("Rahul", 52, 8.6f);
        Student S2 = new Student("Rahul", 8.7f);

        Student stu = new Student(S2);
        System.out.println(stu.cgpa);

        Student[] S = new Student[5];
        System.out.println(Arrays.toString(S));


        // class = logical construct
        // object = physical reality

        // new keyword => used for dynamic memory allocation
        // This keyword => changes the name with reference variable name

    }
}

class Student {
    int roll;
    String name;
    float cgpa = 0;
    Student(String name, int roll, float cgpa) {
        this.name = name;
        this.roll = roll;
        this.cgpa = cgpa;
    }
    Student(Student other) {
        this.name = other.name;
        this.roll = other.roll;
        this.cgpa = other.cgpa;
    }

    Student(){
        // This is how you can one constructor from another constructor
        // this may be helpful for security

        this("Default Student",45,99.4f);
    }
    Student(String name, float cgpa) {
        this.name = name;
        this.cgpa = cgpa;
    }

    public static void getDetails() {
        System.out.println("Student Details with static method");
    }

    public void performance() {
        System.out.println("Student " + name + "is Brilliant");
    }
}

