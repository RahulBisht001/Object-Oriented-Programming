package generics.comparing;

public class Student implements Comparable<Student> {
    int roll;
    float marks;

    public Student(int roll, float marks) {
        this.roll = roll;
        this.marks = marks;
    }

    @Override
    public String toString() {
//        return "Student{" +
//                "roll=" + roll +
//                ", marks=" + marks +
//                '}';
        return marks + " " + roll + " ";
    }

    @Override
    public int compareTo(Student o) {
        System.out.println("Here");
        int diff = (int) (this.roll - o.roll);

        // if diff == 0 means both are equal
        // if diff < 0 means the second one is bigger
        // if diff > 0 means the first one is bigger


        return diff;
    }
}
