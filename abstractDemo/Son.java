package abstractDemo;

public class Son extends Parent {

//    long wealth;
    Son(long wealth) {
        this.wealth = wealth;
//        super(wealth);
    }

    @Override
    void career(String name) {
        System.out.println("I am in Son subClass");
        System.out.println("I want to be an " + name);
    }

    @Override
    void info() {
        System.out.println("This is a Concrete information method Child");
    }

    static void hello() {
        System.out.println("Greeting from Abstract Child Class");
    }

    @Override
    void partner(String name, int age) {
        System.out.println("My partner is " + name + " she is " + age);
    }
}
