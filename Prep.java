public class Prep {

    public static void main(String[] args) {
//        Student s = new Student();
//        s.getX();
//        s.getX();
//        s.getX();
//
//        Student s2 = new Student();
//        s2.getX();
//        s2.getX();
//
//        Student.show();
//        Student.show();


//        Subject sb = new Subject();
//        sb.show();
        Subject st = new Subject();
        st.getSubject();

    }

    void info() {
        System.out.println("This is info Function");
    }
}

class Student {
    static int x = 0;
    String name = "Rahul Super class";

    public Student getX() {
        x += 40;
        System.out.println("non Static x :" + x);
        return this;
    }

    public static void show() {
        System.out.println("Static Superclass x : " + x);
    }

}

class Subject extends Student {
//    @Override
    // invalid override it is called method hiding for static methods
//    public static void show() {
//        System.out.println("Static Subclass x : " + x);
//    }

    String name = "Rahul Subclass";

    public void getSubject() {
        System.out.println("Interview Prep");
//        System.out.println((Student) this).name);
    }

    @Override
    public Subject getX() {
        x += 40;
        System.out.println("non Static x :" + x);
        return this;
    }
}
